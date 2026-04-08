package projetos.tercapartedeumnumero;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TercaParteDeUmNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#.#");
        
        System.out.print("Digite um numero: ");
        float numero =  teclado.nextFloat();
        
        float n1 = numero * 2;
        float n2 = numero / 3;
        
        System.out.println("O dobro de " + df.format(numero) + " é: " + df.format(n1));
        System.out.println("A terça parte de " + df.format(numero) + " é: " + df.format(n2));
        
        teclado.close();
        
    }
}
