package projetos.testevetor;

import java.util.Scanner;

public class TesteVetor {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Declaração de um array de 6 posições (índices de 0 a 5)
        int[] v = new int[6];
                
        /* * Em Java, arrays usam indexação zero. 
        * Iniciamos o contador em 0 e vamos até < v.length (ou < 6)
        */
       for (int c = 0; c < v.length; c++) { 
           System.out.printf("Digite o %d° valor: ", (c + 1));
           v[c] = teclado.nextInt();
           
       }
       
       for (int c = 0; c < 6; c++) {
           System.out.print("[" + v[c] + "]");
       }
       
       teclado.close();
    }
}
