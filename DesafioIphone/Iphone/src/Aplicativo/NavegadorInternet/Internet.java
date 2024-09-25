package Aplicativo.NavegadorInternet;

public class Internet implements NavegadorInternet {

    @Override
    public void exibirPagina(String URL) {
        // TODO Auto-generated method stub
        System.out.println("Acessando a página "+URL);
    }

    @Override
    public void adicionarNovaAba() {
        // TODO Auto-generated method stub
       System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        // TODO Auto-generated method stub
        System.out.println("Atualizando a página......");
    }
    
}
