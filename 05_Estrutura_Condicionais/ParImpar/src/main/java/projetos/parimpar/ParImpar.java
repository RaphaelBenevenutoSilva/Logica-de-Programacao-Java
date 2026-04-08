package projetos.parimpar;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero qualquer: ");
        int n = teclado.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("O numero " + n + " é Par");
        } else {
            System.out.println("O numero " + n + " é Impar");            
        }
    }
}
