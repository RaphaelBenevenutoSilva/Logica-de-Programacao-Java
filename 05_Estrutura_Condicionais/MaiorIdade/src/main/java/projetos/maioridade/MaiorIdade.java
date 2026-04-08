package projetos.maioridade;

import java.util.Scanner;

public class MaiorIdade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Em que ano estamos? ");
        int ano = teclado.nextInt();
        
        System.out.print("Em que ano você nasceu? ");
        int nasc = teclado.nextInt();
        
        int idade = ano - nasc;
        
        //Saída com condicional
        System.out.println("Em " + ano + " você tera " + idade + " anos ");
        
        if (idade >=18) {
            System.out.println("e já terá atingido a maioridade.");
        } else {
            System.out.println("e ainda não terá atingido a maioridade.");
        }
        
        teclado.close();
    }
}
