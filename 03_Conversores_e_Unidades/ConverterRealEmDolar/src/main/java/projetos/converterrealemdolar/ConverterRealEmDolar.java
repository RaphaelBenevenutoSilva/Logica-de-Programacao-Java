package projetos.converterrealemdolar;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ConverterRealEmDolar {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", simbolos);
        
        System.out.print("Quantos Reais eu tenho: R$");
        float r = teclado.nextFloat();
        
        float d = r / 5.19f;
        
        
        System.out.println("Convertendo em dolar será: US$" + df.format(d));
        
        teclado.close();
    }
}
