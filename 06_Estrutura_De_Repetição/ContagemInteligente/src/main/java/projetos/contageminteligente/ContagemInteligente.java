package projetos.contageminteligente;

import java.util.Scanner;
import java.util.StringJoiner;

public class ContagemInteligente {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        StringJoiner virg = new StringJoiner(","); //define que o separador é virgula
        
        System.out.println("-".repeat(20));
        System.out.println("CONTAGEM INTELIGENTE");
        System.out.println("-".repeat(20));
        
        System.out.print("INICIO: ");
        int inicio = teclado.nextInt();

        System.out.print("FIM: ");
        int fim = teclado.nextInt();
        

        if (inicio <= fim) {
            for (int contador = inicio; contador <= fim; contador++) {
                virg.add(String.valueOf(contador));
               }
        } else {
            for (int contador = inicio; contador >= fim; contador--) {
                virg.add(String.valueOf(contador));
               }
           
        }  
        System.out.println(virg.toString() + ".");     
    }
}
