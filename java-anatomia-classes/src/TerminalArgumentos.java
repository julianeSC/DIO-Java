import java.util.Locale;
import java.util.Scanner;

public class TerminalArgumentos {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual seu sobrenome? ");
        String sobrenome = scanner.next();


        System.out.println("Qual sua altura? ");
        double altura = scanner.nextDouble();


        System.out.println("Qual sua idade? ");
        int idade  = scanner.nextInt();


       


        /*String nome = args[0];
        String sobrenome = args[1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);*/

        
        System.out.println("Ola, me chamo " + nome + " " +sobrenome);
        System.out.println("Tenho " +idade+ " anos ");
        System.out.println("Minha altura é: " +altura+ "cm");


        
    }

}
