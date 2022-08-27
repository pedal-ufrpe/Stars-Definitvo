package rode.spn.trem;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.extern.java.Log;
import rode.spn.LugarSPN;
import rode.spn.SPN;
import rode.spn.Transicao;
import rode.spn.TransicaoExponencial;

import java.util.*;
import java.util.stream.Collectors;

@Data
@Log
public class Linha2 {
    @Getter(AccessLevel.PRIVATE)
    private static long count = 0;
    private String nome;
    private Estacao estacaoInicial;
    private HashMap<Long,Via> vias;

    public Linha2(Estacao e){
        nome = "linha_" + ++count;
        estacaoInicial = e;
        vias = new HashMap<>();
        vias.put(e.getId(),new Via(e));
    }
    public boolean contem(Estacao e){
        return vias.containsKey(e.getId());
    }
    public void adiciona(Estacao e1, Estacao e2){
        if(!vias.containsKey(e1.getId()) && !vias.containsKey(e2.getId()))
            throw new IllegalArgumentException("Nenhuma das estações fazem parte de linha");
        if(vias.containsKey(e1.getId()) && vias.containsKey(e2.getId()))
            throw new IllegalArgumentException("A linha [" + this + "] já possui ambas as estações");
        Estacao ida,volta;
        var inverso = vias.containsKey(e1.getId());
        if(inverso){
            ida = e1;
            volta = e2;
        }else{
            ida = e2;
            volta = e1;
        }
        var v1 = vias.get(ida.getId());

        if( v1.getIda().getId() != ida.getId()){
            if(estacaoInicial.getId() == e2.getId())
                estacaoInicial = e2;
            else
                throw new IllegalArgumentException("Estação já possui para [" + v1.getIda() + "]");
        }


        var v2 = new Via(volta);
        v1.setIda(volta);
        v2.setVolta(ida);
        vias.put(volta.getId(), v2);
    }
    @Override
    public String toString() {
        return nome;
    }
    public String string(){
        var txt = "";
        var estacoes = vias.entrySet().stream()
                .map(Map.Entry::getValue)
                .map(e-> {
                    var t = "";
                    if(e.getVolta().getId() != e.getPropria().getId())
                        t = "\"%s\" <- (%.3f,%.3f,%.3f) ".formatted(e.getVolta().getNome(),e.getTrilhoVolta().getTempoMedio(),e.getTrilhoVolta().getMttf(),e.getTrilhoVolta().getMttr());
                    t += "\"%s\"".formatted(e.getPropria().getNome());
                    if(e.getIda().getId() != e.getPropria().getId())
                        t += "(%.3f,%.3f,%.3f) ->\"%s\" ".formatted(e.getTrilhoIda().getTempoMedio(),e.getTrilhoIda().getMttf(),e.getTrilhoIda().getMttr(),e.getIda().getNome());
                    return t;

                })
                .collect(Collectors.joining(","));

        return "Linha{nome=\"" + nome + "\", estacaoInicial = \"" + estacaoInicial.getNome() + "\", estacoes = ["+estacoes + "]";
    }

