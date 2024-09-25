package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifunional;

public class Fabrica {

	public static void main(String[] args) {
		EquipamentoMultifunional em = new EquipamentoMultifunional();
		
		
		Impressora impressora = em;
	    Digitalizadora digitalizadora = em;
	    Copiadora copiadora = em;
	    
	    impressora.imprimir();
	    digitalizadora.digitalizar();
	    copiadora.copiar();
	}
}
