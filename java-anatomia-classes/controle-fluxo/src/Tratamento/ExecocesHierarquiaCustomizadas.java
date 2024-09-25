package Tratamento;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExecocesHierarquiaCustomizadas {
    public static void main(String[] args) {
        //Number valor = Double.valueOf("a1.75");

        Number valor1;
        try {
            valor1 = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor1);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
}
