package projetos.parouimparprocedimentos;

import java.util.Scanner;

public class ParOuImparProcedimentos {
    
    static int numero = 0;

    static void ParOuImpar(int V) {
        if (V % 2 == 0) {
            System.out.printf("O número %d é PAR", V);
        }else {
            System.out.printf("O número %d é IMPAR", V);
        }
    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.print("Digite um numero: ");
        numero = teclado.nextInt();
        
        ParOuImpar(numero);
        
    }
    
}
