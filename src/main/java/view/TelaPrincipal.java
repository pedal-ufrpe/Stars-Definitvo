package view;

//setContentAreaField - usado para desabilitar o contorno do botão.

import Genes.Cromossomo;
import Genes.GeradorAleatorio;
import GeradoresScript.GerarArqScript;
import GeradoresScript.GerarEFM;
import GeradoresScript.GerarManutCorret;
import GeradoresScript.GerarManutPrev;
import GeradoresScript.GerarRBD;
import GeradoresScript.GerarSPN;
import com.mxgraph.model.mxCell;
import com.mxgraph.swing.handler.mxKeyboardHandler;
import com.mxgraph.swing.handler.mxRubberband;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.*;
import com.mxgraph.view.mxGraph;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import rode.spn.SPN;
import rode.spn.trem.Estacao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Locale;
import java.util.logging.Level;
import lombok.extern.java.Log;
import rode.rbd.geradorScript.GeradorScript;
import rode.spn.trem.Linha2;
import rode.utilitario.R;
//import newCpn.GerarCPN;

@Log
public class TelaPrincipal extends JFrame { //implements ActionListener, MouseListener, MouseMotionListener {

    private static final int PAINEL_DATA_CENTER = 0;
    private static final int PAINEL_METRO = 1;
    private static TipoPainel PAINEL;
    
    private static final int GERACAO_METR0_DESEPEMPENHO = 1;
    private static final int GERACAO_METR0_DESEPEMPENHO_DISPONIBILIDADE = 0;
    private static int GERACAO_METR0;
    
    private mxGraph graph;
    private mxGraphComponent graphComponent;
    //private final JPanel mxPane;
    private static mxCell cell;
    
    private GerarSPN gSPN = new GerarSPN();
    private GerarRBD gRBD = new GerarRBD();
    private GerarEFM gEFM = new GerarEFM();
    private GerarArqScript arqS = new GerarArqScript();
    private JanelaScripts js;
    
    private GeradorAleatorio gen = new GeradorAleatorio();
    private Cromossomo[] croms;
    
    private static Point mousePos;
    private volatile AcoesGrafo acGrafo;
    private final AcoesGrafo dataCenterGrafo;
    private final AcoesGrafo metroGrafo;
    protected static int lim = 0;
    protected JColorChooser escolherCor;
    public Color corEscolhida = Color.BLACK;
    private mxEvent mxEvent;
    public String resultado;
    
//------------------------------------------------------------------------------    
    public JColorChooser getEscolherCor() {
        return escolherCor;
    }

    public void setEscolherCor(JColorChooser escolherCor) {
        this.escolherCor = escolherCor;
    }

    public Color getCorEscolhida() {
        return corEscolhida;
    }

    public void setCorEscolhida(Color corEscolhida) {
        this.corEscolhida = corEscolhida;
    }

//------------------------------------------------------------------------------    
    public TelaPrincipal() {
        initComponents();
        Locale.setDefault(Locale.US);
        setIconImage(new ImageIcon(getClass().getResource("/ico/medico.png")).getImage());
        PAINEL = TipoPainel.peloValor(tpAreaUtil.getSelectedIndex());
        gRadioMetroDesemp.add(btnMetroDesempenho);
        gRadioMetroDesemp.add(btnMetroDesempenhoDisponibilidade);
        btZoomOut.setEnabled(false);
        resultado = "";
        metroGrafo = geraGrafo(jpMetro ,popupMetro);
        mxGraph grafo = metroGrafo.getGraph();
        mxGraphComponent componenteGrafo = metroGrafo.getGraphComponent();
        grafo.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_STROKEWIDTH, 10);
        grafo.setMultigraph(true);
        grafo.getStylesheet().getDefaultEdgeStyle().remove("endArrow");
        componenteGrafo.getConnectionHandler().addListener("connect", this::aoConectar);
        
        dataCenterGrafo = geraGrafo(jpDatacenter,popup);
        graphComponent = dataCenterGrafo.getGraphComponent();
        js = new JanelaScripts(this,true);
        acGrafo = dataCenterGrafo;
        setLocationRelativeTo(null);
        ButtonModel g = gRadioMetroDesemp.getSelection();
        if(g == btnMetroDesempenho)
            GERACAO_METR0 = GERACAO_METR0_DESEPEMPENHO;
        else if (g == btnMetroDesempenhoDisponibilidade)
            GERACAO_METR0 = GERACAO_METR0_DESEPEMPENHO_DISPONIBILIDADE;
    }
    private void aoConectar(Object sender, mxEventObject evt){
        R.tryCatch(()->{
            mxCell cell = ((mxCell)evt.getProperties().get("cell"));
            if  (cell.getSource().getValue() instanceof Estacao e1
                    && cell.getTarget().getValue() instanceof Estacao e2){
                var l1 = new LinkedList<>(e1.getLinhasAtuais());
                l1.addAll(e2.getLinhasAtuais());
                var linhas = new LinkedList<>(l1.stream().map(Linha2::getNome).distinct().toList());
                linhas.add("[Nova Linha]");
                var opcoes = linhas.toArray(new String[linhas.size()]);
                var escolha = JOptionPane.showOptionDialog(this,
                        "Qual linha conectar?",
                        "Conectar com :",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opcoes,
                        opcoes[0]);
                if(escolha == -1) {
                    metroGrafo.deleteCell(cell);
                    return;
                }
                if(escolha == opcoes.length -1){
                    //new Linha(e1,e2);
                    var linha = new Linha2(e1);
                    linha.adiciona(e1, e2);
                    l1.add(linha);
                    e1.getLinhasAtuais().add(linha);
                    e2.getLinhasAtuais().add(linha);
                    cell.setValue(linha);
                    return;
                }
                try{
                    Linha2 linha = null;
                    for(var l2:e1.getLinhasAtuais()){
                        if(l2.getNome().equals(opcoes[escolha])) {
                            linha = l2;
                            break;
                        }
                    }
                    if (linha == null){
                        for(var l2:e2.getLinhasAtuais()){
                            if(l2.getNome().equals(opcoes[escolha])) {
                                linha = l2;
                                break;
                            }
                        }
                    }
                    linha.adiciona(e1, e2);
                    if(!e1.getLinhasAtuais().contains(linha))
                        e1.getLinhasAtuais().add(linha);
                    if(!e2.getLinhasAtuais().contains(linha))
                        e2.getLinhasAtuais().add(linha);
                    cell.setValue(linha);
                }catch (IllegalArgumentException e){
                    metroGrafo.deleteCell(cell);
                    throw e;
                }
                return;
            }
            throw new Exception("Conexão entre componentes estranhos");
        });
    }
    private void aoDesconectar(Object obj){
        if(obj instanceof Estacao e){
            e.getLinhasAtuais().forEach(l-> l.remover(e));
        }
        else if(obj instanceof Linha2 l){
            l.deletar();
        }
    }
    private AcoesGrafo geraGrafo(final JPanel painel, JPopupMenu pop){
        AcoesGrafo grafo = new AcoesGrafo();
        final mxGraphComponent graphComponent = grafo.getGraphComponent();

        //graphComponent.setGridStyle(2);
        graphComponent.setPageVisible(false);
        graphComponent.setGridVisible(true); // habilita grades na página
        graphComponent.setCenterZoom(true);
        graphComponent.setToolTips(true); // mostra informações do objeto
        graphComponent.setConnectable(true); // (false) não permite ligação apartir dos grafos.

        addPopup(graphComponent.getGraphControl(), pop,this);
        painel.setLayout(new BorderLayout());
        painel.setBorder(new EmptyBorder(1, 1, 1, 1));
        painel.add(graphComponent, BorderLayout.CENTER);
        new mxRubberband(graphComponent); // permite selecionar vários objetos com um slayer semi transparente.
        new mxKeyboardHandler(graphComponent); //apagar na tecla Delete do teclado.

        graphComponent.getGraphControl().addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent me) {
                mousePos = graphComponent.getMousePosition();
                if(mousePos == null) return;
                cell = (mxCell) graphComponent.getCellAt(mousePos.x, mousePos.y);
                lblX.setText(mousePos.x + "");
                lblY.setText(mousePos.y + "");
            }
            @Override
            public void mouseDragged(MouseEvent e) {
                //System.out.println(e.get());
                //graph.setCloneInvalidEdges(false);
            }
        });

        graphComponent.addMouseWheelListener(ev -> {
            if (ev.getWheelRotation() < 0) {
                graphComponent.zoomIn();
            } else {
                graphComponent.zoomOut();
            }
        });
        return grafo;
    }

    

