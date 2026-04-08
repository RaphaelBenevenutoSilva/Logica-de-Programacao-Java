package projetos.notaaluno;

import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("-".repeat(24));
        System.out.println("ESCOLA BARÃO DE REZENDE");
        System.out.println("-".repeat(24));
        
        System.out.print("Primeira Nota: ");
        float n1 = teclado.nextFloat();
        
        System.out.print("Segunda Nota: ");
        float n2 = teclado.nextFloat();
        
        System.out.println("-".repeat(24));
        
        float m = (n1 + n2) / 2;
        
        System.out.print("MÉDIA: " + m);
                
        if (m >= 6) {
            System.out.println("\nALUNO APROVADO");
        } else if (m >= 5 && m <6) {
            System.out.println("\nALUNO EM RECUPERAÇÃO");
        } else {
            System.out.println("\nALUNO REPROVADO");
        }
        System.out.println("-".repeat(24));
        
        teclado.close();
    }
}
