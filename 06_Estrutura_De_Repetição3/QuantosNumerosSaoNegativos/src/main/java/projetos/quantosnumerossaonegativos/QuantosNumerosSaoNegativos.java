package projetos.quantosnumerossaonegativos;

import java.util.Scanner;

public class QuantosNumerosSaoNegativos {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int TotN = 0;
        int TotR = 0;
        
        for (int c = 1; c <= 5; c++) {
            
            System.out.print("Digite um numero: ");
            int numero = teclado.nextInt(); 
            
            if (numero < 0) {
                TotN = TotN + 1;
                                
            } 
                       
        }
        
        System.out.printf("Foram digitados %d numeros negativos", TotN);
   
    }
}
