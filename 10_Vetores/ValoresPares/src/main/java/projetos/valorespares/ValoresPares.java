package projetos.valorespares;

import java.util.Scanner;

public class ValoresPares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Cria um Array (vetor) com 7 espaços para guardar os números inteiros
        int v[] = new int[7];
        int totPar = 0;

        for (int c = 0; c < 7; c++) {
            System.out.printf("Digite o %d° numero: ", (c + 1));
            v[c] = teclado.nextInt();

        }

        for (int c = 0; c < 7; c++) {
            if (v[c] % 2 == 0) {
                totPar = totPar + 1;
                //// Se for par, adiciona +1 ao nosso contador de totais
               System.out.printf("Valor par na posição %d. \n", (c + 1));
            }
        }

        System.out.println("O total de pares foi: " + totPar);

        teclado.close();
    }
}
