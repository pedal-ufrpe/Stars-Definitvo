package view;

import javax.swing.DefaultComboBoxModel;
import lombok.extern.java.Log;
import rode.spn.trem.*;
import rode.utilitario.R;

@Log
public class JanelaPropriedadesEstacao extends javax.swing.JDialog {

    private Estacao estacao;
    private int indexLinha = 0;
    private int indexTrilho = 0;
    
    public JanelaPropriedadesEstacao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        tfOrigem.setEditable(false);
        tfDestino.setEditable(false);
    }
    
    //------------------------------------------------------------------------------
    
    public void iniciaForm(Estacao estacao) {
        this.estacao = estacao;
        limpar();
        //System.out.println(estacao.string());
        tfNome.setText(estacao.getNome());
        tfNumeroTrem.setText(String.valueOf(estacao.getNumeroTrens()));
        tfNumeroLinha.setText(String.valueOf(estacao.getLinhasAtuais().size()));
        if(estacao.getLinhasAtuais().isEmpty())
            return;
        var a = estacao.getLinhasAtuais().stream().map(Linha2::getNome).toList();
        cbLinhas.setModel(new DefaultComboBoxModel<>(a.toArray(a.toArray(new String[a.size()]))));

        var linha = estacao.getLinhasAtuais().getFirst();
        var trilhos = linha.getVias().get(estacao.getId());
        atualiza(linha,trilhos);        
    }
    
    public void limpar(){
        cbLinhas.setModel(new DefaultComboBoxModel<>(new String[0]));
        tfOrigem.setText("");
        tfDestino.setText("");
        tfTempoMedio.setText("");
        tfMttf.setText("");
        tfMttr.setText("");
    }
    
    public void atualiza(Linha2 l, Via via){
        if(via == null) return;
        if(indexTrilho == 0){
            tfNomeLinha.setText(l.getNome());
            if(via.getPropria().getId() == via.getIda().getId()){
                tfOrigem.setText(via.getPropria().getNome());
                tfDestino.setText("Mudança de via");
            }else{
                tfOrigem.setText(via.getPropria().getNome());
                tfDestino.setText(via.getIda().getNome());
            }
            tfTempoMedio.setText(String.valueOf(via.getTrilhoIda().getTempoMedio()));
            tfMttf.setText(String.valueOf((via.getTrilhoIda().getMttf())));
            tfMttr.setText(String.valueOf((via.getTrilhoIda().getMttr())));
        }else{
            tfNomeLinha.setText(l.getNome());
            if(via.getPropria().getId() == via.getVolta().getId()){
                tfOrigem.setText(via.getPropria().getNome());
                tfDestino.setText("Mudança de via");
            }else{
                tfOrigem.setText(via.getVolta().getNome());
                tfDestino.setText(via.getPropria().getNome());
            }
            tfTempoMedio.setText(String.valueOf(via.getTrilhoVolta().getTempoMedio()));
            tfMttf.setText(String.valueOf((via.getTrilhoVolta().getMttf())));
            tfMttr.setText(String.valueOf((via.getTrilhoVolta().getMttr())));
        }

    }
    public void atualiza(){
        var linha = estacao.getLinhasAtuais().get(indexLinha);
        var via = linha.getVias().get(estacao.getId());
        atualiza(linha,via);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfNumeroTrem = new javax.swing.JTextField();
        tfNumeroLinha = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbLinhas = new javax.swing.JComboBox<>();
        tfNomeLinha = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tfMttr = new javax.swing.JTextField();
        tfMttf = new javax.swing.JTextField();
        tfTempoMedio = new javax.swing.JTextField();
        tfDestino = new javax.swing.JTextField();
        tfOrigem = new javax.swing.JTextField();
        cbTrilhos = new javax.swing.JComboBox<>();
        btCancelar = new javax.swing.JButton();
        btConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Numero de linhas");

        jLabel2.setText("Numero de trens");

        jLabel1.setText("Nome da estacao:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Propriedades da Estacao:");

        tfNumeroTrem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tfNumeroLinha.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNumeroTrem)
                    .addComponent(tfNumeroLinha)
                    .addComponent(tfNome))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(141, 141, 141))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNumeroTrem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfNumeroLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Linhas que passam pela estacao");

        cbLinhas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Linha_1", "Linha_2" }));
        cbLinhas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbLinhasItemStateChanged(evt);
            }
        });
        cbLinhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLinhasActionPerformed(evt);
            }
        });

        jLabel14.setText("Nome da linha:");

        jLabel10.setText("Linha:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(82, 82, 82)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomeLinha)
                            .addComponent(cbLinhas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel14))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(125, 125, 125))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbLinhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tfNomeLinha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setText("Vias presentes na linha");

        jLabel12.setText("Sentido");

        jLabel4.setText("Estação de origem");

        jLabel5.setText("Estação de destino");

        jLabel7.setText("Tempo médio");

        jLabel8.setText("MTTF");

        jLabel11.setText("MTTR");

        tfOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfOrigemActionPerformed(evt);
            }
        });

        cbTrilhos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ida", "volta" }));
        cbTrilhos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTrilhosItemStateChanged(evt);
            }
        });
        cbTrilhos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTrilhosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDestino)
                            .addComponent(tfOrigem)
                            .addComponent(tfTempoMedio)
                            .addComponent(tfMttf)
                            .addComponent(tfMttr)
                            .addComponent(cbTrilhos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbTrilhos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfTempoMedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfMttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(tfMttr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btConfirmar.setText("OK");
        btConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(btConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCancelar)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btConfirmar)
                    .addComponent(btCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        setSize(new java.awt.Dimension(497, 606));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cbLinhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLinhasActionPerformed

    }//GEN-LAST:event_cbLinhasActionPerformed

    private void cbLinhasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbLinhasItemStateChanged
        indexLinha = cbLinhas.getSelectedIndex();
        atualiza();
    }//GEN-LAST:event_cbLinhasItemStateChanged

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConfirmarActionPerformed
        estacao.setNome(tfNome.getText());
        estacao.setNumeroTrens(Integer.parseInt(tfNumeroTrem.getText()));
        if(estacao.getLinhasAtuais().isEmpty()) {
            setVisible(false);
            return;
        }
        var linha = estacao.getLinhasAtuais().get(indexLinha);
        var trilho = linha.getVias().get(estacao.getId());

        linha.setNome(tfNomeLinha.getText());

        if(indexTrilho == 0){
            trilho.getTrilhoIda().setMttf(Double.parseDouble(tfMttf.getText()));
            trilho.getTrilhoIda().setMttr(Double.parseDouble(tfMttr.getText()));
            trilho.getTrilhoIda().setTempoMedio(Double.parseDouble(tfTempoMedio.getText()));
        }
        else{
            trilho.getTrilhoVolta().setMttf(Double.parseDouble(tfMttf.getText()));
            trilho.getTrilhoVolta().setMttr(Double.parseDouble(tfMttr.getText()));
            trilho.getTrilhoVolta().setTempoMedio(Double.parseDouble(tfTempoMedio.getText()));
        }
        setVisible(false);
        //System.out.println(estacao.string());

    }//GEN-LAST:event_btConfirmarActionPerformed

    private void tfOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfOrigemActionPerformed

    private void cbTrilhosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTrilhosItemStateChanged
        indexTrilho = cbTrilhos.getSelectedIndex();
        System.out.println("index = " + indexTrilho);
        atualiza();
    }//GEN-LAST:event_cbTrilhosItemStateChanged

    private void cbTrilhosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTrilhosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrilhosActionPerformed
    
    
    // Variables declaration - do not modify 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btConfirmar;
    private javax.swing.JComboBox<String> cbLinhas;
    private javax.swing.JComboBox<String> cbTrilhos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField tfDestino;
    private javax.swing.JTextField tfMttf;
    private javax.swing.JTextField tfMttr;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeLinha;
    private javax.swing.JTextField tfNumeroLinha;
    private javax.swing.JTextField tfNumeroTrem;
    private javax.swing.JTextField tfOrigem;
    private javax.swing.JTextField tfTempoMedio;
    // End of variables declaration//GEN-END:variables
      // </editor-fold>
    
    public void preencherCampos(String nomeComponente) {
        
        
    }
}
