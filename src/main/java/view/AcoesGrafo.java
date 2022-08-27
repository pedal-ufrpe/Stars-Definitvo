package view;

import com.mxgraph.model.mxCell;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxRectangle;
import com.mxgraph.view.mxEdgeStyle;
import com.mxgraph.view.mxGraph;
import com.mxgraph.view.mxStylesheet;
import lombok.Data;

import java.awt.Font;
import java.util.Hashtable;
import java.util.List;

@Data
class AcoesGrafo {
    
    private mxGraph graph;
    private Object parent;
    private mxGraphComponent graphComponent;
    private TelaPrincipal telaP;
    private List<Componente> quadros;
//    String cor;

//------------------------------------------------------------------------------    
    public AcoesGrafo(){
        graph = new mxGraph();
        parent = graph.getDefaultParent();
        graphComponent = new mxGraphComponent(graph);
        //quadros = new ArrayList<>();
        
        mxStylesheet stylesheet = graph.getStylesheet();
        Hashtable<String, Object> style = new Hashtable<String, Object>();
//        style.put(mxConstants.STYLE_FILLCOLOR, "00B0F4"); //cor do quadro
//        style.put(mxConstants.STYLE_GRADIENTCOLOR, "white"); // cor gradienete de baixo no quadro.
//        style.put(mxConstants.STYLE_ROUNDED, true); //exibe o quadro com cantos arredondados
        style.put(mxConstants.STYLE_SHADOW, true); //sombra no quadro
//        style.put(mxConstants.STYLE_ROUNDED, "rounded");
        style.put(mxConstants.STYLE_FONTCOLOR, "blue");
        style.put(mxConstants.STYLE_VERTICAL_LABEL_POSITION, "bottom");
        style.put(mxConstants.STYLE_STROKECOLOR, "blue");
        style.put(mxConstants.STYLE_STROKEWIDTH, 1);
        stylesheet.putCellStyle("ROUNDED", style);
        
        Hashtable<String, Object> styleLinhas = new Hashtable<String, Object>();
       // styleLinhas.put("endArrow", "classicArrow"); //diamind, oval, open, block, classic
        styleLinhas.put(mxConstants.STYLE_FONTCOLOR, "blue");
        stylesheet.putCellStyle("LINHA", styleLinhas);

        System.out.println("valor normal = " + graph.getStylesheet().getDefaultEdgeStyle().get("endArrow"));
    graph.getStylesheet().getDefaultEdgeStyle().put("endArrow", "classicArrow");//altera a ponta da seta
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_FONTCOLOR, "red");//cor do texto
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_FONTSTYLE, Font.BOLD);//estilo do texto
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_STROKEWIDTH, 1);
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_VERTICAL_LABEL_POSITION, "bottom");//posicao do texto
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_VERTICAL_LABEL_POSITION, 150);//posicao do texto
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_STROKECOLOR, "blue");
    
    graph.getStylesheet().getDefaultEdgeStyle().put(mxConstants.STYLE_EDGE, mxEdgeStyle.ElbowConnector);//EFEITO PARA QUE A LINHA DOBRE
    
    graph.setMultigraph(false); // (false) não aceita duas ligação ao mesmo grafo partindo de um mesmo grafo.
    graph.setAllowDanglingEdges(false); // (false) só permite ligar grafo a grafo, não deixa linha solta.


    }
//------------------------------------------------------------------------------
    public mxGraph getGraph() {
        return graph;
    }

    public static void setGraph(mxGraph graph) {
        graph = graph;
    }
    
    public mxGraphComponent getGraphComponent() {
        return graphComponent;
    }

    public void setGraphComponent(mxGraphComponent graphComponent) {
        this.graphComponent = graphComponent;
    }
//------------------------------------------------------------------------------    

    public mxCell insertVertex(int posX, int posY, Object val){
        this.graph.getModel().beginUpdate();
        try {
            mxCell v = (mxCell) this.graph.insertVertex(parent, null, val, posX, posY, 50, 30, "ROUNDED");

            v.getGeometry().setAlternateBounds(new mxRectangle(0, 0, 140, 25));
            return v;

        } finally {
            this.graph.getModel().endUpdate();
        }
    }


    public void insertCell(mxCell cell){
        this.graph.getModel().beginUpdate();
        try {
            this.graph.addCell(cell);
        } finally {
            this.graph.getModel().endUpdate();
        } 
    }
//------------------------------------------------------------------------------    
    public void deleteCell(mxCell mxCell) {
        graph.getModel().remove(mxCell);
//        quadros.remove(quadro);
    }
//------------------------------------------------------------------------------    
    public int tamanhoGraph() {
        return quadros.size();
    }
//------------------------------------------------------------------------------    
    public Componente returnGraph(int posicao) {
        return quadros.get(posicao);
    }
//------------------------------------------------------------------------------    
    public void infoGraph(){
        Object[] vertices = graph.getChildVertices(parent);
        for (Object vertice: vertices){
            mxCell vertice1 = (mxCell) vertice;
            System.out.println("Vertice id: " + vertice1.getId());
            System.out.println("Componente: " + vertice1.getValue());
            int cont = 0;
            while (cont < vertice1.getEdgeCount()){
                mxCell edge = (mxCell)vertice1.getEdgeAt(cont);
                String source = "  Source " + edge.getSource().getId();
                String target = "  Target " + edge.getTarget().getId();
                System.out.println("Edge id: " + edge.getId() + source + target);
                cont++;
            }

        }
    }
//------------------------------------------------------------------------------
    public Object[] getArestas(){
        Object[] arestas = graph.getChildEdges(parent);
        
        return arestas;
    }
    
    public Object[] getVertices(){
        Object[] vertices = graph.getChildVertices(parent);
        return vertices;
        /*if (this.verificarVertices(vertices)) {
            return vertices;
        }
        return new Object[0];*/
    }

//------------------------------------------------------------------------------
    private boolean verificarVertices(Object[] vertices) {
        boolean temFim = false;
        boolean temInicio = false;
        for(Object vertObject:vertices){
            mxCell vertice = (mxCell)vertObject;
            String id = vertice.getId();
            
            int cont = 0;
            
            boolean veriInicio = true;
            boolean veriFim = true;
            while (cont<vertice.getEdgeCount()){
                mxCell edge = (mxCell)vertice.getEdgeAt(cont);
                String target = edge.getTarget().getId();
                String source = edge.getSource().getId();
                
                if (target == id){
                    veriInicio = false;
                }
                else if(source == id){
                    veriFim = false;
                }
                cont++;
            }
            
            if (veriInicio == true){
                temInicio = true;
            }else if(veriFim == true){
                    temFim = true;
                }
        }
        return (temFim == true && temInicio == true);
    }
}