//------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popup = new javax.swing.JPopupMenu();
        popInsert = new javax.swing.JMenuItem();
        popDelete = new javax.swing.JMenuItem();
        popInfo = new javax.swing.JMenuItem();
        popProp = new javax.swing.JMenuItem();
        popupMetro = new javax.swing.JPopupMenu();
        popMetroInserir = new javax.swing.JMenuItem();
        popMetroRemover = new javax.swing.JMenuItem();
        popMetroDesassociar = new javax.swing.JMenuItem();
        popMetroPropriedades = new javax.swing.JMenuItem();
        gRadioMetroDesemp = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnStatus = new javax.swing.JPanel();
        JLabel5 = new javax.swing.JLabel();
        lblOpAtiva = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblY = new javax.swing.JLabel();
        pnMenuBar = new javax.swing.JPanel();
        btOpen = new javax.swing.JButton();
        btNew = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btBack = new javax.swing.JButton();
        btForward = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btCpn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        btView = new javax.swing.JButton();
        btGrid = new javax.swing.JButton();
        btZoomOut = new javax.swing.JButton();
        btZoomIn = new javax.swing.JButton();
        btBackground = new javax.swing.JButton();
        btRbd = new javax.swing.JButton();
        btSpn = new javax.swing.JButton();
        btEfm = new javax.swing.JButton();
        btCorret = new javax.swing.JButton();
        btPrevent = new javax.swing.JButton();
        tpAreaUtil = new javax.swing.JTabbedPane();
        jpDatacenter = new javax.swing.JPanel();
        jpMetro = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuSalvar = new javax.swing.JMenuItem();
        menuAbrir = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        menuSair = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuCalcular = new javax.swing.JMenu();
        menuCalcSPN = new javax.swing.JMenuItem();
        menuCalcRBD = new javax.swing.JMenuItem();
        menuCalcEFM = new javax.swing.JMenuItem();
        menuCalcCPN = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        menuAlgGen = new javax.swing.JMenuItem();
        menuAlgDif = new javax.swing.JMenuItem();
        menuNSGA2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuCalcManutCorret = new javax.swing.JMenuItem();
        menuCalcManutPrev = new javax.swing.JMenuItem();
        menuPlaceHolder = new javax.swing.JMenu();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenu3 = new javax.swing.JMenu();
        btnMetroDesempenho = new javax.swing.JRadioButtonMenuItem();
        btnMetroDesempenhoDisponibilidade = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnMetroMetricaVelocidade = new javax.swing.JRadioButtonMenuItem();
        btnMetroMetricaDisponibilidade = new javax.swing.JRadioButtonMenuItem();
        btnMetroMetricaTempoEspera = new javax.swing.JRadioButtonMenuItem();
        btnMetroMetricaIntervaloTrem = new javax.swing.JRadioButtonMenuItem();

        popInsert.setText("Inserir Componente");
        popInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popInsertActionPerformed(evt);
            }
        });
        popup.add(popInsert);

        popDelete.setText("Apagar Componente");
        popDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popDeleteActionPerformed(evt);
            }
        });
        popup.add(popDelete);

        popInfo.setText("Informações");
        popInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popInfoActionPerformed(evt);
            }
        });
        popup.add(popInfo);

        popProp.setText("Propriedades");
        popProp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popPropActionPerformed(evt);
            }
        });
        popup.add(popProp);

        popMetroInserir.setText("Inserir");
        popMetroInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMetroInserirActionPerformed(evt);
            }
        });
        popupMetro.add(popMetroInserir);

        popMetroRemover.setText("Remover");
        popMetroRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMetroRemoverActionPerformed(evt);
            }
        });
        popupMetro.add(popMetroRemover);

        popMetroDesassociar.setText("Desassociar");
        popMetroDesassociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMetroDesassociarActionPerformed(evt);
            }
        });
        popupMetro.add(popMetroDesassociar);

        popMetroPropriedades.setText("Propriedades");
        popMetroPropriedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                popMetroPropriedadesActionPerformed(evt);
            }
        });
        popupMetro.add(popMetroPropriedades);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Iniciação Científica");
        setFocusable(false);
        setName("Form"); // NOI18N
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        pnStatus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        JLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel5.setText("Op ativa:");

        lblOpAtiva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpAtiva.setText("<nenhuma>");

        jLabel1.setText("X:");

        lblX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblX.setText("0");

        jLabel2.setText("Y:");

        lblY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblY.setText("0");

        javax.swing.GroupLayout pnStatusLayout = new javax.swing.GroupLayout(pnStatus);
        pnStatus.setLayout(pnStatusLayout);
        pnStatusLayout.setHorizontalGroup(
            pnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(lblY, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOpAtiva)
                .addContainerGap())
        );

        pnStatusLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblX, lblY});

        pnStatusLayout.setVerticalGroup(
            pnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(JLabel5)
                .addComponent(lblOpAtiva))
            .addGroup(pnStatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(lblX)
                .addComponent(jLabel2)
                .addComponent(lblY))
        );

        pnMenuBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnMenuBar.setPreferredSize(new java.awt.Dimension(174, 30));

        btOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/open.png"))); // NOI18N
        btOpen.setToolTipText("Abrir");
        btOpen.setBorder(null);
        btOpen.setBorderPainted(false);
        btOpen.setContentAreaFilled(false);
        btOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btOpen.setFocusable(false);
        btOpen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });

        btNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/new.png"))); // NOI18N
        btNew.setToolTipText("Novo");
        btNew.setBorder(null);
        btNew.setBorderPainted(false);
        btNew.setContentAreaFilled(false);
        btNew.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btNew.setFocusable(false);
        btNew.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNew.setPreferredSize(new java.awt.Dimension(24, 25));
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/save.png"))); // NOI18N
        btSave.setToolTipText("Salvar");
        btSave.setBorder(null);
        btSave.setBorderPainted(false);
        btSave.setContentAreaFilled(false);
        btSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSave.setFocusable(false);
        btSave.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/redo.png"))); // NOI18N
        btBack.setToolTipText("Desfazer");
        btBack.setBorder(null);
        btBack.setBorderPainted(false);
        btBack.setContentAreaFilled(false);
        btBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btBack.setFocusable(false);
        btBack.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btForward.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/undo.png"))); // NOI18N
        btForward.setToolTipText("Refazer");
        btForward.setBorder(null);
        btForward.setBorderPainted(false);
        btForward.setContentAreaFilled(false);
        btForward.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btForward.setFocusable(false);
        btForward.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btForward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btForwardActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btCpn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/cpn5.png"))); // NOI18N
        btCpn.setToolTipText("CPN");
        btCpn.setBorder(null);
        btCpn.setBorderPainted(false);
        btCpn.setContentAreaFilled(false);
        btCpn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btCpn.setFocusable(false);
        btCpn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btCpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCpnActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        btView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/eyesoff.png"))); // NOI18N
        btView.setToolTipText("Vizualizar páginas");
        btView.setBorder(null);
        btView.setBorderPainted(false);
        btView.setContentAreaFilled(false);
        btView.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btView.setFocusable(false);
        btView.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViewActionPerformed(evt);
            }
        });

        btGrid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/grid3.png"))); // NOI18N
        btGrid.setToolTipText("Grades visíveis");
        btGrid.setBorder(null);
        btGrid.setBorderPainted(false);
        btGrid.setContentAreaFilled(false);
        btGrid.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btGrid.setFocusable(false);
        btGrid.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGrid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGridActionPerformed(evt);
            }
        });

        btZoomOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/zoomout.png"))); // NOI18N
        btZoomOut.setToolTipText("Zoom out");
        btZoomOut.setBorder(null);
        btZoomOut.setBorderPainted(false);
        btZoomOut.setContentAreaFilled(false);
        btZoomOut.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btZoomOut.setFocusable(false);
        btZoomOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btZoomOut.setMinimumSize(new java.awt.Dimension(24, 24));
        btZoomOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZoomOutActionPerformed(evt);
            }
        });

        btZoomIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/zoomin.png"))); // NOI18N
        btZoomIn.setToolTipText("Zoom in");
        btZoomIn.setBorder(null);
        btZoomIn.setBorderPainted(false);
        btZoomIn.setContentAreaFilled(false);
        btZoomIn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btZoomIn.setFocusable(false);
        btZoomIn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btZoomIn.setMinimumSize(new java.awt.Dimension(24, 24));
        btZoomIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btZoomInActionPerformed(evt);
            }
        });

        btBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/fill.png"))); // NOI18N
        btBackground.setToolTipText("Cor de fundo");
        btBackground.setBorder(null);
        btBackground.setBorderPainted(false);
        btBackground.setContentAreaFilled(false);
        btBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btBackground.setFocusable(false);
        btBackground.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBackground.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackgroundActionPerformed(evt);
            }
        });

        btRbd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/rbd5.png"))); // NOI18N
        btRbd.setToolTipText("RBD");
        btRbd.setBorder(null);
        btRbd.setBorderPainted(false);
        btRbd.setContentAreaFilled(false);
        btRbd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btRbd.setFocusable(false);
        btRbd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRbdActionPerformed(evt);
            }
        });

        btSpn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/spn5.png"))); // NOI18N
        btSpn.setToolTipText("SPN");
        btSpn.setBorder(null);
        btSpn.setBorderPainted(false);
        btSpn.setContentAreaFilled(false);
        btSpn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btSpn.setFocusable(false);
        btSpn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSpn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSpnActionPerformed(evt);
            }
        });

        btEfm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/efm5.png"))); // NOI18N
        btEfm.setToolTipText("EFM");
        btEfm.setBorder(null);
        btEfm.setBorderPainted(false);
        btEfm.setContentAreaFilled(false);
        btEfm.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btEfm.setFocusable(false);
        btEfm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEfm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEfmActionPerformed(evt);
            }
        });

        btCorret.setText("Corret");
        btCorret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCorretActionPerformed(evt);
            }
        });

        btPrevent.setText("Prevent");
        btPrevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPreventActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuBarLayout = new javax.swing.GroupLayout(pnMenuBar);
        pnMenuBar.setLayout(pnMenuBarLayout);
        pnMenuBarLayout.setHorizontalGroup(
            pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btOpen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btForward, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCpn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btEfm, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btRbd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCorret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btPrevent)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btView, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(btGrid, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btZoomOut, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btZoomIn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuBarLayout.setVerticalGroup(
            pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuBarLayout.createSequentialGroup()
                .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btCorret)
                        .addComponent(btPrevent))
                    .addGroup(pnMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btNew, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btOpen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBack, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btForward, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator3)
                        .addComponent(jSeparator4)
                        .addComponent(btCpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(btView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btZoomOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btZoomIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRbd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSpn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btEfm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpAreaUtil.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tpAreaUtilStateChanged(evt);
            }
        });
        tpAreaUtil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tpAreaUtilFocusGained(evt);
            }
        });

        jpDatacenter.setToolTipText("");

        javax.swing.GroupLayout jpDatacenterLayout = new javax.swing.GroupLayout(jpDatacenter);
        jpDatacenter.setLayout(jpDatacenterLayout);
        jpDatacenterLayout.setHorizontalGroup(
            jpDatacenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jpDatacenterLayout.setVerticalGroup(
            jpDatacenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        tpAreaUtil.addTab("Data-center", jpDatacenter);

        javax.swing.GroupLayout jpMetroLayout = new javax.swing.GroupLayout(jpMetro);
        jpMetro.setLayout(jpMetroLayout);
        jpMetroLayout.setHorizontalGroup(
            jpMetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );
        jpMetroLayout.setVerticalGroup(
            jpMetroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
        );

        tpAreaUtil.addTab("Metro", jpMetro);

        jMenuBar1.setBorder(null);

        menuArquivo.setText("Arquivo");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/new.png"))); // NOI18N
        jMenuItem1.setText("Novo");
        menuArquivo.add(jMenuItem1);

        menuSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/save.png"))); // NOI18N
        menuSalvar.setText("Salvar");
        menuSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalvarActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSalvar);

        menuAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/open.png"))); // NOI18N
        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArquivo.add(menuAbrir);
        menuArquivo.add(jSeparator6);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        menuArquivo.add(menuSair);

        jMenuItem4.setText("jMenuItem4");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuArquivo.add(jMenuItem4);

        jMenuBar1.add(menuArquivo);

        menuCalcular.setText("Calcular");

        menuCalcSPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/spn5.png"))); // NOI18N
        menuCalcSPN.setText("SPN");
        menuCalcSPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcSPNActionPerformed(evt);
            }
        });
        menuCalcular.add(menuCalcSPN);

        menuCalcRBD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/rbd5.png"))); // NOI18N
        menuCalcRBD.setText("RBD");
        menuCalcRBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcRBDActionPerformed(evt);
            }
        });
        menuCalcular.add(menuCalcRBD);

        menuCalcEFM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/efm5.png"))); // NOI18N
        menuCalcEFM.setText("EFM");
        menuCalcEFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcEFMActionPerformed(evt);
            }
        });
        menuCalcular.add(menuCalcEFM);

        menuCalcCPN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ico/cpn5.png"))); // NOI18N
        menuCalcCPN.setText("CPN");
        menuCalcular.add(menuCalcCPN);

        jMenuBar1.add(menuCalcular);

        jMenu1.setText("Mod. Otimização");

        menuAlgGen.setText("Algoritimo Genetico");
        menuAlgGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlgGenActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlgGen);

        menuAlgDif.setText("Alg. Diferencial ");
        menuAlgDif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAlgDifActionPerformed(evt);
            }
        });
        jMenu1.add(menuAlgDif);

        menuNSGA2.setText("NSGA II");
        menuNSGA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNSGA2ActionPerformed(evt);
            }
        });
        jMenu1.add(menuNSGA2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mod. Manutenção");

        menuCalcManutCorret.setText("Manut. Corret.");
        menuCalcManutCorret.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcManutCorretActionPerformed(evt);
            }
        });
        jMenu2.add(menuCalcManutCorret);

        menuCalcManutPrev.setText("Manut. Prev.");
        menuCalcManutPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalcManutPrevActionPerformed(evt);
            }
        });
        jMenu2.add(menuCalcManutPrev);

        jMenuBar1.add(jMenu2);

        menuPlaceHolder.setText("Prop. Geraçao");
        menuPlaceHolder.add(jSeparator7);

        jMenu3.setText("Geração de modelos");
        jMenu3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu3ItemStateChanged(evt);
            }
        });

        btnMetroDesempenho.setText("Apenas desempenho");
        btnMetroDesempenho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetroDesempenhoActionPerformed(evt);
            }
        });
        jMenu3.add(btnMetroDesempenho);

        btnMetroDesempenhoDisponibilidade.setSelected(true);
        btnMetroDesempenhoDisponibilidade.setText("Desempenho e disponibilidade");
        btnMetroDesempenhoDisponibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMetroDesempenhoDisponibilidadeActionPerformed(evt);
            }
        });
        jMenu3.add(btnMetroDesempenhoDisponibilidade);

        menuPlaceHolder.add(jMenu3);

        jMenu4.setText("Metricas");

        btnMetroMetricaVelocidade.setSelected(true);
        btnMetroMetricaVelocidade.setText("Tempo de viagem");
        jMenu4.add(btnMetroMetricaVelocidade);

        btnMetroMetricaDisponibilidade.setSelected(true);
        btnMetroMetricaDisponibilidade.setText("Disponibilidade");
        jMenu4.add(btnMetroMetricaDisponibilidade);

        btnMetroMetricaTempoEspera.setSelected(true);
        btnMetroMetricaTempoEspera.setText("Tempo de Espera");
        jMenu4.add(btnMetroMetricaTempoEspera);

        btnMetroMetricaIntervaloTrem.setSelected(true);
        btnMetroMetricaIntervaloTrem.setText("Intervalo entre trens");
        jMenu4.add(btnMetroMetricaIntervaloTrem);

        menuPlaceHolder.add(jMenu4);

        jMenuBar1.add(menuPlaceHolder);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
            .addComponent(tpAreaUtil)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpAreaUtil, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tpAreaUtil.getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(816, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        R.tryCatch(()->{
            int sair = JOptionPane.showConfirmDialog(null, "Deseja sair da aplicação?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (sair == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });
    }//GEN-LAST:event_menuSairActionPerformed
//------------------------------------------------------------------------------
    private void popInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popInsertActionPerformed
        dataCenterGrafo.insertVertex(mousePos.x, mousePos.y,new Componente());
//        contComp++;
    }//GEN-LAST:event_popInsertActionPerformed
//------------------------------------------------------------------------------
    private void popDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popDeleteActionPerformed
        dataCenterGrafo.deleteCell(cell);
        cell = null;
    }//GEN-LAST:event_popDeleteActionPerformed

//------------------------------------------------------------------------------
    private void popInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popInfoActionPerformed
        dataCenterGrafo.infoGraph();
    }//GEN-LAST:event_popInfoActionPerformed
