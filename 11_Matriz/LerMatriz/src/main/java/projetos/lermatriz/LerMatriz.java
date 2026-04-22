package projetos.lermatriz;

import java.util.Scanner;


public class LerMatriz {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Declaração da matriz: 3 linhas e 2 colunas
        // No Java, os índices começam em 0, então mat[3][2] cria os índices 0, 1, 2 e 0, 1
        int [][] mat  = new int[3][2];
        int l, c;
        
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 2; c++) {
                System.out.print("Digite um valor para [" + (l + 1) + "," + (c + 1) + "]: ");
                mat[l][c] = teclado.nextInt();
            }           
            
        }
        // Código para exibir a matriz na tela
        for (l = 0; l < 3; l++) {
            for(c =0; c < 2; c++) {
                System.out.print(mat[l][c] + " ");
            }
            System.out.println();
        }
        
        teclado.close();
    }
}
