package projetos.menucontadorswitch;

import java.util.Scanner;

public class MenuContadorSwitch {

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
            
            switch (opcao) {
                case 1:
                   for (int contador = 1; contador <= 10; contador++) { 
                       System.out.print(contador + "."); }
                   System.out.println();
                   break;
                   
                case 2:
                   for (int contador = 10; contador >= 1; contador--){ 
                       System.out.print(contador + "."); }
                   System.out.println();
                   break;
                   
                case 3:
                   System.out.println("SAINDO DO MENU..");
                   break;
                   
                default:
                   System.out.println("Opção Inválida!");
                   break;
            }  
            
        } while (opcao != 3);
        
        teclado.close();      
    }
}
