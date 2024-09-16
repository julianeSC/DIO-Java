import java.util.Scanner;

public class contador {
  public static void main(String[] args) {

    try {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Por favor, digite o primeiro parametro");
      int parametro1 = scanner.nextInt();
  
      System.out.println("Por favor, digite o segundo parametro");
      int parametro2 = scanner.nextInt();
      
      scanner.close();
      
      contar(parametro1, parametro2);

    } catch (parametrosInvalidosException e) {

      System.err.println(" *** ERRO *** \nO segundo parametro precisar ser maior que o primeiro");
      
    }
   


  }

  public static void contar(int parametro1, int parametro2) throws parametrosInvalidosException{

    if (parametro1 > parametro2) {
      throw new parametrosInvalidosException();
      
    }

    int resultado = parametro2 - parametro1;

    for(int contagem = 1; contagem <= resultado; contagem ++){
      System.out.println("Contagem dos numeros: "+contagem);
    }



  }

}
