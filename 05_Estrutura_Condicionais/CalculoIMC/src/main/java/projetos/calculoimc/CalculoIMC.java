package projetos.calculoimc;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String situacao;
        
        System.out.print("Massa (Kg): ");
        double m = teclado.nextDouble();
        
        System.out.print("Altura (M): ");
        double a = teclado.nextDouble();
        
        double IMC = m / Math.pow(a, 2);
        
        System.out.print("IMC: " + df.format(IMC));
        
        if (IMC < 17) {
            situacao = ("Muito abaixo do peso");
        } else if (IMC >= 17 && IMC < 18.5) {
            situacao = ("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC < 25) {
            situacao = ("Peso ideal");
        } else if (IMC >= 25 && IMC < 30) {
            situacao = ("Sobrepeso");
        } else if (IMC >= 30 && IMC < 35) {
            situacao = ("Obesidade");
        } else if (IMC >= 35 && IMC < 40) {
            situacao = ("Obesidade Severa");
        }  else {
            situacao = ("Obesidade Mórbida");
        }
        System.out.println("\nSituação: " + situacao);
        teclado.close();
    }
}