    private void adicionaDisponibilidade(){

    }
    private SPN caminho(boolean disponibilidade){
        var transicoes = new LinkedList<Transicao>();
        var lugares = new HashMap<String,LugarSPN>();
        vias.entrySet().stream()
                .map(Map.Entry::getValue)
                .forEach(via ->{
                    var p1 = via.getPropria().asLugar(nome + "_1");
                    var retorno = false;
                    if(via.getPropria().getId() == estacaoInicial.getId()
                        &&  via.getPropria().getNumeroTrens() == 0)
                        p1.setMarcas(1);
                    var p2 = via.getPropria().asLugar(nome + "_2");
                    LugarSPN pn = null;
                    var nomeVia1 = via.getPropria().getNome() + '_' + nome + "_1";
                    var nomeVia2 = via.getPropria().getNome() + '_' + nome + "_2";
                    String nomeVian = "";
                    if(!lugares.containsKey(nomeVia1))
                        lugares.put(nomeVia1+"_1",p1);
                    if(!lugares.containsKey(nomeVia2))
                        lugares.put(nomeVia2,p2);

                    if(via.getIda().getId() == via.getPropria().getId()){
                       pn = p2;
                       nomeVian = nomeVia2;
                       retorno = true;
                    }
                    else{
                        pn = via.getIda().asLugar(nome + "_1");
                        nomeVian = via.getIda().getNome() + '_' + nome + "_1";
                    }

                    avante(lugares,transicoes,disponibilidade,via.getTrilhoIda(),p1,nomeVia1,pn,nomeVian,retorno);
                    retorno = false;
                    if(via.getVolta().getId() == via.getPropria().getId()){
                        pn = p1;
                        nomeVian = nomeVia1;
                        retorno = true;
                    }
                    else{
                        pn = via.getVolta().asLugar(nome + "_2");
                        nomeVian = via.getVolta().getNome() + '_' + nome + "_2";
                    }
                    avante(lugares,transicoes,disponibilidade,via.getTrilhoVolta(),p2,nomeVia2,pn,nomeVian, retorno);
                });
        var novosLugares = new LinkedList<LugarSPN>();
        var nomes = new LinkedList<String>();
        lugares.entrySet().forEach(e->{
            if(nomes.contains(e.getValue().getNome())) return;
            nomes.add(e.getValue().getNome());
            novosLugares.add(e.getValue());
        });
        return SPN.builder()
                .nome(nome)
                .lugares(novosLugares.stream().sorted(Comparator.comparing(LugarSPN::getNome)).toList().toArray(new LugarSPN[novosLugares.size()]))
                .transicoes(transicoes.stream().sorted(Comparator.comparing(Transicao::getNome)).toList().toArray(new Transicao[transicoes.size()]))
                .metricas(new HashMap<>())
                .build();
    }
    private void avante(HashMap<String,LugarSPN> lugares, LinkedList<Transicao> transicoes, boolean disponibilidade,Trilho via, LugarSPN p, String nomeVia, LugarSPN pn, String nomeVian, boolean retorno){
        if(!lugares.containsKey(nomeVian))
            lugares.put(nomeVian,pn);
        if(disponibilidade){
            var on = new LugarSPN(nomeVia+"_on",1,false);
            var off = new LugarSPN(nomeVia+"_off",0,false);
            var mttf = new TransicaoExponencial(nomeVia + "_fail",new LugarSPN[]{on},new LugarSPN[]{off},new LugarSPN[]{},via.getMttf(),false);
            var mttr = new TransicaoExponencial(nomeVia + "_repair",new LugarSPN[]{off},new LugarSPN[]{on},new LugarSPN[]{},via.getMttr(),false);

            var inibidor = !retorno ? new LugarSPN[]{off,pn}:new LugarSPN[]{off};
            var linha = new TransicaoExponencial(nomeVia,new LugarSPN[]{p},new LugarSPN[]{pn},inibidor,via.getTempoMedio());

            transicoes.add(linha);
            transicoes.add(mttf);
            transicoes.add(mttr);
            lugares.put(nomeVia+"_on",on);
            lugares.put(nomeVia+"_off",off);
        }
        else{
            var inibidor = !retorno ? new LugarSPN[]{pn}:new LugarSPN[]{};
            var linha = new TransicaoExponencial(nomeVia,new LugarSPN[]{p},new LugarSPN[]{pn},inibidor,via.getTempoMedio());
            transicoes.add(linha);
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Linha2 linha2 = (Linha2) o;
        return Objects.equals(nome, linha2.nome)
                && Objects.equals(estacaoInicial.getId(), linha2.estacaoInicial.getId())
                && Objects.equals(vias, linha2.vias);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
    public SPN caminhosAsTransicao() {
        return caminho(false);
    }
    public SPN caminhosComDisponibilidadeAsTransicao() {
        return caminho(true);
    }
    public void remover(Estacao e) {
        var lista = new LinkedList<Via>();
        //var exVia = vias.get(e.getId());

    }

    public void deletar() {
    }
}