//------------------------------------------------------------------------------
    private void popPropActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popPropActionPerformed
        R.tryCatch(()->{
            JanelaPropriedades tp = new JanelaPropriedades(this, true);
            if (cell == null) return;
            Componente prop = (Componente) cell.getValue();
            tp.iniciaForm(prop);
            tp.setLocationRelativeTo(null);
            tp.setVisible(true);
        });
    }//GEN-LAST:event_popPropActionPerformed
//------------------------------------------------------------------------------
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        graphComponent.refresh(); //atualizar componente.
    }//GEN-LAST:event_formWindowActivated
//------------------------------------------------------------------------------
    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        // TODO add your handling code here:
        /*JanelaGrafo jg = new JanelaGrafo();
        jg.pnJanela.add(mxPane);
        jg.pnJanela.add(popup);
        jg.setVisible(true);*/
    }//GEN-LAST:event_btNewActionPerformed
//------------------------------------------------------------------------------
    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        R.tryCatch(()->{
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos do tipo (*.xml)", "xml");

            //Definindo pasta onde devem ser salvos os arquivos do usuário.
            String diretorioBase = System.getProperty("user.home") + "/desktop";
            File dir = new File(diretorioBase);

            JFileChooser arquivo = new JFileChooser();
            arquivo.setCurrentDirectory(dir); // setando o caminho para salvar arquivos do usuário.
            arquivo.setAcceptAllFileFilterUsed(false); //aceitar mostrar todos os tipos de arquivos na lista.
            arquivo.addChoosableFileFilter(filter);
            arquivo.setDialogTitle("Salvar Arquivo..."); // titulo da janela
            arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY); //tipo de arquivos mostrados
            arquivo.setFileFilter(filter); //setando o filtro.

            int arq = arquivo.showSaveDialog(this); // atenção gravar-showSaveDialog

            String nomeArquivo = "";

            if (arq == JFileChooser.APPROVE_OPTION) {
                nomeArquivo = arquivo.getSelectedFile().getAbsolutePath();

                if (!nomeArquivo.contains(".")) {
                    nomeArquivo += ".xml";
                }
            }

            Object[] vertices = acGrafo.getVertices();
            Object[] arestas = acGrafo.getArestas();


            try(var fos = new FileOutputStream(nomeArquivo);
                var encoder = new XMLEncoder(fos)) {

                encoder.writeObject(vertices.length + arestas.length);

                for (Object obj : vertices) {
                    encoder.writeObject(obj);
                }
                for (Object obj : arestas) {
                    encoder.writeObject(obj);
                }
            }


        });
        //criando filtro de arquivos, (nomeNaLista, extensão)

    }//GEN-LAST:event_btSaveActionPerformed
