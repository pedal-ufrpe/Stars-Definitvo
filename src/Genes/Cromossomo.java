package Genes;

import java.io.File;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import org.modcs.tools.parser.model.ExecutionRuntime;
import org.modcs.tools.parser.model.Script;
import org.modcs.tools.parser.model.metrics.Metric;
import view.Componente;

public class Cromossomo implements Cloneable{
    ArrayList <Componente> genes;
    double score, totalCost, operationalExergy, availability;
    double scorePSO, redun, totalCostPSO, operationalExergyPSO, availabilityPSO;
    int period;
    double ec;
    int de;
    String ideq;
    private int rank;
    private double crowdDist = 0;
    private Random rand = new Random();//objeto que gera valores inteiros aleatorios
    //private DecimalFormat decimalFormat;
    
    ArrayList <Componente> best_genes;//melhor combinação de componentes encontrada via MOPSO

    public Cromossomo(ArrayList<Componente> genes, int period, double ec, int de) {
        this.genes = genes;
        this.score = 0;
        this.period = period;
        this.ec = ec;
        this.de = de;
        //decimalFormat = new DecimalFormat("#.##");
        //decimalFormat.setRoundingMode(RoundingMode.DOWN);
        //this.setScore("Script.mry");
    }

    public Cromossomo() {
    }   
    
