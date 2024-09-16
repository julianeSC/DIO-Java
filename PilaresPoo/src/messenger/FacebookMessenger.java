package messenger;

public class FacebookMessenger  extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recendo mensagem pelo Facebook");
		
	}

}
