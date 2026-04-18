package projetos.vetorordemsemarrayssort;

import java.util.Scanner;

public class VetorOrdemSemArraysSort {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[4];
        int c, j, aux;

        for (c = 0; c < 4; c++) {
            System.out.print("Digite um valor: ");
            vetor[c] = teclado.nextInt();

        }
        //se compara até a penultima casa (que no caso são 4, então se compara ate é terceira casa '3')
        for (c = 0; c < 3; c++) { //isso seria o numero de "rodadas" de comparação que no caso são 3 rodadas

            // O segundo laço 'j' percorre o restante do vetor (sempre à frente de 'c')
            for (j = c + 1; j < 3; j++) { // começa da proxima casa até a ultima

                // Comparação: Se o valor da esquerda (c) for MAIOR que o da direita (j)...
                if (vetor[c] > vetor[j]) {// se meu vetor na posição 'c' foi maior que que o vetor na posição 'j' vou realizar a troca
                    // vou realizar a troca se o anterior(c) foi maior que o posterior(j)

                    // Usamos a variável 'aux' como um "balde temporário" para não perder o valor
                    aux = vetor[c]; // aux Guarda o primeiro valor (c)
                    vetor[c] = vetor[j]; // primeiro valor vai receber segundo valor (j)' Coloca o valor menor no lugar de C'
                    vetor[j] = aux; // segundo vai receber aux 
                }
            }

            // Ao final de cada ciclo do laço 'c', o menor valor encontrado 
            // já estará garantido na posição correta à esquerda.
        }

        System.out.println("\nValores em ordem crescente:");
        for (c = 0; c < 4; c++) {
            System.out.println("[" + vetor[c] + "]");
        }

    }
}
