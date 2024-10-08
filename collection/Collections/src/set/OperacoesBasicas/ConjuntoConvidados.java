package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    //atributo

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados(Set<Convidado> convidadosSet) {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado  c: convidadosSet){
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados(null);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " dentro do Set convidados");

        conjuntoConvidados.adicionarConvidado("Convidado 1",231);
        conjuntoConvidados.adicionarConvidado("Convidado 2",902);
        conjuntoConvidados.adicionarConvidado("Convidado 3",987);
        conjuntoConvidados.adicionarConvidado("Convidado 4",902);
        conjuntoConvidados.adicionarConvidado("Convidado 5",765);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " dentro do Set convidados");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(902);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados()+ " dentro do Set convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