//------------------------------------------------------------------------------
    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btBackActionPerformed
//------------------------------------------------------------------------------
    private void btForwardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btForwardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btForwardActionPerformed
//------------------------------------------------------------------------------
    private void btCpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCpnActionPerformed
        // TODO add your handling code here:
//        GerarCPN_ARCH_A cpn = new GerarCPN_ARCH_A();
//        GerarCPNTestes cpn = new GerarCPNTestes();
//        GerarCPNTestes_B cpn = new GerarCPNTestes_B();
//        GerarArquivoScriptCPN cpn = new GerarArquivoScriptCPN();
//        cpn.imprimirScript();
        //GerarCPN cpn = new GerarCPN();
        //cpn.imprimirScript(acGrafo.getVertices());
         switch(PAINEL){
            // <editor-fold defaultstate="collapsed" desc="PAINEL_DATA_CENTER">
            case PAINEL_DATA_CENTER ->{}
                
            // </editor-fold>
            // <editor-fold defaultstate="collapsed" desc="PAINEL_METRO">
            case PAINEL_METRO ->{}
                
                
            // </editor-fold>
        }
    }//GEN-LAST:event_btCpnActionPerformed
//------------------------------------------------------------------------------
    private void btViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViewActionPerformed
        R.tryCatch(()->{
            boolean status = graphComponent.isPageVisible();
            if (!status) {
                dataCenterGrafo.getGraphComponent().setPageVisible(true);
                metroGrafo.getGraphComponent().setPageVisible(true);
                dataCenterGrafo.getGraphComponent().refresh();
                metroGrafo.getGraphComponent().refresh();
                btView.setIcon(new ImageIcon(getClass().getResource("/ico/eyesblue.png")));
                btView.repaint();
            } else {
                dataCenterGrafo.getGraphComponent().setPageVisible(false);
                metroGrafo.getGraphComponent().setPageVisible(false);
                dataCenterGrafo.getGraphComponent().refresh();
                metroGrafo.getGraphComponent().refresh();
                btView.setIcon(new ImageIcon(getClass().getResource("/ico/eyesoff.png")));
                btView.repaint();
            }
        });
