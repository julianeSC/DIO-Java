package map.OperaçõesBasicas;
import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {
    //atributo
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(Map<String, Integer> agendaContatoMap) {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }

    }

    public void exibirContato(){
        System.out.println(agendaContatoMap);
    }
    
    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
            
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos(null);

        agendaContatos.adicionarContato("Beatriz", 98435748);
        agendaContatos.adicionarContato("Beatriz", 98435744);
        agendaContatos.adicionarContato("Beatriz3", 98435745);
        agendaContatos.adicionarContato("Beatriz4", 98435746);
        agendaContatos.adicionarContato("Beatriz5", 98435747);

        agendaContatos.exibirContato();

        agendaContatos.removerContato("Beatriz3");

        agendaContatos.exibirContato();


        System.out.println("Numero : "+ agendaContatos.pesquisarPorNome("Beatriz"));


    }

}
