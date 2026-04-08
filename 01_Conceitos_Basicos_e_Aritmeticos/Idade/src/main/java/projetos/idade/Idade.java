package projetos.idade;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano nós estamos? ");
        int ano = teclado.nextInt();
        
        System.out.print("Em que ano eu nasci? ");
        int nasci = teclado.nextInt();
        
        int i = ano - nasci;
        
        System.out.println("Minha idade sera de " + i + " anos");
        
        teclado.close();
    }
}
