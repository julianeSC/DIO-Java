package edu.juliane.primeirasemana;

public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao  = 1+1+1+"1";

        concatenacao  = 1+"1"+1+1;

        concatenacao  = 1+"1"+1+"1";

        concatenacao  = 1+("1+1+1");

        System.out.println(concatenacao);

        /*UNARIO */
       /*  int numero = 6;

        numero = - numero;

        System.out.println(numero);

        numero =  numero * -1; /* Para tornar o valor positivo 

        System.out.println(numero); 

        */

        /* INCREMENTO DE NUMERO */

        // repeticao

        int numero = 5;
        numero ++; //numero = numero + 1;
        numero --;
        System.out.println(numero);

        /*Booleano */

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        /*TERNARIO */

        int a,b;
        a =7;
        b =7;

        String resultado = a==b ?"verdadeiro" : "falso" ;
        int resultad = a==b ? 1 : 0 ;

        System.out.println(resultado);
        System.out.println(resultad);

        /* RELACIONAIS */

        String nomeUm = "Juliane";
        String nomeDois = new String("Juliane");
        System.out.println(nomeUm.equals( nomeDois));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("Numero 1 é igual ao numero 2 ? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero 1 é diferente do numero 2 ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero 1 é maior do numero 2 ? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("Numero 1 é menor que o numero 2 ? " + simNao);



        /*Lógicos */

        boolean condicao1 = true;

        boolean condicao2 = true;

        if(condicao1 && (7 > 4) ){
            System.out.println("As duas condições são verdadeiras");

        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");

        }

    }
}
