import java.util.concurrent.ThreadLocalRandom;
public class EemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada>0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
            
            System.out.println("Doce do valor: "+valorDoce+ " Adicionado no carinnho" );
            mesada = mesada -valorDoce;

        }
        System.out.println("Mesada: "+mesada);
        System.out.println("Maria gastou a sua mesada em doces");






      


    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(7,10);
    }
    
}
