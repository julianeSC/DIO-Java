package Interface;
import Aplicativo.AparelhoTelefonico.AparelhoTelefonico;
import Aplicativo.NavegadorInternet.NavegadorInternet;
import Aplicativo.ReprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    
    @Override
    public void tocar() {
        // TODO Auto-generated method stub
       System.out.println("Tocando musica...");
    }

    @Override
    public void pausar() {
        // TODO Auto-generated method stub
        System.out.println("Música pausada");
        
    }

    @Override
    public void selecionarMusica(String musica) {
        // TODO Auto-generated method stub
        System.out.println("Musica selecionada "+musica);
        
    }

    @Override
    public void exibirPagina(String URL) {
        // TODO Auto-generated method stub
        System.out.println("Exibindo a página "+URL);
        
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada ");
        
    }

    @Override
    public void ligar(int numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando ... " +numero);
        
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendo o telefone....");
        
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Ocorreio de voz iniciado ");
        
    }
}
