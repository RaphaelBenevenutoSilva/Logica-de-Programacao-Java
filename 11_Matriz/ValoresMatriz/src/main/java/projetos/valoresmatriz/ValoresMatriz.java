package projetos.valoresmatriz;

import java.util.Random;

public class ValoresMatriz {

    public static void main(String[] args) {

        Random gerador = new Random();

        int[][] m = new int[4][4];
        int l, c, sDP = 0;
        long p2L = 1;
        int maior = 0;
        int soma = 0;
        double media = 0;
        

        for (l = 0; l < 4; l++) {
            System.out.printf("\nCASA DE NUMERO %d\n", (l + 1));
            for (c = 0; c < 4; c++) {
                System.out.print("Digite o valor da posição [" + (l + 1) + "," + (c + 1) + "] ");
                m[l][c] = gerador.nextInt(100) + 1; //gerando numeor aleatorio do 1 ao 100!
                if (l == c) {
                    sDP = sDP + m[l][c];
                }

            }
        }

        System.out.println("\n  MATRIZ:");
        System.out.println("-".repeat(11));

        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) {
                System.out.printf("%4d ", m[l][c]);
            }
            System.out.println();
        }

        for (c = 0; c < 4; c++) {
            p2L = p2L * m[1][c]; //quero multiplicar a linha 2 m[1] ela fica fixa
            //multiplicando m[1] linha 2, com a coluna [c] que sao 1,2,3 e 4. Eu ignoro a linha(que é fixa 'm[1]') e a coluna varia 'c'
        }

        for (l = 0; l < 4; l++) {
            if (m[l][3] > maior) { //MAIOR VALOR DA COLUNA 3 
                maior = m[l][2];
            }
        }
        for (l = 0; l < 4; l++) {
            for (c = 0; c < 4; c++) { //media da soma de todos os numeros
                soma = soma + m[l][c];

            }
            media = soma / 16.0;
        }
        System.out.printf("\nA soma das diagonais é de: %d", sDP);
        System.out.printf("\nO produto dos valores da segunda linha é: %d", p2L);
        System.out.printf("\nO maior numero da coluna 3 é: %d", maior);
        System.out.printf("\nA média somada entre todos os numeros é de %.2f", media);
    }
}
