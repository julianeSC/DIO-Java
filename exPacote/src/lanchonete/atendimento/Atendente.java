package lanchonete.atendimento;

public class Atendente {
	public void servindoMesa() {
		pegarLancheCozinha();
		System.out.println("Servindo mesa");
	}
	
	private void pegarLancheCozinha() {
		System.out.println("Pegando o lanche na cozinha");
	}
	public void recebrPagamento() {
		System.out.println("Recendo pagamento");
	}
	void trocarGas() {
		System.out.println("atendente trocando o gas");
	}
	private void pegarPedidoBalcao() {
		System.out.println("Pegando o pedido no balcao");
	}

}
