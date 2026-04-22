package projetos.matrizpar;

import java.util.Random;
import java.util.Scanner;

public class MatrizPar {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); // nao preciso de importar o scanner nesse caso
        Random gerador = new Random(); // eu uso esse no lugar do scanner.

        int[][] valores = new int[3][3];
        int l, c, totPar;
        

        for (l = 0; l < 3; l++) {
            System.out.printf("CASA NUMERO %d\n", (l + 1));
            System.out.println("-".repeat(10));

            for (c = 0; c < 3; c++) {

                System.out.println("Digite o valor da posição [" + (l + 1) + "," + (c + 1) + "] ");
                // 3. Gera um número aleatório entre 0 e 100
                // Se quiser de 1 a 100, use gerador.nextInt(100) + 1;                
                valores[l][c] = gerador.nextInt(101);

            }
            System.out.println();
        }

        System.out.println("  MATRIZ:");
        System.out.println("-".repeat(10));
        
        totPar = 0;

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                if (valores[l][c] % 2 == 0) {
                    System.out.printf("{%2d} ", valores[l][c]);
                    totPar = totPar + 1;
                } else {
                    System.out.printf(" %2d  ", valores[l][c]);
                }
            }
            System.out.println();
            
        }
        
        System.out.printf("Ao todo foram digitados %d valores pares", totPar);
        teclado.close();

    }

}
