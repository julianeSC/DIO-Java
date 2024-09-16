package Aplicativo.AparelhoTelefonico;

public class Contato implements AparelhoTelefonico {

    @Override
    public void ligar (int numero) {
        // TODO Auto-generated method stub
        System.out.println("Ligando "+numero);
    }

    @Override
    public void atender() {
        // TODO Auto-generated method stub
        System.out.println("Atendendo o telefone...");
    }

    @Override
    public void iniciarCorreioVoz() {
        // TODO Auto-generated method stub
        System.out.println("Correio de voz iniciado");
    }
    
}
