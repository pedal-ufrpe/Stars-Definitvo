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

public class GerarTodosA4 {
    static double minDispV = 0.9997774601895507;
    static double minCustoV = 27937.5477141209;
    static double minExerV = 1.8580693400820716;
    static double maxDispV = 0.999889176335474;
    static double maxCustoV = 41882.08199070968;
    static double maxExerV = 7.222817083388916;
    
    public static void main(String[] args){
        
        String base = "componentesBaseMenor";
        
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
            File arquivo = new File(base+".txt");
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
        
        
            ArrayList<Cromossomo> cromossomos = new ArrayList<>();
            ArrayList<Cromossomo> parcial = new ArrayList<>();
            ArrayList<Componente> genes;
            Cromossomo atual;
            String dado;
            String dado2;
            double maior = 0;
            String otimo = "";
            double segundo = 0;
            String otimo2 = "";
            
            double minDisp,maxDisp,minCusto,maxCusto,minExer,maxExer;
            maxExer=0.0; maxCusto=0.0; maxDisp=0.0;
            String minDispS,maxDispS,minCustoS,maxCustoS,minExerS,maxExerS;
            maxExerS=""; maxCustoS=""; maxDispS="";minCustoS="";minDispS="";minExerS="";
            minCusto=Double.MAX_VALUE;minDisp=Double.MAX_VALUE;minExer=Double.MAX_VALUE;
            
            for (Componente ups : dicComp.get("UPS_5kVA")) {
                ups.setIdVert("2");System.out.println("ups " + ups.getNomeComp());
                for (Componente sdt : dicComp.get("SDTransformer")) {
                    sdt.setIdVert("3");
                    for (Componente subp : dicComp.get("Subpanel")) {
                        subp.setIdVert("4");
                        for (Componente ps : dicComp.get("PowerStrip")) {
                            ps.setIdVert("5");
                            for (Componente ups2 : dicComp.get("UPS_5kVA")) {
                                try{
                                    ups2 = ups2.clone();
                                }catch(Exception ex){
                                    ex.printStackTrace();
                                }
                                ups2.setIdVert("6");
                                for (Componente sdt2 : dicComp.get("SDTransformer")) {
                                    try {
                                        sdt2 = sdt2.clone();
                                    } catch (Exception ex) {
                                        ex.printStackTrace();
                                    }
                                    sdt2.setIdVert("8");
                                    for (Componente subp2 : dicComp.get("Subpanel")) {
                                        try {
                                            subp2 = subp2.clone();
                                        } catch (Exception ex) {
                                            ex.printStackTrace();
                                        }
                                        subp2.setIdVert("9");
                                        for (Componente sts : dicComp.get("STS")) {
                                            sts.setIdVert("7");
                                            genes = new ArrayList<>();
                                            genes.add(ups);
                                            genes.add(sdt);
                                            genes.add(subp);
                                            genes.add(ps);
                                            genes.add(ups2);
                                            genes.add(sdt2);
                                            genes.add(subp2);
                                            genes.add(sts);

                                            atual = new Cromossomo(genes, period, ec, de);
                                            
                                            dado = "\n";
                                            //dado2 = "\n";
                                            for (Componente l1 : genes) {
                                                dado += l1.getId() + " - ";// + sdt.getId() + " - " + subp.getId() + " - " + ps.getId();//+numNove(atual.availability);
                                            }
                                            atual.calcularMetricas("a4.mry");
                                            dado += "\tdisp: " + atual.getAvailability() + "\t custo:  " + atual.getTotalCost() + "\texergia:  " + (atual.getOperationalExergy() + "\tDisp em num 9: " + FuncoesFB.numNove(atual.getAvailability()));



                                            //define os maximos e minimos l|I
                                            if (atual.getAvailability() > maxDisp) {
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
                                            }
                                            //normalização

                                            /*atual.setAvailability(FuncoesFB.normalizar(minDispV, maxDispV, atual.getAvailability()));
                                            atual.setOperationalExergy(FuncoesFB.normalizar(minExerV, maxExerV, atual.getOperationalExergy()));
                                            atual.setTotalCost(FuncoesFB.normalizar(minCustoV, maxCustoV, atual.getTotalCost()));*/

                                            /*dado +=  "\tfitness: " + atual.fitness() + "\tdispN  " + atual.getAvailability() + "\tcustoN  " + atual.getTotalCost() + "\texerN  " + atual.getOperationalExergy();
                                            //gravarArq.printf(dado);

                                            if (atual.fitness()> maior){
                                                /*segundo = maior;
                                                otimo2 = otimo;/
                                                DecimalFormat decimalFormat  = new DecimalFormat("#.##");
                                                maior = atual.fitness();
                                                otimo = dado;// + "\t custo:  " + Double.parseDouble(decimalFormat.format(atual.getTotalCost()).replace(',', '.')) + "\texergia:  " + Double.toString(atual.getOperationalExergy());
                                                //System.out.println("antes  " + atual.getTotalCost() + "\tdepois  " +Double.parseDouble(decimalFormat.format(atual.getTotalCost()).replace(',', '.')));
                                            }*/
                                            parcial.add(atual);
                                        }
                                        
                                        
                                    }
                                    
                                }
                            }

                        }
                    }
                }
                preRanquear(parcial, cromossomos);
                parcial.clear();
            }
        ranquear(cromossomos, base);
        
        
try {
            FileWriter arq = new FileWriter("combinacoesA4.txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("ups1-sdt1-subp1-ps-ups2-sdt2-subp2-sts");
        
            gravarArq.printf("\n\nOtimo\n" + otimo);
            gravarArq.printf("\n\nOtimo2\n" + otimo2);
            System.out.println("Otimo    " + maior);
            gravarArq.printf("\n\nminimos\nminDisp " + minDisp + minDispS + "\nminCusto " + minCusto + minCustoS + "\nminExer " + minExer + minExerS);
            gravarArq.printf("\n\nmaximos\nmaxDisp " + maxDisp + maxDispS + "\nmaxCusto " + maxCusto + maxCustoS + "\nmaxExer " + maxExer + maxExerS);

            
        
            data = Calendar.getInstance();
            dia2 = data.get(Calendar.DAY_OF_YEAR);
            hora2 = data.get(Calendar.HOUR_OF_DAY);
            min2 = data.get(Calendar.MINUTE);
            seg2 = data.get(Calendar.SECOND); 
            String tempo2 = "" + hora2 + " : " + min2 + " : " + seg2;
            
            duracao = FuncoesFB.calcDuracao(dia1, hora1, min1, seg1 , dia2, hora2, min2, seg2);
            
            gravarArq.printf("\n\n\ncomecou em: " + tempo1 + "\nfinalizou em: " + tempo2 + "\ndemorou:" + (duracao) + " segundos");
            arq.close();

            System.out.println("tempo1 " + tempo1 + "\ntempo2 " + tempo2);
        }catch(Exception ex) {
            ex.printStackTrace();
            
        }
    }
    private static void preRanquear(ArrayList<Cromossomo> individuos, ArrayList<Cromossomo> ranqueados){//aplicacao do non-dominated sort
        System.out.println("ranqueamento parcial --------------------------------------------------------------");
        int atual = 0;
        boolean objetivo = false;
        int rival = 0;
        ArrayList<Cromossomo> pop_atual = individuos;
        int empates;
            
                for (Cromossomo c_atual : pop_atual) {
                    objetivo = false;

                    //c_atual.setAvailability(1);
                    //c_atual.setTotalCost(1);
                    //c_atual.setOperationalExergy(1);
                    for (Cromossomo c_compara : pop_atual) {
                        //c_compara.setTotalCost(1);
                        //c_compara.setOperationalExergy(1);
                        empates = 3;
                        rival = 0;//total vitorias comparado
                        atual = 0;//total vitorias atual
                        if (c_atual.getTotalCost() > c_compara.getTotalCost()) {
                            rival += 1;
                            empates -= 1;
                        } else if (c_atual.getTotalCost() < c_compara.getTotalCost()) {
                            atual += 1;
                            empates -= 1;
                        }
                        //ajustar para que seja dito se é funcao de max ou min
                        if (c_atual.getAvailability() < c_compara.getAvailability()) {
                            rival += 1;
                            empates -= 1;
                        } else if (c_atual.getAvailability() > c_compara.getAvailability()) {
                            atual += 1;
                            empates -= 1;
                        }
                        if (c_atual.getOperationalExergy() > c_compara.getOperationalExergy()) {//se o atual é melhor
                            rival += 1;
                            empates -= 1;
                        } else if (c_atual.getOperationalExergy() < c_compara.getOperationalExergy()) {
                            atual += 1;
                            empates -= 1;
                        }

                        //if (rival > atual){//se o atual perdeu mais que ganhou de no minimo 1 outro
                        boolean atual_domina = ((atual + empates) == 3);
                        boolean rival_domina = ((rival + empates) == 3);
                        if (atual_domina) {
                            objetivo = true;
                        } else if (rival_domina) {
                            objetivo = false;
                            //restantes.add(c_atual);
                            break;
                        } else if (!(atual_domina) && !(rival_domina)) {
                            objetivo = true;
                        }

                    }
                    if (objetivo) {
                        ranqueados.add(c_atual);
                    }

                }
            
            System.out.println("ranqueamento parcial concluido");
    }
    
    private static void ranquear(ArrayList<Cromossomo> individuos, String base) {//aplicacao do non-dominated sort
        System.out.println("rankeando--------------------------------------------------------------");
        //int qtd_nao_ranqueados = individuos.size();//System.out.println("tam pop" + qtd_nao_ranqueados);
        int rank = 0;
        int atual = 0;
        boolean objetivo = false;
        int rival = 0;
        ArrayList<Cromossomo> pop_atual = individuos;
        //ArrayList<Cromossomo> restantes;
        //String dados = "", teste = "";
        int empates;
        //ArrayList<Cromossomo> rankeados;

        try {
            FileWriter arq = new FileWriter("a4 - ranques" + " base" + base + ".txt");
            PrintWriter gravarArq = new PrintWriter(arq);

            gravarArq.printf("rank - op_exegergy - total_cost - availability\n");

            //while (qtd_nao_ranqueados > 0) {
            rank += 1;
            //rankeados = new ArrayList<>();
            //restantes = new ArrayList<>();
            for (Cromossomo c_atual : pop_atual) {
                objetivo = false;

                //c_atual.setAvailability(1);
                //c_atual.setTotalCost(1);
                //c_atual.setOperationalExergy(1);
                for (Cromossomo c_compara : pop_atual) {
                    //c_compara.setTotalCost(1);
                    //c_compara.setOperationalExergy(1);
                    empates = 3;
                    rival = 0;//total vitorias comparado
                    atual = 0;//total vitorias atual
                    if (c_atual.getTotalCost() > c_compara.getTotalCost()) {
                        rival += 1;
                        empates -= 1;
                    } else if (c_atual.getTotalCost() < c_compara.getTotalCost()) {
                        atual += 1;
                        empates -= 1;
                    }
                    //ajustar para que seja dito se é funcao de max ou min
                    if (c_atual.getAvailability() < c_compara.getAvailability()) {
                        rival += 1;
                        empates -= 1;
                    } else if (c_atual.getAvailability() > c_compara.getAvailability()) {
                        atual += 1;
                        empates -= 1;
                    }
                    if (c_atual.getOperationalExergy() > c_compara.getOperationalExergy()) {//se o atual é melhor
                        rival += 1;
                        empates -= 1;
                    } else if (c_atual.getOperationalExergy() < c_compara.getOperationalExergy()) {
                        atual += 1;
                        empates -= 1;
                    }

                    //if (rival > atual){//se o atual perdeu mais que ganhou de no minimo 1 outro
                    boolean atual_domina = ((atual + empates) == 3);
                    boolean rival_domina = ((rival + empates) == 3);
                    if (atual_domina) {
                        objetivo = true;
                    } else if (rival_domina) {
                        objetivo = false;
                        //restantes.add(c_atual);
                        break;
                    } else if (!(atual_domina) && !(rival_domina)) {
                        objetivo = true;
                    }

                    //System.out.println("\nind " + c_atual + " comp " + (rival > atual) + "  rival  " + rival + "   atual " + atual);
                }
                //System.out.println("objtivo     " + objetivo);
                if (objetivo) {
                    //System.out.println("passou");
                    c_atual.setRank(rank);
                    //rankeados.add(c_atual);
                    gravarArq.printf(c_atual.getDados() + "\n");
                    //qtd_nao_ranqueados -= 1;
                }

            }
            //uma colecao de ranks, onde cada rank é uma colecao de individuos daquele rank
            //crowd é via rank, isso facilitaria ja que todos ja estariam separados
            //dicRank.put(Integer.toString(rank), rankeados);//montar o dicionario de ranks, que facilita na hora do crowd

            //pop_atual = restantes;
            //}
            arq.close();
            System.out.println("fim rankeando");
        } catch (IOException ex) {
            System.out.println("erro " + ex.getMessage());//printStackTrace();
        }//talvez seja por rank mesmo, mas nada deixa isso explicito
    }
    
    private static ArrayList<Cromossomo> crowdDist(ArrayList<Cromossomo> rank_atual){//recebe por rank
        double crowdD = 0;//pop = 20, r1 = 2, r2 = 7, r3 = 10, r4 = 20, r....
        for (Cromossomo c : rank_atual){
            c.setCrowdDist(crowdD);
        }
        int tam = rank_atual.size();
        Cromossomo[] pop_ord = new Cromossomo[tam];//array tamanho da pop
        double anterior, proximo, primeiro, ultimo;
        String dados = "---------------------------\ncrowd\n";
        try {
            //FileWriter arq = new FileWriter("mopso_rank_inicial -" + this.arqt+ " - ord valores"+ " base" + this.base +".txt");
            //PrintWriter gravarArq = new PrintWriter(arq);
            
            
            //ordenar por disponibilidade
            for (int c = 0;c < tam; c++){//insercao dos individuos no array
                pop_ord[c] = rank_atual.get(c);
            }
            quickSortDisp(pop_ord, 0, tam-1);//ordena por disp
            
            /*gravarArq.printf("\n\ndisponibilidade ordenado"+ "\n");
            for (Cromossomo c : pop_ord){
                gravarArq.printf(c.getAvailability() + "\n");//escreve num arquivo
            }//grava depois de ordenado*/

            //set dos extremos no infinito
            pop_ord[0].setCrowdDist(Double.MAX_VALUE);//primeiro da ordem
            pop_ord[tam - 1].setCrowdDist(Double.MAX_VALUE);//ultimo da ordem

            //valores para o calculo
            primeiro = pop_ord[0].getAvailability();//max ou funcao(primeiro)
            ultimo = pop_ord[tam - 1].getAvailability();//min ou funcao(ultimo)

            //dados += pop_ord[0].getCrowdDist() + "\n";
            
            for (int i = 1; i < (pop_ord.length - 1); i++) {
                anterior = pop_ord[i - 1].getAvailability();//anterior ao atual
                proximo = pop_ord[i + 1].getAvailability();//
                pop_ord[i].setCrowdDist(pop_ord[i].getCrowdDist() + ((proximo - anterior) / (ultimo - primeiro)));
            }
            quickSortCrowd(pop_ord, 0, tam-1);
            
            //ordenar por custo total
            for (int c = 0;c < tam; c++){//insercao dos individuos no array
                pop_ord[c] = rank_atual.get(c);
            }
            quickSortCusto(pop_ord, 0, tam-1);//ordena por custo
            /*gravarArq.printf("\n\ncusto ordenado"+ "\n");
            for (Cromossomo c : pop_ord){
                gravarArq.printf(c.getTotalCost()+ "\n");//escreve num arquivo
            }//*/
            
            //set dos extremos no infinito
            pop_ord[0].setCrowdDist(Double.MAX_VALUE);//primeiro da ordem
            pop_ord[tam - 1].setCrowdDist(Double.MAX_VALUE);//ultimo da ordem

            //valores para o calculo
            primeiro = pop_ord[0].getTotalCost();//max ou funcao(primeiro)
            ultimo = pop_ord[tam - 1].getTotalCost();//min ou funcao(ultimo)

            //dados += pop_ord[0].getCrowdDist() + "\n";
            //int tam = pop_ord.length;
            for (int i = 1; i < (pop_ord.length - 1); i++) {
                anterior = pop_ord[i - 1].getTotalCost();//anterior ao atual
                proximo = pop_ord[i + 1].getTotalCost();//
                pop_ord[i].setCrowdDist(pop_ord[i].getCrowdDist() + ((proximo - anterior) / (ultimo - primeiro)));
            }
            quickSortCrowd(pop_ord, 0, tam-1);//ordenado
            
            //ordenar por op-exergy
            for (int c = 0;c < tam; c++){//insercao dos individuos no array
                pop_ord[c] = rank_atual.get(c);
            }
            quickSortExergia(pop_ord, 0, tam-1);//ordena por exergia
            
            /*gravarArq.printf("\n\nexergia ordenado" + "\n");
            for (Cromossomo c : pop_ord) {
                gravarArq.printf(c.getOperationalExergy() + "\n");//escreve num arquivo
            }*/
            //set dos extremos no infinito
            pop_ord[0].setCrowdDist(Double.MAX_VALUE);//primeiro da ordem
            pop_ord[tam - 1].setCrowdDist(Double.MAX_VALUE);//ultimo da ordem

            //valores para o calculo
            primeiro = pop_ord[0].getOperationalExergy();//max ou funcao(primeiro)
            ultimo = pop_ord[tam - 1].getOperationalExergy();//min ou funcao(ultimo)

            for (int i = 1; i < (pop_ord.length - 1); i++) {
                anterior = pop_ord[i - 1].getOperationalExergy();//anterior ao atual
                proximo = pop_ord[i + 1].getOperationalExergy();//
                pop_ord[i].setCrowdDist(pop_ord[i].getCrowdDist() + ((proximo - anterior) / (ultimo - primeiro)));
            }
            quickSortCrowd(pop_ord, 0, tam-1);
            
            for (Cromossomo c : pop_ord){
                dados += c.getCrowdDist() + "\n";//escreve num arquivo
            }
            /*gravarArq.printf(dados);
            arq.close();*/
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        ArrayList<Cromossomo> rank_ord = new ArrayList<>();
        int crowd_0 = 0;
        for (Cromossomo c : pop_ord){
            if (!(c.getCrowdDist() == 0)){
                rank_ord.add(c);
            }else{
                crowd_0 += 1;
            }            
        }
        //System.out.println("crowd zero  " + crowd_0);
        return rank_ord; 
    }
    
    private static void quickSortDisp(Cromossomo[] vetor, int inicio, int fim) {//vetor = pop, 
        if (inicio < fim) {
            int posicaoPivo = separarDisp(vetor, inicio, fim);
            quickSortDisp(vetor, inicio, posicaoPivo - 1);//separa a medade esquerda
            quickSortDisp(vetor, posicaoPivo + 1, fim);//separa a metade direita
        }
    }

    private static int separarDisp(Cromossomo[] vetor, int inicio, int fim) {//retorna a posicao do pivor
        Cromossomo pivo = vetor[inicio];//pivo é o valor na pos 0 (valor na posicao inicial)
        int i = inicio + 1, f = fim;//i = posicao depois do pivo, fim = ultima posicao
        while (i <= f) {//enquanto i não chagar no fim do vetor
            if (vetor[i].getAvailability() <= pivo.getAvailability()) {//vai do inicio pra direita
                i++;
            } else if (pivo.getAvailability() < vetor[f].getAvailability()) {//vai do final pra esquerda
                f--;
            } else {//troca dois valores de posicao, os extremos atuais (o mais a direita com o mais a esquerda)
                Cromossomo troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;// pivo é colocado no meio, eu acho
        return f;
    }
    
    private static void quickSortCusto(Cromossomo[] vetor, int inicio, int fim) {//vetor = pop, 
        if (inicio < fim) {
            int posicaoPivo = separarCusto(vetor, inicio, fim);
            quickSortCusto(vetor, inicio, posicaoPivo - 1);//separa a medade esquerda
            quickSortCusto(vetor, posicaoPivo + 1, fim);//separa a metade direita
        }
    }

    private static int separarCusto(Cromossomo[] vetor, int inicio, int fim) {//retorna a posicao do pivor
        Cromossomo pivo = vetor[inicio];//pivo é o valor na pos 0 (valor na posicao inicial)
        int i = inicio + 1, f = fim;//i = posicao depois do pivo, fim = ultima posicao
        while (i <= f) {//enquanto i não chagar no fim do vetor
            if (vetor[i].getTotalCost() <= pivo.getTotalCost()) {//vai do inicio pra direita
                i++;
            } else if (pivo.getTotalCost() < vetor[f].getTotalCost()) {//vai do final pra esquerda
                f--;
            } else {//troca dois valores de posicao, os extremos atuais (o mais a direita com o mais a esquerda)
                Cromossomo troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;// pivo é colocado no meio, eu acho
        return f;
    }
    
    private static void quickSortExergia(Cromossomo[] vetor, int inicio, int fim) {//vetor = pop, 
        if (inicio < fim) {
            int posicaoPivo = separarExergia(vetor, inicio, fim);
            quickSortExergia(vetor, inicio, posicaoPivo - 1);//separa a medade esquerda
            quickSortExergia(vetor, posicaoPivo + 1, fim);//separa a metade direita
        }
    }

    private static int separarExergia(Cromossomo[] vetor, int inicio, int fim) {//retorna a posicao do pivor
        Cromossomo pivo = vetor[inicio];//pivo é o valor na pos 0 (valor na posicao inicial)
        int i = inicio + 1, f = fim;//i = posicao depois do pivo, fim = ultima posicao
        while (i <= f) {//enquanto i não chagar no fim do vetor
            if (vetor[i].getOperationalExergy() <= pivo.getOperationalExergy()) {//vai do inicio pra direita
                i++;
            } else if (pivo.getOperationalExergy() < vetor[f].getOperationalExergy()) {//vai do final pra esquerda
                f--;
            } else {//troca dois valores de posicao, os extremos atuais (o mais a direita com o mais a esquerda)
                Cromossomo troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;// pivo é colocado no meio, eu acho
        return f;
    }
    
    private static void quickSortCrowd(Cromossomo[] vetor, int inicio, int fim) {//vetor = pop, 
        if (inicio < fim) {//o mais problematico seria como identificar o que temos de ordenar
            int posicaoPivo = separarCrowd(vetor, inicio, fim);
            quickSortCrowd(vetor, inicio, posicaoPivo - 1);//separa a medade esquerda
            quickSortCrowd(vetor, posicaoPivo + 1, fim);//separa a metade direita
        }
    }

    private static int separarCrowd(Cromossomo[] vetor, int inicio, int fim) {//retorna a posicao do pivor
        Cromossomo pivo = vetor[inicio];//pivo é o valor na pos 0 (valor na posicao inicial)
        int i = inicio + 1, f = fim;//i = posicao depois do pivo, fim = ultima posicao
        while (i <= f) {//enquanto i não chagar no fim do vetor
            if (vetor[i].getCrowdDist()<= pivo.getCrowdDist()) {//vai do inicio pra direita
                i++;
            } else if (pivo.getCrowdDist() < vetor[f].getCrowdDist()) {//vai do final pra esquerda
                f--;
            } else {//troca dois valores de posicao, os extremos atuais (o mais a direita com o mais a esquerda)
                Cromossomo troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }//sss
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;// pivo é colocado no meio, eu acho
        return f;
    }
}
