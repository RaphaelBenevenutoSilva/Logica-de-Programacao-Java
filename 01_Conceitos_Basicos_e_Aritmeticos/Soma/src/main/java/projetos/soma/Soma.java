package projetos.soma;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);
        
        // Usamos System.out.print (sem o 'ln') para o cursor ficar ao lado do texto
        System.out.print("Informe um numero: ");
        int n1 = soma.nextInt();
        
        System.out.print("Informe o outro numero: ");
        int n2 = soma.nextInt();
        
        //Exemplo opcional: somando valores
        int s = n1 + n2;
        System.out.println("A soma entre " + n1 + " e " + n2 + " é igual a " + s);
        
        soma.close();
           
        
    }
}
