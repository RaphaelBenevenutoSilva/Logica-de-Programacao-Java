package projetos.menucontador;

import java.util.Scanner;

public class MenuContador {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("=".repeat(17));
            System.out.println("|     MENU      |");
            System.out.println("| [1] DE 1 A 10 |");
            System.out.println("| [2] DE 10 A 1 |");
            System.out.println("| [3] SAIR      |");
            System.out.println("=".repeat(17));

            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();

            if (opcao == 1) {
                for (int contador = 1; contador <= 10; contador++) {
                    System.out.print(contador + ", ");
                }
                System.out.println();
                
            } else if (opcao == 2) {
                for (int contador = 10; contador >= 1; contador--) {
                    System.out.print(contador + ", ");
                }
                System.out.println();
                
            } else if (opcao == 3) {
                System.out.println("SAINDO DO MENU");
            } else {
                System.out.println("OPÇÃO INVALIDA");
            }
        } while(opcao != 3);
        
        teclado.close();
    }
}