//        graphComponent.repaint();
    }//GEN-LAST:event_btViewActionPerformed
//------------------------------------------------------------------------------
    private void btGridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGridActionPerformed
        R.tryCatch(()->{
            boolean status = graphComponent.isGridVisible();
            if (!status) {
                dataCenterGrafo.getGraphComponent().setGridVisible(true);
                metroGrafo.getGraphComponent().setGridVisible(true);
                btGrid.setIcon(new ImageIcon(getClass().getResource("/ico/grid3.png")));
                btGrid.repaint();
            } else {
                dataCenterGrafo.getGraphComponent().setGridVisible(false);
                metroGrafo.getGraphComponent().setGridVisible(false);
                btGrid.setIcon(new ImageIcon(getClass().getResource("/ico/grid3off.png")));
                btGrid.repaint();
            }
            graphComponent.repaint();
        });
    }//GEN-LAST:event_btGridActionPerformed
//------------------------------------------------------------------------------
    private void btZoomOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZoomOutActionPerformed
        // TODO add your handling code here:
        R.tryCatch(()->{
            if (lim <= 10) {
                btZoomIn.setEnabled(true);
            }
            if (lim > 0) {
                graphComponent.zoomOut();
                lim--;
            }
            if (lim <= 0 ) {
                btZoomOut.setEnabled(false);
            }
        });
    }//GEN-LAST:event_btZoomOutActionPerformed
//------------------------------------------------------------------------------
    private void btZoomInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btZoomInActionPerformed
        // TODO add your handling code here:
        R.tryCatch(()->{
            if (lim >= 0) {
                btZoomOut.setEnabled(true);
            }
            if (lim < 10) {
                graphComponent.zoomIn();
                lim++;
            }
            if (lim >= 10) {
                btZoomIn.setEnabled(false);
            }
        });
    }//GEN-LAST:event_btZoomInActionPerformed

//------------------------------------------------------------------------------
    private void btBackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackgroundActionPerformed
        // TODO add your handling code here:
        R.tryCatch(()->{
            escolherCor = new JColorChooser();
            corEscolhida = escolherCor.showDialog(null, "Ecolha a cor", Color.white);
            if (cell != null) {
            } else {
                graphComponent.getViewport().setBackground(corEscolhida);
                graphComponent.setOpaque(true);
                graphComponent.refresh();

            }
        });
    }//GEN-LAST:event_btBackgroundActionPerformed
//------------------------------------------------------------------------------
    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
