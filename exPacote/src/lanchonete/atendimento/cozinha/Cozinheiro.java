package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	
	 void adicionarLancheNoBalcao() {
		System.out.println("Adicionando lanche natural hamburguer no balcao");
	}
	
	 void adicionarSucoNoBalcao() {
		System.out.println("Adcionando suco no balcao");
	}
	void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	
	private void prepararLanche() {
		System.out.println("Preparando lanche tipo Hamburguer");
	}
	private void prepararVitamina() {
		System.out.println("Preparando suco");
	}
	private void preparandoCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("selecioando o pão, salada, ovo e carne");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("selecionando fruta, leite e suco");
	}
	private void lavarIngredientes() {
		System.out.println("Lavando ingredientes");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("Batendo vitamina liquidificador");
	}
	private void fritarIngredientesLanche() {
		System.out.println("Fritando a carne e ovo para o hamburguer");
	}
	 void pedirParaTrocarGas(Almoxarife meuamigo) {
		meuamigo.trocarGas();
	}
	void PedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}

}
