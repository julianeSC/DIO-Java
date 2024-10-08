package set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    // atributo

    private Set<Contato> contatoSet;

    public AgendaContatos(Set<Contato> contatoSet) {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add( new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos(null);
        agendaContatos.adicionarContato("Pessoa1", 123456);
        agendaContatos.adicionarContato("Pessoa2", 123456);
        agendaContatos.adicionarContato("Pessoa3", 123234);
        agendaContatos.adicionarContato("Pessoa4", 123789);
        agendaContatos.adicionarContato("Pessoa4", 123789);

        agendaContatos.exibirContato();

       System.out.println("Pesquisando numero : " + agendaContatos.pesquisarPorNome("Pessoa"));

        agendaContatos.exibirContato();

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Pessoa4", 3456123));

        agendaContatos.exibirContato();

    }
    
}