//        mxCell = (mxCell) graphComponent.getCellAt(evt.getX(), evt.getY());
//        System.out.println("a");
//            
//        if (evt.isPopupTrigger() && (!(mxCell.getValue().equals(null)))) {
//            if(mxCell.isEdge()){
//                Componente propriedades = (Componente) mxCell.getValue();
//                System.out.println("mttf " + propriedades.getMttf() + " mttr " + propriedades.getMttr());
//            }
//            addPopup(graphComponent, popup);
//        }
    }//GEN-LAST:event_formMouseReleased

    private void btRbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRbdActionPerformed

        R.tryCatch(()->{
            switch(PAINEL){
                // <editor-fold defaultstate="collapsed" desc="PAINEL_DATA_CENTER">
                case PAINEL_DATA_CENTER -> {
                    GerarRBD rbd = new GerarRBD();
                    rbd.imprimirScript(metroGrafo.getVertices());
                }
                // </editor-fold>
                // <editor-fold defaultstate="collapsed" desc="PAINEL_METRO">
                case PAINEL_METRO ->{}
                    // </editor-fold>
            }
        });
    }//GEN-LAST:event_btRbdActionPerformed

    private void btSpnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSpnActionPerformed
        R.tryCatch(()->{
            var js = new JanelaScripts(this, true);
            var txt = "";
            js.tipo = PAINEL;
            switch(js.tipo){
                // <editor-fold defaultstate="collapsed" desc="PAINEL_DATA_CENTER">
                case PAINEL_DATA_CENTER -> {
                    GerarSPN geradorSPN = new GerarSPN();
                    txt = geradorSPN.imprimirScript(dataCenterGrafo.getVertices());
                    js.taScripts.setText(txt);
                    js.setVisible(true);
                }
                // </editor-fold>
                // <editor-fold defaultstate="collapsed" desc="PAINEL_METRO">
                case PAINEL_METRO -> {
                    var spns = SPN.criar2(metroGrafo.getVertices(), !btnMetroDesempenhoDisponibilidade.isSelected());
                    for (var spn : spns) {
                        if (btnMetroMetricaDisponibilidade.isSelected())
                            if(btnMetroDesempenhoDisponibilidade.isSelected())
                                spn.adicionaMetricaDisponibilidade();
                            else
                                throw new IllegalArgumentException("É preciso gerar a disponibilidade");
                        if (btnMetroMetricaVelocidade.isSelected())
                            spn.adicionaMetricaVelocidade();
                        if(btnMetroMetricaIntervaloTrem.isSelected())
                            spn.adicionaMetricaIntervaloEntreTrens();
                        if(btnMetroMetricaTempoEspera.isSelected())
                            spn.adicionaMetricaTempoEspera();
                    }

                    txt = GeradorScript.criaScript(spns);
                    js.taScripts.setText(txt);
                    js.spn = spns;
                    js.setVisible(true);
                }
                // </editor-fold>
            }
        });
        
    }//GEN-LAST:event_btSpnActionPerformed

    private void menuCalcRBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcRBDActionPerformed
        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();

            if(!(vertices.length == 0)){
                String script = gRBD.gerarScript(vertices);
                JanelaResultados jr = new JanelaResultados(this, true);
                System.out.println(script);
                jr.taResult.setText(this.arqS.calcRBD(script));
                jr.setVisible(true);
            } else {
                throw new IllegalArgumentException("Nenhum esquema encontrado.");
                //JOptionPane.showMessageDialog(this, "Nenhum esquema encontrado.");
            }
        });
    }//GEN-LAST:event_menuCalcRBDActionPerformed

    private void menuCalcSPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcSPNActionPerformed
