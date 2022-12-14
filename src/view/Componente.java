package view;
import java.util.Random;

import java.io.Serializable;

public class Componente implements Serializable, Cloneable{
    private Random rand = new Random();//objeto que gera valores inteiros aleatorios

    private String nomeComp;
    private double mttf = 100;
    private double mttr = 8;
    
    private double poderMax = 5.0;
    private double eficiencia = 95.3;
    private double preco = 3600.0;
    private double energia = 3.1392;
    private String tipoComp = "UPS_5kVA";
    
    private static int num = 1;
    private String idVert;//id do componente na arquitetura
    private int id = 0;//numeraçao do componente em relação a base
    
    private double[] atual = new double[3];
    private double[] velocidade = new double[3];//

    public double[] getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double[] velocidade) {
        this.velocidade = velocidade;
    }
    

    public Componente() {
        setNumComp(num);
        
        for (int i = 0; i < 3; i++){
            this.velocidade[i] = this.rand.nextDouble();
        }
    } 
    
    private void salvarAtual(){
        this.atual[0] = this.preco;
        this.atual[1] = this.eficiencia;
        this.atual[2] = this.mttf;
    }
    /*public void veloNegativa(boolean sinal){
        if (sinal){
            veri_sinal = -1;
        }else{
            veri_sinal = 1;
        }
        
    }*/
    public void atualizarVeloc(double w, double c1, double c2, double[] gBest, double[] indBest){
        //normalizar tudo antes de calcular
        double[] dif_interna = new double[3];
        double c1_mult = c1*rand.nextDouble();//0,5*0,01
        for (int i = 0; i < 3; i++){
            dif_interna[i] += (gBest[i] - atual[i])*c1_mult;
        }
        
        double[] dif_externa = new double[3];
        double c2_mult = c2*rand.nextDouble();
        for (int i = 0; i < 3; i++){
            dif_externa[i] += indBest[i] - atual[i]*c2_mult;
        }
        
        //variaveis para equação velocidade
        /*double w_min, w_max, c1, c2;
        w_min = 0.9;
        w_max = 1.8;
        c1 = 0.5;
        c2 = 1.5;*/
        for (int i = 0; i < 3; i++){
            this.velocidade[i] = w*this.velocidade[i] + dif_interna[i] + dif_externa[i];
        }
        
    }
    
    
    //calcula as metricas
    //compara com o pbest
    //se metricas atuais > pbest, pbest <- atuais

    
    public void setAll(String idVert,double mttf, double mttr, double poderMax, double eficiencia, double preco, double energia, String tipoComp){
        this.idVert = idVert;
        this.mttf = mttf;
        this.mttr = mttr;
        this.poderMax = poderMax;
        this.eficiencia = eficiencia;
        this.preco = preco;
        this.energia = energia;
        this.tipoComp = tipoComp;
        this.nomeComp = tipoComp+idVert;
        this.salvarAtual();
    }
    public void setAll(String idVert, double poderMax, double eficiencia, double energia, String tipoComp){
        this.idVert = idVert;
        this.mttf = mttf;
        this.mttr = mttr;
        this.poderMax = poderMax;
        this.eficiencia = eficiencia;
        this.preco = preco;
        this.energia = energia;
        this.tipoComp = tipoComp;
        this.salvarAtual();
    }
    
    private void setNumComp(int num){
        nomeComp = "Componente " + num;
        //this.num++;
    }
    //-------------------------------------------------------------------
    @Override
    public String toString() {
        return nomeComp;
    }
    
    @Override 
    public Componente clone() throws CloneNotSupportedException {
        Componente clone = (Componente)super.clone();
        return clone;
        // Como o Vini disse, é possível usar neste caso (em que se pode usar um "shallow cloning"
        // return super.clone(); que é mais fácil de usar.
    }
    
    public double[] getVetor(){
        double[] vetor = new double[3];
        vetor [0]= this.getPreco();
        vetor [1]= this.getEficiencia();
        vetor [2]= this.getMttf();
        return vetor;
    }
    
    public void changeType(String novo_tipo){
        if (novo_tipo.equals("UPS_5kVA")) {
            this.setTipoComp("UPS_5kVA");
            this.setPoderMax(5.0);
            this.setEficiencia(95.3);
            this.setPreco(3600.0);
            this.setEnergia(3.1392);
            this.setMttf(250000.0);
            this.setMttr(8.0);
        } else if (novo_tipo.equals("UPS_250kVA")) {
            this.setTipoComp("UPS_250kVA");
            this.setPoderMax(250.0);
            this.setEficiencia(95.3);
            this.setPreco(60000.0);
            this.setEnergia(61.03986048);
            this.setMttf(250000.0);
            this.setMttr(8.0);
        } else if (novo_tipo.equals("STS")) {
            this.setTipoComp("STS");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(800.0);
            this.setEnergia(0.35928);
            this.setMttf(240384.62);
            this.setMttr(6.0);
        } else if (novo_tipo.equals("ATS")) {
            this.setTipoComp("ATS");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(800.0);
            this.setEnergia(0.35928);
            this.setMttf(500000.00);
            this.setMttr(0.33);
        } else if (novo_tipo.equals("SDTransformer")) {
            this.setTipoComp("SDTransformer");
            this.setPoderMax(5.0);
            this.setEficiencia(98.5);
            this.setPreco(550.0);
            this.setEnergia(0.35928);
            this.setMttf(1412908.33);
            this.setMttr(156.01);
        } else if (novo_tipo.equals("Subpanel")) {
            this.setTipoComp("Subpanel");
            this.setPoderMax(5.0);
            this.setEficiencia(99.9);
            this.setPreco(200.0);
            this.setEnergia(0.4284);
            this.setMttf(1520000.00);
            this.setMttr(2.4);
        } else if (novo_tipo.equals("PowerStrip")) {
            this.setTipoComp("PowerStrip");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(200.0);
            this.setEnergia(0.35568);
            this.setMttf(11511175.63);
            this.setMttr(3.8);
        } else if (novo_tipo.equals("ACSource")) {
            this.setTipoComp("ACSource");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(200.0);
            this.setEnergia(0.35568);
            this.setMttf(11511175.63);
            this.setMttr(3.8);
        } else if (novo_tipo.equals("GeneratorGroup")) {
            this.setTipoComp("GeneratorGroup");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(200.0);
            this.setEnergia(0.35568);
            this.setMttf(11511175.63);
            this.setMttr(3.8);
        } else if (novo_tipo.equals("GeneratorGroup500")) {
            this.setTipoComp("GeneratorGroup500");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(200.0);
            this.setEnergia(0.35568);
            this.setMttf(11511175.63);
            this.setMttr(3.8);
        } else if (novo_tipo.equals("JunctionBox")) {
            this.setTipoComp("JunctionBox");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(200.0);
            this.setEnergia(0.35568);
            this.setMttf(11511175.63);
            this.setMttr(3.8);
        }
        else if (novo_tipo.equals("JunctionBox")) {
            this.setTipoComp("JunctionBox");
            this.setPoderMax(5.0);
            this.setEficiencia(99.5);
            this.setPreco(200.0);
            this.setEnergia(0.35568);
            this.setMttf(11511175.63);
            this.setMttr(3.8);
        }
        //TI
        else if (novo_tipo.equals("Server")) {
            this.setTipoComp("Server");
            this.setPoderMax(550.0);
            this.setEficiencia(90.0);
            this.setPreco(3000.0);
            this.setEnergia(0.35568);
            this.setMttf(1414.0);
            this.setMttr(0.99);
        }
        else if (novo_tipo.equals("Switch")) {
            this.setTipoComp("Switch");
            this.setPoderMax(550.0);
            this.setEficiencia(90.0);
            this.setPreco(400.0);
            this.setEnergia(0.35568);
            this.setMttf(9090.0);
            this.setMttr(0.64);
        }
        else if (novo_tipo.equals("Router")) {
            this.setTipoComp("Router");
            this.setPoderMax(550.0);
            this.setEficiencia(90.0);
            this.setPreco(4000.0);
            this.setEnergia(0.35568);
            this.setMttf(12181.0);
            this.setMttr(0.52);
        }
        //cooling
        else if (novo_tipo.equals("Chiller")) {
            this.setTipoComp("Chiller");
            this.setPoderMax(15.0);
            this.setEficiencia(4.0);
            this.setPreco(5300.0);
            this.setEnergia(4.5209);
            this.setMttf(18000.0);
            this.setMttr(48.0);
        }
        else if (novo_tipo.equals("C_Tower")) {
            this.setTipoComp("C_Tower");
            this.setPoderMax(2.0);
            this.setEficiencia(99.5);
            this.setPreco(1500.0);
            this.setEnergia(1.2795);
            this.setMttf(24816.0);
            this.setMttr(48.0);
        }
        else if (novo_tipo.equals("CRAC")) {
            this.setTipoComp("CRAC");
            this.setPoderMax(20.0);
            this.setEficiencia(98.0);
            this.setPreco(3200.0);
            this.setEnergia(2.7296);
            this.setMttf(37509.0);
            this.setMttr(8.0);
        }
    }

    public String getIdVert() {
        return idVert;
    }

    public void setIdVert(String idVert) {
        this.idVert = idVert;
    }
    
    public int getId() {
        return id;
    }

    //-------------------------------------------------------------------
    public void setId(int id) {    
        this.id = id;
    }

    public double getMttf() {
        return mttf;
    }

    public void setMttf(double mttf) {
        this.mttf = mttf;
    }

    public double getMttr() {
        return mttr;
    }

    public void setMttr(double mttr) {
        this.mttr = mttr;
    }

    public String getNomeComp() {
        return tipoComp + " " + id;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public double getPoderMax() {
        return poderMax;
    }

    public void setPoderMax(double poderMax) {
        this.poderMax = poderMax;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public String getTipoComp() {
        return tipoComp;
    }

    public void setTipoComp(String tipoComp) {
        this.tipoComp = tipoComp;
    }

}
