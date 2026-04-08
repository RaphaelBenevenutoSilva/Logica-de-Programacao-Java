package projetos.fatorialdeumnumero;

import java.util.Scanner;

public class FatorialDeUmNumero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        long f= 1;
        
        System.out.print("Escolha um numero: ");
        int numero = teclado.nextInt();
        
        for(int c = numero; c >= 1 ; c--) {
            
            f = f * c;
            
            System.out.printf("%d X %d\n", c , numero);
                                    
                        
        } 
                          
        System.out.print("O valor é igual a: " + f);   
        
    }
}