//        GerarSPN spn = new GerarSPN();
//        GerarArqScript calcSpn = new GerarArqScript();

        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();

            if(!(vertices.length == 0)){
                String script = gSPN.gerarScript(vertices);
                JanelaResultados jr = new JanelaResultados(this, true);
                jr.taResult.setText(this.arqS.calcSPN(script));
                jr.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Nenhum esquema encontrado.");
            }
        });
    }//GEN-LAST:event_menuCalcSPNActionPerformed

    private void menuCalcEFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcEFMActionPerformed
        R.tryCatch(()->{
            JanelaPropEFM propEfm = new JanelaPropEFM(this, true);
            EfmDados efmD = new EfmDados();
            propEfm.iniciaForm(efmD);
            propEfm.setVisible(true);

            Object[] vertices = acGrafo.getVertices();
            if(!(vertices.length == 0)){
                boolean calcAv = efmD.isCalcAval();
                double aval;
                if (calcAv == false){
                    aval = efmD.getAvaliability();
                }else{
                    String scriptAv = gSPN.gerarScript(vertices);

                    aval = this.arqS.calcAval(scriptAv);
                }

                String script = gEFM.gerarScript(vertices);
                JanelaResultados jr = new JanelaResultados(this, true);

                double period = efmD.getPeriod();
                double ec = efmD.getElectricityCost();
                double de = efmD.getDemandEnergy();
                jr.taResult.setText(this.arqS.calcEFM(script, aval, period, ec, de));
                jr.setVisible(true);
            }
        });
    }//GEN-LAST:event_menuCalcEFMActionPerformed

    private void btEfmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEfmActionPerformed
         R.tryCatch(()->{
             switch(PAINEL){
                 // <editor-fold defaultstate="collapsed" desc="PAINEL_DATA_CENTER">
                 case PAINEL_DATA_CENTER -> {
                     GerarEFM efm = new GerarEFM();
                     efm.imprimirScript(acGrafo.getVertices());
                 }
                 // </editor-fold>
                 // <editor-fold defaultstate="collapsed" desc="PAINEL_METRO">
                 case PAINEL_METRO ->{

                 }
                 // </editor-fold>
             }
         });
    }//GEN-LAST:event_btEfmActionPerformed

    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
        R.tryCatch(()->{
            //criando filtro de arquivos, (nomeNaLista, extensão) pode ser um vetor com vários filtros
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto (.xml)", "xml");

            //Definindo pasta onde devem ser salvos os arquivos do usuário.
            String diretorioBase = System.getProperty("user.home") + "/desktop";
            File dir = new File(diretorioBase);

            JFileChooser arquivo = new JFileChooser();
            arquivo.setCurrentDirectory(dir); // setando o caminho para salvar arquivos do usuário.
            arquivo.setAcceptAllFileFilterUsed(false); //aceitar mostrar todos os tipos de arquivos na lista.
            arquivo.addChoosableFileFilter(filter);
            arquivo.setDialogTitle("Procurar Arquivo..."); // titulo da janela
            arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY); //tipo de arquivos mostrados
//            arquivo.setFileFilter(filter); //setando o filtro.

            int arq = arquivo.showOpenDialog(this); // atenção abrir-showOpenDialog

            String nomeArquivo = "";

            if (arq == JFileChooser.APPROVE_OPTION) {
                nomeArquivo = arquivo.getSelectedFile().getAbsolutePath();
                System.out.println(nomeArquivo);

                FileInputStream fis = new FileInputStream(new File(nomeArquivo));
                XMLDecoder decoder = new XMLDecoder(fis);
                mxCell cell = new mxCell();
                int qtdcells = (Integer) decoder.readObject();
                while (!(qtdcells == 0)){
                    cell = (mxCell) decoder.readObject();
                    acGrafo.insertCell(cell);
                    qtdcells--;
                }
                System.out.println("fim");
                decoder.close();
                fis.close();
            }
        });
    }//GEN-LAST:event_btOpenActionPerformed

    private void menuSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalvarActionPerformed
        //criando filtro de arquivos, (nomeNaLista, extensão)
       R.tryCatch(()->{
           FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos do tipo (*.xml)", "xml");

           //Definindo pasta onde devem ser salvos os arquivos do usuário.
           String diretorioBase = System.getProperty("user.home") + "/desktop";
           File dir = new File(diretorioBase);

           JFileChooser arquivo = new JFileChooser();
           arquivo.setCurrentDirectory(dir); // setando o caminho para salvar arquivos do usuário.
           arquivo.setAcceptAllFileFilterUsed(false); //aceitar mostrar todos os tipos de arquivos na lista.
           arquivo.addChoosableFileFilter(filter);
           arquivo.setDialogTitle("Salvar Arquivo..."); // titulo da janela
           arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY); //tipo de arquivos mostrados
           arquivo.setFileFilter(filter); //setando o filtro.

           int arq = arquivo.showSaveDialog(this); // atenção gravar-showSaveDialog

           String nomeArquivo = "";

           if (arq == JFileChooser.APPROVE_OPTION) {
               nomeArquivo = arquivo.getSelectedFile().getAbsolutePath();

               if (!nomeArquivo.contains(".")) {
                   nomeArquivo += ".xml";
               }
           }

           Object[] vertices = acGrafo.getVertices();
           Object[] arestas = acGrafo.getArestas();

           FileOutputStream fos = new FileOutputStream(new File(nomeArquivo));
           XMLEncoder encoder = new XMLEncoder(fos);
           encoder.writeObject(vertices.length + arestas.length);

           for (Object obj : vertices){
               encoder.writeObject(obj);
           }
           for (Object obj : arestas){
               encoder.writeObject(obj);
           }

           encoder.close();
           fos.close();
       });
    }//GEN-LAST:event_menuSalvarActionPerformed

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        R.tryCatch(()->{
            //criando filtro de arquivos, (nomeNaLista, extensão) pode ser um vetor com vários filtros
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivos de texto (.xml)", "xml");

            //Definindo pasta onde devem ser salvos os arquivos do usuário.
            String diretorioBase = System.getProperty("user.home") + "/desktop";
            File dir = new File(diretorioBase);

            JFileChooser arquivo = new JFileChooser();
            arquivo.setCurrentDirectory(dir); // setando o caminho para salvar arquivos do usuário.
            arquivo.setAcceptAllFileFilterUsed(false); //aceitar mostrar todos os tipos de arquivos na lista.
            arquivo.addChoosableFileFilter(filter);
            arquivo.setDialogTitle("Procurar Arquivo..."); // titulo da janela
            arquivo.setFileSelectionMode(JFileChooser.FILES_ONLY); //tipo de arquivos mostrados
//            arquivo.setFileFilter(filter); //setando o filtro.

            int arq = arquivo.showOpenDialog(this); // atenção abrir-showOpenDialog

            String nomeArquivo = "";

            if (arq == JFileChooser.APPROVE_OPTION) {
                nomeArquivo = arquivo.getSelectedFile().getAbsolutePath();
                System.out.println(nomeArquivo);

                try {
                    FileInputStream fis = new FileInputStream(new File(nomeArquivo));
                    XMLDecoder decoder = new XMLDecoder(fis);
                    mxCell cell = new mxCell();
                    int qtdcells = (Integer) decoder.readObject();
                    while (!(qtdcells == 0)){
                        cell = (mxCell) decoder.readObject();
                        acGrafo.insertCell(cell);
                        qtdcells--;
                    }
                    System.out.println("fim");
                    decoder.close();
                    fis.close();
                }  catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuAlgGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlgGenActionPerformed
        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();
            if(!(vertices.length == 0)){

            /*String scriptAv = gRBD.gerarScript2(vertices);
            String script = gEFM.gerarScript2(vertices);
            this.arqS.preencherScript(scriptAv + "\n" + script);*/

                JanelaAlgGen algGen = new JanelaAlgGen(this, true);
                algGen.iniciaForm(vertices);

                algGen.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Nenhum componente encontrado");
            }
        });
    }//GEN-LAST:event_menuAlgGenActionPerformed

    private void btCorretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCorretActionPerformed
        R.tryCatch(()->{
            GerarManutCorret.imprimirScript(acGrafo.getVertices());
        });
    }//GEN-LAST:event_btCorretActionPerformed

    private void menuCalcManutCorretActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcManutCorretActionPerformed
        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();

            if(!(vertices.length == 0)){
                String script = GerarManutCorret.gerarScript(vertices);
                JanelaResultados jr = new JanelaResultados(this, true);
                jr.taResult.setText(this.arqS.calcSPN(script));
                jr.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Nenhum esquema encontrado.");
            }
        });
    }//GEN-LAST:event_menuCalcManutCorretActionPerformed

    private void btPreventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPreventActionPerformed
        R.tryCatch(()->{
            GerarManutPrev.imprimirScript(acGrafo.getVertices());
        });
    }//GEN-LAST:event_btPreventActionPerformed

    private void menuCalcManutPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalcManutPrevActionPerformed
        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();

            if(!(vertices.length == 0)){
                String script = GerarManutPrev.gerarScript(vertices);
                JanelaResultados jr = new JanelaResultados(this, true);
                jr.taResult.setText(this.arqS.calcSPN(script));
                jr.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Nenhum esquema encontrado.");
            }
        });
    }//GEN-LAST:event_menuCalcManutPrevActionPerformed

    private void menuAlgDifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAlgDifActionPerformed
        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();
            if (!(vertices.length == 0)) {

                String scriptAv = gRBD.gerarScript2(vertices);
                String script = gEFM.gerarScript2(vertices);
                this.arqS.preencherScript(scriptAv + "\n" + script);

                JanelaDifEvo difEvo = new JanelaDifEvo(this, true);
                difEvo.iniciaForm(vertices);

                difEvo.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum componente encontrado");
            }
        });
    }//GEN-LAST:event_menuAlgDifActionPerformed

    private void menuNSGA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNSGA2ActionPerformed
        R.tryCatch(()->{
            Object[] vertices = acGrafo.getVertices();
            if (!(vertices.length == 0)) {

                String scriptAv = gRBD.gerarScript2(vertices);
                String script = gEFM.gerarScript2(vertices);
                this.arqS.preencherScript(scriptAv + "\n" + script);

                Componente comp;
                ArrayList<Componente> comps = new ArrayList<>();
                for (Object vert : vertices) {
                    comp = (Componente) ((mxCell) vert).getValue();
                    comps.add(comp);
                }
                new NSGA2.AlgNSGA2(comps, 15, 88888, 0.6, 2, 20);//objeto da classe algoritmo genetico, ao ser criado o algoritmo ja inicia
            } else {
                JOptionPane.showMessageDialog(this, "Nenhum componente encontrado");
            }
        });
    }//GEN-LAST:event_menuNSGA2ActionPerformed

    private void popMetroInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMetroInserirActionPerformed
        R.tryCatch(()->{
            metroGrafo.insertVertex(mousePos.x, mousePos.y, new Estacao());
        });
    }//GEN-LAST:event_popMetroInserirActionPerformed

    private void tpAreaUtilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tpAreaUtilFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_tpAreaUtilFocusGained

    private void tpAreaUtilStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tpAreaUtilStateChanged
        R.tryCatch(()->{
            PAINEL = TipoPainel.peloValor(tpAreaUtil.getSelectedIndex());
            switch(PAINEL){
                // <editor-fold defaultstate="collapsed" desc="PAINEL_DATA_CENTER">
                case PAINEL_DATA_CENTER -> {
                    if (dataCenterGrafo != null) {
                        graphComponent = dataCenterGrafo.getGraphComponent();
                    }
                    menuPlaceHolder.setVisible(false);
                }
                // </editor-fold>
                // <editor-fold defaultstate="collapsed" desc="PAINEL_METRO">
                case PAINEL_METRO -> {
                    if (metroGrafo != null) {
                        graphComponent = metroGrafo.getGraphComponent();
                    }
                    menuPlaceHolder.setVisible(true);
                }
                    // </editor-fold>
            }
        });
    }//GEN-LAST:event_tpAreaUtilStateChanged

    private void popMetroRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMetroRemoverActionPerformed
        R.tryCatch(()->{
            if(cell != null){
                removerCelula(cell,metroGrafo);
                cell = null;
            }
            var celulas = metroGrafo.getGraph().getSelectionCells();
            //metroGrafo.getGraph().
            for(var celula:celulas){
                removerCelula(celula,metroGrafo);
            }
        });
    }//GEN-LAST:event_popMetroRemoverActionPerformed
    
    private void removerCelula(Object oobj, AcoesGrafo grafo){
        R.tryCatch(()->{
            var celula = (mxCell) oobj;
            var obj = celula.getValue();

            if( obj instanceof Estacao) {
                ((Estacao)obj).deletar();
            }
            else if( obj instanceof Linha2)
                ((Linha2)obj).deletar();

            grafo.deleteCell(celula);
        });
    }
    
    private void popMetroDesassociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMetroDesassociarActionPerformed
        R.tryCatch(()->{
            if(cell == null) return;
            var celula = cell;
            var len = cell.getEdgeCount();
            for(var i =len -1; i >=0; i--){
                var linha = (mxCell)celula.getEdgeAt(i);
                if(linha.isEdge())
                    removerCelula(linha,metroGrafo);
            }
        });
    }//GEN-LAST:event_popMetroDesassociarActionPerformed

    private void popMetroPropriedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_popMetroPropriedadesActionPerformed
        R.tryCatch(()->{
            if(cell == null) return;
            log.log(Level.INFO, "cell {0}", cell.getValue());
            var jpe = new JanelaPropriedadesEstacao(this, true);
            if(cell.getValue() instanceof Estacao prop){
                jpe.iniciaForm(prop);
                jpe.setLocationRelativeTo(null);
                jpe.setVisible(true);
            }
        });
    }//GEN-LAST:event_popMetroPropriedadesActionPerformed

    private void btnMetroDesempenhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetroDesempenhoActionPerformed
        R.tryCatch(()->{
            GERACAO_METR0 = GERACAO_METR0_DESEPEMPENHO;
        });
    }//GEN-LAST:event_btnMetroDesempenhoActionPerformed

    private void btnMetroDesempenhoDisponibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMetroDesempenhoDisponibilidadeActionPerformed
        R.tryCatch(()->{
            GERACAO_METR0 = GERACAO_METR0_DESEPEMPENHO_DISPONIBILIDADE;
        });
    }//GEN-LAST:event_btnMetroDesempenhoDisponibilidadeActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenu3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu3ItemStateChanged
        
    }//GEN-LAST:event_jMenu3ItemStateChanged

