package candidatura;

import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		imprimirSelecionados();
		String [] candidatos = {"Maria","Joao","Felipe","Antonio","Marcela"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
		

	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if (continuarTentando) {
				tentativasRealizadas ++;
			}else {
				System.out.println("Contato realizado com sucesso");
			}
			
		} while (continuarTentando && tentativasRealizadas<3);
		
		if (atendeu) {
			System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativas ");
			
		}else {
			System.out.println("Não conseguimos contato com " + candidato + ", número máximos de tentativas " + tentativasRealizadas);
		}
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	static void imprimirSelecionados () {
		String [] candidatos = {"Maria","Joao","Felipe","Antonio","Marcela"};
		System.out.println("Impriminfo a lista de candidatos informando o indice do elemento");
		for (int indice = 0; indice < candidatos.length; indice ++) {
			System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
			
		}
		
		System.out.println("Forma abreviada de interação for each");
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi " +candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"Maria","Joao","Felipe","Antonio","Marcela","Antonia","Cleber","Paulo","Bruna","Gabriel"};
		int candidatosSelecionados = 0;
		int candidatosAtual = 0 ;
		double salarioBase = 2000.0;
		while (candidatosSelecionados <5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitatou este valor de salário " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
				candidatosSelecionados ++;
				
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	static void analisarCandidatura(double salarioPrentendido ) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPrentendido) {
			System.out.println("Ligar para o candidado");
		}else if(salarioBase == salarioPrentendido) {
			System.out.println("Ligar para o candidato com contra proposta");
		}else {
			System.out.println("Aguardando o resultado dos demais candidatos");
		}
	}

}
