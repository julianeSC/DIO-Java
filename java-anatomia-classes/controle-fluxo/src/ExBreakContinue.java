public class ExBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero ++){
            if (numero == 3) 
                break;

            System.out.println(numero);

            

        }

        for(int num = 1; num <=5; num ++){
            if (num == 3) 
                continue;

            System.out.println(num);

            

        }
    }
}