//---------------------- INTRODUZIR MENU NO GRAPHCOMPONENT----------------------
    private static void addPopup(Component component, final JPopupMenu popMenu, TelaPrincipal self) {
        component.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                R.tryCatch(()->{
                    if (e.isPopupTrigger()) {
                        showMenu(e);
                    }
                });
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                R.tryCatch(()->{
                    switch(PAINEL){
                        // <editor-fold defaultstate="collapsed" desc="PAINEL_DATA_CENTER">
                        case PAINEL_DATA_CENTER -> {
                            self.popPropActionPerformed(null);
                        }

                        // </editor-fold>
                        // <editor-fold defaultstate="collapsed" desc="PAINEL_METRO">
                        case PAINEL_METRO -> {
                            self.popMetroPropriedadesActionPerformed(null);
                        }
                        // </editor-fold>
                    }
                });
            }
            
            @Override
            public void mouseReleased(MouseEvent e) {
                R.tryCatch(()->{
                    if (e.isPopupTrigger()) {
                        showMenu(e);
                    }
                });
            }
            private void showMenu(MouseEvent e) {
                popMenu.show(e.getComponent(), e.getX(), e.getY());
            }
        });
    }
//------------------------------------------------------------------------------
    
    public static void main(String args[]) {

//        UIManager.put( "nimbusBase", new Color(240, 240, 240));
//        UIManager.put( "nimbusBlueGrey", new Color(240, 240, 240));
//        UIManager.put( "control", new Color(240, 240, 240));
        
        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaPrincipal tp = new TelaPrincipal();
                tp.setVisible(true);
            }
        });
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Var">   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel5;
    private javax.swing.JButton btBack;
    private javax.swing.JButton btBackground;
    private javax.swing.JButton btCorret;
    private javax.swing.JButton btCpn;
    private javax.swing.JButton btEfm;
    private javax.swing.JButton btForward;
    private javax.swing.JButton btGrid;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btOpen;
    private javax.swing.JButton btPrevent;
    private javax.swing.JButton btRbd;
    private javax.swing.JButton btSave;
    private javax.swing.JButton btSpn;
    private javax.swing.JButton btView;
    private javax.swing.JButton btZoomIn;
    private javax.swing.JButton btZoomOut;
    private javax.swing.JRadioButtonMenuItem btnMetroDesempenho;
    private javax.swing.JRadioButtonMenuItem btnMetroDesempenhoDisponibilidade;
    private javax.swing.JRadioButtonMenuItem btnMetroMetricaDisponibilidade;
    private javax.swing.JRadioButtonMenuItem btnMetroMetricaIntervaloTrem;
    private javax.swing.JRadioButtonMenuItem btnMetroMetricaTempoEspera;
    private javax.swing.JRadioButtonMenuItem btnMetroMetricaVelocidade;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup gRadioMetroDesemp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPanel jpDatacenter;
    private javax.swing.JPanel jpMetro;
    private javax.swing.JLabel lblOpAtiva;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblY;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuAlgDif;
    private javax.swing.JMenuItem menuAlgGen;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem menuCalcCPN;
    private javax.swing.JMenuItem menuCalcEFM;
    private javax.swing.JMenuItem menuCalcManutCorret;
    private javax.swing.JMenuItem menuCalcManutPrev;
    private javax.swing.JMenuItem menuCalcRBD;
    private javax.swing.JMenuItem menuCalcSPN;
    private javax.swing.JMenu menuCalcular;
    private javax.swing.JMenuItem menuNSGA2;
    private javax.swing.JMenu menuPlaceHolder;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSalvar;
    private javax.swing.JPanel pnMenuBar;
    private javax.swing.JPanel pnStatus;
    private javax.swing.JMenuItem popDelete;
    private javax.swing.JMenuItem popInfo;
    private javax.swing.JMenuItem popInsert;
    private javax.swing.JMenuItem popMetroDesassociar;
    private javax.swing.JMenuItem popMetroInserir;
    private javax.swing.JMenuItem popMetroPropriedades;
    private javax.swing.JMenuItem popMetroRemover;
    private javax.swing.JMenuItem popProp;
    private javax.swing.JPopupMenu popup;
    private javax.swing.JPopupMenu popupMetro;
    private javax.swing.JTabbedPane tpAreaUtil;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>   
}
