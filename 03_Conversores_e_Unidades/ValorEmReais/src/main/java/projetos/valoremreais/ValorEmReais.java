package projetos.valoremreais;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ValorEmReais {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            
            teclado.useLocale(new Locale("pt", "BR"));
            NumberFormat fdolar = NumberFormat.getCurrencyInstance(Locale.US);
            
            for(int i = 1; i <=5; i++) {
                System.out.print("Qual o valor em R$ ");
                
                while (!teclado.hasNextDouble()) { //DESCARTA O ERRO
                    System.out.print("Valor invalido! Qual o valor em R$ ");
                    teclado.next(); 
                }
                double real = teclado.nextDouble();
                
                double dolar = real / 5.19;
                
                System.out.println("O valor convertido é US" + fdolar.format(dolar));
            }
        }
        
    }
}
