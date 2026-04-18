package projetos.socomc;

import java.util.Scanner;

public class SoComC {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome[] = new String[10];
        int totalcomC = 0;
        String soC[] = new String[10];

        for (int c = 0; c < 10; c++) {
            System.out.printf("Digite o %d° nome: ", (c + 1));
            nome[c] = teclado.next();

        }

        for (int c = 0; c < 10; c++) {

            char primeiraLetra = nome[c].charAt(0); // Pegamos a primeira letra do nome na posição atual '(0)' e armazenos [c]
            if (primeiraLetra == 'C' || primeiraLetra == 'c') {

                soC[totalcomC] = nome[c]; // Se começar com C, guardamos no vetor soC na posição atual do contador
                totalcomC = totalcomC + 1; // Sobe o contador (ex: se achou 1, o próximo vai para a gaveta 2)

            }
        }

        System.out.println("Total de nome começados com a letra C foram " + totalcomC);
        System.out.println("Listagem dos nome: ");

        for (int c = 0; c < totalcomC; c++) { // c começa em 0 e vai até o valor de totcomC (o total de nomes encontrados)
            System.out.println(soC[c]); // Exibe o nome que está guardado na posição 'c' do array de resultados

            teclado.close();
        }
    }
}
