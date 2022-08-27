package Genes;

import Genes.Cromossomo;
import com.mxgraph.model.mxCell;
import java.beans.XMLDecoder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import view.Componente;

public class TesteCold {
    static double minDispV = 0.998989463655407;
    static double minCustoV = 27347.75077869695;
    static double minExerV = 1.8573091877974526;
    static double maxDispV = 0.9994832071469274;
    static double maxCustoV = 41069.24805730429;
    static double maxExerV = 7.219058978385679;
    
    /*static double minDispV = 0.998987302436096;
    static double minCustoV = 27347.745243919446;
    static double minExerV = 1.8573051696845204;
    static double maxDispV = 0.9994819579031227;
    static double maxCustoV = 41069.242549139715;
    static double maxExerV = 7.219047848281659;*/
    
    public static void main(String[] args){
        Calendar data = Calendar.getInstance();
        int dia1 = data.get(Calendar.DAY_OF_YEAR);
        int hora1 = data.get(Calendar.HOUR_OF_DAY);
        int min1 = data.get(Calendar.MINUTE);
        int seg1 = data.get(Calendar.SECOND);
        String tempo1 = ""+dia1+" , " + hora1 + " : " + min1 + " : " + seg1;
        int dia2, hora2, min2, seg2, duracao;
        System.out.println("começou em " + tempo1);
        
        Map<String, ArrayList<Componente>> dicComp = new HashMap<>();
        int period = 7000;
        double ec = 0.4;
        int de = 1;
        try {
            File arquivo = new File("ComponentesAts.txt");
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            br.readLine();
            Componente comp;
            dicComp.put("UPS_5kVA", new ArrayList<Componente>());
            dicComp.put("UPS_250kVA", new ArrayList<Componente>());
            dicComp.put("STS", new ArrayList<Componente>());
            dicComp.put("SDTransformer", new ArrayList<Componente>());
            dicComp.put("Subpanel", new ArrayList<Componente>());
            dicComp.put("PowerStrip", new ArrayList<Componente>());
            dicComp.put("ATS", new ArrayList<Componente>());
            dicComp.put("ACSource", new ArrayList<Componente>());
            dicComp.put("GeneratorGroup", new ArrayList<Componente>());
            dicComp.put("GeneratorGroup500", new ArrayList<Componente>());
            dicComp.put("JunctionBox", new ArrayList<Componente>());
            
            while (br.ready()) {
                String lincomp = br.readLine();
                String atb[] = new String[5];
                atb = lincomp.split(";");
                comp = new Componente();
                comp.setId(Integer.parseInt(atb[0]));
                comp.setTipoComp(atb[2]);
                comp.setMttf(Double.parseDouble(atb[3]));
                comp.setEficiencia(Double.parseDouble(atb[4]));
                comp.setPreco(Double.parseDouble(atb[5]));

                dicComp.get(atb[2]).add(comp);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
            ArrayList<Componente> genes;
            Cromossomo atual;
            //String dado;
            String dado2;
            String dadoSemNormalizar;
            double maior = 0;
            String otimo = "";
            double segundo = 0;
            String otimo2 = "";
            
            double minDisp,maxDisp,minCusto,maxCusto,minExer,maxExer;
            maxExer=0.0; maxCusto=0.0; maxDisp=0.0;
            //double minDisp,maxDisp,minCusto,maxCusto,minExer,maxExer;
            maxExer=0.0; maxCusto=0.0; maxDisp=0.0;
            String minDispS,maxDispS,minCustoS,maxCustoS,minExerS,maxExerS;
            maxExerS=""; maxCustoS=""; maxDispS="";minCustoS="";minDispS="";minExerS="";
            minCusto=Double.MAX_VALUE;minDisp=Double.MAX_VALUE;minExer=Double.MAX_VALUE;
            minCusto=Double.MAX_VALUE;minDisp=Double.MAX_VALUE;minExer=Double.MAX_VALUE;
            
            for (Componente ups : dicComp.get("UPS_5kVA")) {
                ups.setIdVert("2");
                
                            for (Componente ups2 : dicComp.get("UPS_5kVA")) {
                                try{
                                    ups2 = ups2.clone();
                                }catch(Exception ex){
                                    ex.printStackTrace();
                                }
                                ups2.setIdVert("6");
                                
                                for (Componente sts : dicComp.get("STS")) {
                                    sts.setIdVert("7");
                                    genes = new ArrayList<>();
                                    genes.add(ups);
                                    genes.add(ups2);
                                    genes.add(sts);

                                    atual = new Cromossomo(genes, period, ec, de);
                                    atual.setScore("Script.mry");

                                    //dado = "\n" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + ups2.getId() + " - " + atual.getScore();
                                    //gravarArq.printf(dado);

                                    /*if (atual.getScore() > maior) {
                                        maior = atual.getScore();
                                        otimo = dado;
                                    }*/
                                    
                                    //dado = "\n";
                                    dado2 = "\n";
                                    for (Componente l1 : genes) {
                                        dado2 += l1.getId() + " - ";// + sdt.getId() + " - " + subp.getId() + " - " + ps.getId();//+numNove(atual.availability);
                                    }
                                    /*atual.calcularMetricas("Script.mry");
                                    dado += "\tdisp: " + atual.getAvailability() + "\t custo:  " + atual.getTotalCost() + "\texergia:  " + (atual.getOperationalExergy() + "\tDisp em num 9: " + FuncoesFB.numNove(atual.getAvailability()));
                                    */
                                    atual.calcularMetricas("Script.mry");
                                    dado2 += "\tdisp: " + atual.getAvailability()+ "\t custo:  " + atual.getTotalCost()+ "\texergia:  " + (atual.getOperationalExergy()+ "\tDisp em num 9: " + FuncoesFB.numNove(atual.getAvailability()));
                                    

                                    //define os maximos e minimos l|I
                                    /*if (atual.getAvailability() > maxDisp) {
                                        maxDispS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getScore();
                                        maxDisp = atual.getAvailability();
                                    }
                                    if (atual.getAvailability() < minDisp) {
                                        minDispS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getScore();
                                        minDisp = atual.getAvailability();
                                    }
                                    if (atual.getTotalCost() > maxCusto) {
                                        maxCustoS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getTotalCost() + "\t disp:  " + atual.getScore();
                                        maxCusto = atual.getTotalCost();
                                    }
                                    if (atual.getTotalCost() < minCusto) {
                                        minCustoS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getTotalCost() + "\t disp:  " + atual.getScore();
                                        minCusto = atual.getTotalCost();
                                    }
                                    if (atual.getOperationalExergy() > maxExer) {
                                        maxExerS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getOperationalExergy() + "\t disp:  " + atual.getScore();
                                        maxExer = atual.getOperationalExergy();
                                    }
                                    if (atual.getOperationalExergy() < minExer) {
                                        minExerS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getOperationalExergy() + "\t disp:  " + atual.getScore();
                                        minExer = atual.getOperationalExergy();
                                    }*/
                                    
                                    
                                    if (atual.getAvailability() > maxDisp) {
                                        //maxDispS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getScore();
                                        maxDisp = atual.getAvailability();
                                    }
                                    if (atual.getAvailability() < minDisp) {
                                        //minDispS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getScore();
                                        minDisp = atual.getAvailability();
                                    }
                                    if (atual.getTotalCost() > maxCusto) {
                                        //maxCustoS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getTotalCost() + "\t disp:  " + atual.getScore();
                                        maxCusto = atual.getTotalCost();
                                    }
                                    if (atual.getTotalCost() < minCusto) {
                                        //minCustoS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getTotalCost() + "\t disp:  " + atual.getScore();
                                        minCusto = atual.getTotalCost();
                                    }
                                    if (atual.getOperationalExergy() > maxExer) {
                                        //maxExerS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getOperationalExergy() + "\t disp:  " + atual.getScore();
                                        maxExer = atual.getOperationalExergy();
                                    }
                                    if (atual.getOperationalExergy() < minExer) {
                                        //minExerS = "\t" + ups.getId() + " - " + sdt.getId() + " - " + subp.getId() + " - " + ps.getId() + " - " + atual.getOperationalExergy() + "\t disp:  " + atual.getScore();
                                        minExer = atual.getOperationalExergy();
                                    }

                                    //normalização
                                    /*atual.setAvailability(FuncoesFB.normalizar(minDispV, maxDispV, atual.getAvailability()));
                                    atual.setOperationalExergy(FuncoesFB.normalizar(minExerV, maxExerV, atual.getOperationalExergy()));
                                    atual.setTotalCost(FuncoesFB.normalizar(minCustoV, maxCustoV, atual.getTotalCost()));

                                    dado +=  "\tfitness: " + atual.fitness() + "\tdispN  " + atual.getAvailability() + "\tcustoN  " + atual.getTotalCost() + "\texerN  " + atual.getOperationalExergy();*/
                                    //gravarArq.printf(dado);
                                    //normalizar os dados , fitness so funcionará apos isso
                                    atual.setAvailability(FuncoesFB.normalizar(minDispV, maxDispV, atual.getAvailability()));
                                    atual.setOperationalExergy(FuncoesFB.normalizar(minExerV, maxExerV, atual.getOperationalExergy()));
                                    atual.setTotalCost(FuncoesFB.normalizar(minCustoV, maxCustoV, atual.getTotalCost()));
                                    dado2 +=  "\tfitness: " + atual.fitness() + "\tdispN  " + atual.getAvailability()+ "\tcustoN  " + atual.getTotalCost()+ "\texerN  " + atual.getOperationalExergy();

                                    if (atual.fitness()> maior) {
                                        //segundo = maior;
                                        otimo2 = dado2;//otimo2 = otimo;
                                        //DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                        maior = atual.fitness();
                                        //otimo = dado;// + "\t custo:  " + Double.parseDouble(decimalFormat.format(atual.getTotalCost()).replace(',', '.')) + "\texergia:  " + Double.toString(atual.getOperationalExergy());
                                        //System.out.println("antes  " + atual.getTotalCost() + "\tdepois  " +Double.parseDouble(decimalFormat.format(atual.getTotalCost()).replace(',', '.')));
                                    }
                                    
                                }
                                
                            }

                        }
                    
                
            
            
        try {
            FileWriter arq = new FileWriter("teste.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("ups1-sdt-subp-ps-ups2-sts");
            
            //gravarArq.printf("\n\nOtimo\n" + otimo);
            gravarArq.printf("\n\nOtimo\n" + otimo2);
            gravarArq.printf("\n\nOtimo2\n" + otimo2);
            
            System.out.println("Otimo    " + maior);
            gravarArq.printf("\n\nExtremos Hot");
            gravarArq.printf("\n\nminimos\nminDisp " + minDisp + minDispS + "\nminCusto " + minCusto + minCustoS + "\nminExer " + minExer + minExerS);
            gravarArq.printf("\n\nmaximos\nmaxDisp " + maxDisp + maxDispS + "\nmaxCusto " + maxCusto + maxCustoS + "\nmaxExer " + maxExer + maxExerS);
            gravarArq.printf("\n\nExtremos ");
            gravarArq.printf("\n\nminimos\nminDisp " + minDisp + minDispS + "\nminCusto " + minCusto + minCustoS + "\nminExer " + minExer + minExerS);
            gravarArq.printf("\n\nmaximos\nmaxDisp " + maxDisp + maxDispS + "\nmaxCusto " + maxCusto + maxCustoS + "\nmaxExer " + maxExer + maxExerS);

            
            data = Calendar.getInstance();
            dia2 = data.get(Calendar.DAY_OF_YEAR);
            hora2 = data.get(Calendar.HOUR_OF_DAY);
            min2 = data.get(Calendar.MINUTE);
            seg2 = data.get(Calendar.SECOND);
            String tempo2 = ""+dia2 + " , " + hora2 + " : " + min2 + " : " + seg2;
            System.out.println("terminou em" + tempo2);
            duracao = FuncoesFB.calcDuracao(dia1, hora1, min1, seg1 , dia2, hora2, min2, seg2);
            
            
            gravarArq.printf("\n\n\ncomecou em: " + tempo1 + "\nfinalizou em: " + tempo2 + "\ndemorou:" + (duracao) + " segundos");
            arq.close();
            
            System.out.println("tempo1 " + tempo1 + "\ntempo2 " + tempo2);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    
}
