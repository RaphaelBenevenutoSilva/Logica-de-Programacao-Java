package projetos.valoremreaisquantasvezeseuquero;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ValorEmReaisQuantasVezesEuQuero {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            NumberFormat fdolar = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat freal = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

            System.out.print("Quantas vezes você quer converter? ");
            int qv = teclado.nextInt();

            for (int i = 1; i <= qv; i++) {

                System.out.print("Qual o valor: " + freal.getCurrency().getSymbol() + "");

                while (!teclado.hasNextDouble()) { //DESCARTA O ERRO
                    System.out.print("Valor invalido! Qual o valor: " + freal.getCurrency().getSymbol() + "");
                    teclado.next();
                }
                double real = teclado.nextDouble();

                double dolar = real / 5.19;

                System.out.println("O valor convertido é US" + fdolar.format(dolar));
            }
        }

    }
}
