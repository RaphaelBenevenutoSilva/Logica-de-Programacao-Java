package projetos.numeroantecessorsucessor;

import java.util.Scanner;

public class NumeroAntecessorSucessor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
        System.out.print("DIGITE UM NUMERO:  ");
        int numero = teclado.nextInt();
        
        int n1 = numero - 1;
        
        int n2 = numero + 1;
        
        System.out.println("O Antecessor de " + numero + " é " + n1 );
        System.out.println("O Sucessor de " + numero + " é " + n2);
    }
}