    public void salvarBest (){
        try{
            this.best_genes = (ArrayList<Componente>) genes.clone();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /*public void altualizarBest (){
        if (true){//ajustar o rankeamento para ser usado internamente aqui
            try {
                this.best_genes = (ArrayList<Componente>) genes.clone();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }*/
    public void altualizarBest (ArrayList<Componente> novo_best){
        if (true){//ajustar o rankeamento para ser usado internamente aqui
            try {
                this.best_genes = (ArrayList<Componente>) novo_best.clone();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    public ArrayList<Componente> getBest (){
        return best_genes;
    }
    
    public String getDados(){
        
        String dados = "";
        dados += this.rank + "    ";
        dados += this.getOperationalExergy() + "    ";
        dados += this.getTotalCost() + "    ";
        dados += this.getAvailability() + "    \n";
        return dados;
    }
    
    public String getDadosGenes(){
        String dados = "";
        for (Componente comp : genes){
            dados += comp.getTipoComp() + "_" + comp.getId() + "\t";
        }
        return dados;
    }
    
    @Override
    public String toString() {
        String nome = "";
        nome += "\nscore = " + this.score;
        nome += ideq;
        //nome += "\nav = " + this.availability*100;
        //nome += "\ntcost = " + this.totalCost/1000;
        //nome += "\nopEn = " + this.operationalExergy;
        
        return nome;
    }
    
    @Override 
    public Cromossomo clone() throws CloneNotSupportedException {
        Cromossomo clone = (Cromossomo)super.clone();
        return clone;
        // Como o Vini disse, é possível usar neste caso (em que se pode usar um "shallow cloning"
        // return super.clone(); que é mais fácil de usar.
    }
    public void setScore(String sript) {
        if(this.score != 0){
            this.score = 0;
        } 
        ExecutionRuntime runtime = new ExecutionRuntime();        
        Script script = new Script( new File(sript));        
        runtime.evaluateScript(script);
        
        
        //double aquisitionCost = 0 ;
        double operacionalCost;
        Componente comp;
        ideq = "ids - ";
        for(int i = 0; i < this.genes.size(); i++){
            comp = this.genes.get(i);
            String idVert = comp.getIdVert();
            //System.out.println("id" + idVert + comp.getTipoComp());
            ideq += comp.getId() + " - ";
            runtime.getVariableTable().setValue("mttf"+idVert, comp.getMttf());
            runtime.getVariableTable().setValue("mttr"+idVert, comp.getMttr());
            
            runtime.getVariableTable().setValue("mp"+idVert, comp.getPoderMax());
            runtime.getVariableTable().setValue("ef"+idVert, comp.getEficiencia());
            runtime.getVariableTable().setValue("rp"+idVert, comp.getPreco());
            runtime.getVariableTable().setValue("emb"+idVert, comp.getEnergia());
            //aquisitionCost += (double)this.genes.get(i).getCost();                   
        }
        //System.out.println(ids);
        Metric Aval = runtime.getModel("ModelRBD").getMetric("av");
        this.availability = Aval.solve();
        /*
        runtime.getVariableTable().setValue("aval", this.availability);
        runtime.getVariableTable().setValue("period", this.period);
        runtime.getVariableTable().setValue("ec", this.ec);
        runtime.getVariableTable().setValue("de", this.de);
        
        Metric TCost = runtime.getModel("ModelEFM").getMetric("tc");
        this.totalCost = TCost.solve();
        Metric opExergy = runtime.getModel("ModelEFM").getMetric("oe");
        this.operationalExergy = opExergy.solve();
        
        */
        
        //Melhorar a funcao objetivo (fitness) para ser multiobjetivo
        this.score = this.availability;
    }
    public double fitness(String script) {
        /*//System.out.println("tc " +  (totalCost/1000000) + "\nav "+ (availability*100) + "\noe" + (operationalExergy/100000));
        //double score = totalCost/1000000 - (availability*100 + operationalExergy/100000);
        this.calcularMetricas(script);
        double availability, operationalExergy, totalCost;
        availability = GerarTodosA1.normalizar(GerarTodosA1.minDispV, GerarTodosA1.maxDispV, this.availability);
        totalCost = GerarTodosA1.normalizar(GerarTodosA1.minCustoV, GerarTodosA1.maxCustoV, this.totalCost);
        operationalExergy = GerarTodosA1.normalizar(GerarTodosA1.minExerV, GerarTodosA1.maxExerV, this.operationalExergy);
        
        this.score=  availability + operationalExergy - totalCost;
        return score;
        */System.out.println("git");
        return 0;
    }
    
    public double fitness() {
        //System.out.println("tc " +  (totalCost/1000000) + "\nav "+ (availability*100) + "\noe" + (operationalExergy/100000));
        //double score = totalCost/1000000 - (availability*100 + operationalExergy/100000);
                
        this.score = (availability - operationalExergy - totalCost);
        return score;
        
    }
    
    public void calcularMetricas(String sript) {
       /* if(this.score != 0){
            this.score = 0;
        } */
        ExecutionRuntime runtime = new ExecutionRuntime();        
        Script script = new Script( new File(sript));        
        runtime.evaluateScript(script);
        
        //double aquisitionCost = 0 ;
        double operacionalCost;
        Componente comp;
        ideq = "ids - ";
        for(int i = 0; i < this.genes.size(); i++){
            comp = this.genes.get(i);
            String idVert = comp.getIdVert();
            //System.out.println("id " + idVert + "\t" + comp.getTipoComp());
            ideq += comp.getId() + " - ";
            //System.out.println("id" + idVert);
            runtime.getVariableTable().setValue("mttf"+idVert, comp.getMttf());
            runtime.getVariableTable().setValue("mttr"+idVert, comp.getMttr());
            
            runtime.getVariableTable().setValue("mp"+idVert, comp.getPoderMax());
            runtime.getVariableTable().setValue("ef"+idVert, comp.getEficiencia());
            runtime.getVariableTable().setValue("rp"+idVert, comp.getPreco());
            runtime.getVariableTable().setValue("emb"+idVert, comp.getEnergia());
            //aquisitionCost += (double)this.genes.get(i).getCost();                   
        }
        //System.out.println(ids);
        Metric Aval = runtime.getModel("ModelRBD").getMetric("av");
        this.availability = Aval.solve();
        
        runtime.getVariableTable().setValue("aval", this.availability);
        runtime.getVariableTable().setValue("period", this.period);
        runtime.getVariableTable().setValue("ec", this.ec);
        runtime.getVariableTable().setValue("de", this.de);
        
        Metric TCost = runtime.getModel("ModelEFM").getMetric("tc");
        this.totalCost = TCost.solve();
        Metric opExergy = runtime.getModel("ModelEFM").getMetric("oe");
        this.operationalExergy = opExergy.solve();
        
        //System.out.println("passou");
        
        //Melhorar a funcao objetivo (fitness) para ser multiobjetivo
        //this.score = this.availability;//this.fitness();
    }
    
    
    private void calcularMetricas(String sript, ArrayList <Componente> comps) {
        /* if (this.score != 0) {
            this.score = 0;
        }  */
        
        ExecutionRuntime runtime = new ExecutionRuntime();
        Script script = new Script(new File(sript));
        runtime.evaluateScript(script);

        //double aquisitionCost = 0 ;
        double operacionalCost;
        Componente comp;
        ideq = "ids - ";
        for (int i = 0; i < this.genes.size(); i++) {
            comp = this.genes.get(i);
            String idVert = comp.getIdVert();
            //System.out.println("id" + idVert + comp.getTipoComp());
            ideq += comp.getId() + " - ";
            //System.out.println("id" + idVert);
            runtime.getVariableTable().setValue("mttf" + idVert, comp.getMttf());
            runtime.getVariableTable().setValue("mttr" + idVert, comp.getMttr());

            runtime.getVariableTable().setValue("mp" + idVert, comp.getPoderMax());
            runtime.getVariableTable().setValue("ef" + idVert, comp.getEficiencia());
            runtime.getVariableTable().setValue("rp" + idVert, comp.getPreco());
            runtime.getVariableTable().setValue("emb" + idVert, comp.getEnergia());
            //aquisitionCost += (double)this.genes.get(i).getCost();                   
        }
        //System.out.println(ids);
        Metric Aval = runtime.getModel("ModelRBD").getMetric("av");
        this.availabilityPSO = Aval.solve();

        runtime.getVariableTable().setValue("aval", this.availabilityPSO);
        runtime.getVariableTable().setValue("period", this.period);
        runtime.getVariableTable().setValue("ec", this.ec);
        runtime.getVariableTable().setValue("de", this.de);

        Metric TCost = runtime.getModel("ModelEFM").getMetric("tc");
        this.totalCostPSO = TCost.solve();
        Metric opExergy = runtime.getModel("ModelEFM").getMetric("oe");
        this.operationalExergyPSO = opExergy.solve();

        //System.out.println("passou");
        //Melhorar a funcao objetivo (fitness) para ser multiobjetivo
        //this.score = this.availability;//this.fitness();
    }
    
    public ArrayList<Componente> getGenes() {
        return genes;
    }

    public void setGenes(ArrayList<Componente> genes) {
        this.genes = genes;
    }
    
    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getTotalCost() {
        /*String t_cost = Double.toString(totalCost);
        return Double.parseDouble(t_cost.substring(0, 4));*/
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getOperationalExergy() {
        /*String op_e = Double.toString(operationalExergy);
        return Double.parseDouble(op_e.substring(0, 4));*/
        return operationalExergy;
    }

    public void setOperationalExergy(double operationalExergy) {
        this.operationalExergy = operationalExergy;
    }

    public double getAvailability() {
        //return Double.parseDouble(decimalFormat.format(availability).replace(',', '.'));
        return availability;
    }

    public void setAvailability(double availability) {
        this.availability = availability;
    }
    /*
    public double getTotalCostCold() {
        /String t_cost = Double.toString(totalCost);
        return Double.parseDouble(t_cost.substring(0, 4));/
        return totalCostCold;
    }

    public void setTotalCostCold(double totalCost) {
        this.totalCostCold = totalCost;
    }

    public double getOperationalExergyCold() {
        /*String op_e = Double.toString(operationalExergy);
        return Double.parseDouble(op_e.substring(0, 4));/
        return operationalExergyCold;
    }

    public void setOperationalExergyCold(double operationalExergy) {
        this.operationalExergyCold = operationalExergy;
    }

    public double getAvailabilityCold() {
        //return Double.parseDouble(decimalFormat.format(availability).replace(',', '.'));
        return availabilityCold;
    }

    public void setAvailabilityCold(double availability) {
        this.availabilityCold = availability;
    }*/

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    
    public double getCrowdDist() {
        return crowdDist;
    }

    public void setCrowdDist(double crowdDist) {
        this.crowdDist = crowdDist;
    }

   public void atualizaPosicao(Map<String, ArrayList<Componente>> dicComp, ArrayList <Componente> gBest, String script, double w, double c1, double c2) {
        ArrayList <Componente> novos = new ArrayList<>();
        Componente comp_ind_best,comp_best, comp_atual, comp_novo;
        String tipo;
        int mutacao;
        try{
            for (int i = 0; i < genes.size(); i++) {
                comp_best = gBest.get(i);
                comp_ind_best = best_genes.get(i);
                comp_atual = genes.get(i);
                comp_atual.atualizarVeloc(w, c1, c2, comp_best.getVetor(), comp_ind_best.getVetor());
                mutacao = this.rand.nextInt(100);
                if (mutacao<10) {
                    tipo = comp_atual.getTipoComp();
                    int var = this.rand.nextInt(dicComp.get(tipo).size());
                    comp_novo = dicComp.get(tipo).get(var).clone();
                    comp_novo.setIdVert(comp_atual.getIdVert());
                    novos.add(comp_novo);
                } else {
                    
                    comp_novo = novoComponente(comp_atual, dicComp);
                    comp_novo.setIdVert(comp_atual.getIdVert());
                    novos.add(comp_novo);
                }

                /*
            pegar os best para gerar uma nova combinação de equipamentos para o individuo atual, 
            via componente a componente.
            comparar a nova com o abest (atual) do individuo, se a nova for melhor, 
            atualizar o best = nova.
            apos todos atualizarem o abest, calcular o pbest da geração.
                 */
            }
            this.genes = novos;
            
            //System.out.println("\ngenes   " + this.getDadosGenes());
            //this.calcularMetricas(script, novos);
            //falta comparar as metricas antigas com as novas
        }catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        
    }
   
   private Componente novoComponente(Componente comp_atual, Map<String, ArrayList<Componente>> dicComp){
       double[] vetor_troca = new double[3];
       double[] vetor_atual = comp_atual.getVetor();
       double[] vetor_velo = comp_atual.getVelocidade();
       
       vetor_troca[0] = vetor_atual[0] + vetor_atual[0]*vetor_velo[0];//custo
       vetor_troca[1] = vetor_atual[1] + vetor_atual[0]*vetor_velo[1];//eff
       vetor_troca[2] = vetor_atual[2] + vetor_atual[0]*vetor_velo[2];//mttf
       //metodo comparar fitness do vdonr com os fitness da base

       //this.checarLimite(Vdonor);
       Componente comp_novo = this.difVetorial(vetor_troca, comp_atual.getTipoComp(), dicComp, comp_atual);
       comp_novo.setIdVert(comp_atual.getIdVert());
       //aqui um gene mutante pronto
       return comp_novo;
   }
   
    private Componente difVetorial(double[] Vdonor, String tipo, Map<String, ArrayList<Componente>> dicComp, Componente c_atual){//traz um componente da base mais parecido ao Vdonor
        
        double preco, eficiencia, mttf, dist_atual, dist_menor;
        dist_menor = 999999999;
        Componente menor = c_atual;// = new Componente();
        for (Componente comp : dicComp.get(tipo)){
            preco = comp.getPreco() - Vdonor[0];
            eficiencia = comp.getEficiencia() - Vdonor[1];
            mttf = comp.getMttf() - Vdonor[2];
            dist_atual = Math.sqrt(Math.pow(preco, 2) + Math.pow(eficiencia, 2) + Math.pow(mttf, 2));
            if (dist_atual < dist_menor){
                dist_menor = dist_atual;
                try {
                    menor = comp.clone();
                } catch (CloneNotSupportedException ex) {
                    ex.printStackTrace();

                }
            }
        }
        //System.out.println("vdonor [" + Vdonor[0] + ", " + Vdonor[1] + ", " + Vdonor[2] +  "]  \ncomp_donor [   " + menor.getVetor()[0] + ", " + menor.getVetor()[1] + ", " + menor.getVetor()[2]);
        return menor;
        
       }
    
}
