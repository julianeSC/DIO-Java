package messenger;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recendo mensagem pelo MSN");
		
	}

	
	
}
