import java.util.Scanner;

import Aplicativo.ReprodutorMusical.Musica;
import Interface.Iphone;

public class Usuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();
        Musica musica = new Musica();

        int opcao;
        do {
            System.out.println("***** Escolha as opções: \n 1- Musica  \n 2- Ligar \n 3- Navegar  \n 0 - Sair \n");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite a música deseja ");
                    String escolha = scanner.next();
                    musica.selecionarMusica(escolha);
                    iphone.tocar();
                    iphone.pausar();

                    break;
                case 2:
                    System.out.println("DIGITE O NUMERO PARA  LIGAR");
                    int numero = scanner.nextInt();
                    iphone.ligar(numero);
                    iphone.atender();
                    iphone.iniciarCorreioVoz();

                    break;

                case 3:
                    System.out.println("Digite o site  desejada");
                    String endereco = scanner.next();
                    iphone.exibirPagina(endereco);
                    iphone.adicionarNovaAba();
                    iphone.atualizarPagina();

                    break;

                default:
                    System.out.println("Por favor, digite o numero correto");
                    break;
            }

        } while (opcao != 0);
        scanner.close();

    }

}
