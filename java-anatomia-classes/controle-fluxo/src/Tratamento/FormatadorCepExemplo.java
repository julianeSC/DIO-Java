package Tratamento;

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatadorCep("4134920");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.err.println("O cep não corresponde as regras de negocio");
            
        }
    }

    static String formatadorCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8) 
            throw new CepInvalidoException();

            // simulando ceo formatado
            return " 94.134-920";
        
    }
}
