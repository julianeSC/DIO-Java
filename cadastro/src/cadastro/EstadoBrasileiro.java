package cadastro;

public enum EstadoBrasileiro {
	
	SAO_PAULO("SP","São Paulo", 12),
	RIO_JANEIRO("RJ","Rio de Janeiro", 13),
	PIAUI("PI","Piauí", 14),
	MARANHAO("MA","Maranhão",15),
	CEARA("CE", "CEARA", 16);
	
	private String nome;
	private String sigla;
	private int ibge;
	
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}

	public int getIbge() {
		return ibge;
	}
	public String getNome() {
		return nome;
	}


	public String getSigla() {
		return sigla;
	}

	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	
	
	
	

}
