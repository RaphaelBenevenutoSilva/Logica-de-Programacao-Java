package projetos.menumatrizes;

import java.util.Random;
import java.util.Scanner;

public class MenuMatrizes {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random gerador = new Random();

        int[][] valores = new int[4][4];
        int l, c, opcao, sDP = 0;

        for (l = 0; l < 4; l++) {
            System.out.printf("\nCASA DE NUMERO %d\n", (l + 1));
            for (c = 0; c < 4; c++) {
                System.out.println("Digite o valor da posição [" + (l + 1) + "," + (c + 1) + "] ");
                valores[l][c] = gerador.nextInt(100) + 1;

            }
        }
        do {
            System.out.println();
            System.out.println("=".repeat(20));
            System.out.println("   MENU DE OPÇOES");
            System.out.println("=".repeat(20));
            System.out.println("[1] Mostrar a Matriz");
            System.out.println("[2] Diagonal Principal");
            System.out.println("[3] Triangulo Superior");
            System.out.println("[4] Triangulo Inferior");
            System.out.println("[5] Sair");

            System.out.print("==== OPÇÃO: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("\n  MATRIZ:");
                    System.out.println("-".repeat(11));
                    for (l = 0; l < 4; l++) {
                        for (c = 0; c < 4; c++) {
                            System.out.printf("%4d ", valores[l][c]);
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    System.out.println("\n  MATRIZ:");
                    System.out.println("-".repeat(11));
                    for (l = 0; l < 4; l++) {
                        for (c = 0; c < 4; c++) {
                            if (l == c) {
                                System.out.printf("%4d ", valores[l][c]);
                            } else {
                                System.out.print("    ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    System.out.println("\n  MATRIZ:");
                    System.out.println("-".repeat(11));
                    for (l = 0; l < 4; l++) {
                        for (c = 0; c < 4; c++) {
                            if (c > l) {
                                System.out.printf("%4d ", valores[l][c]);
                            } else {
                                System.out.print("     ");
                            }
                        }
                        System.out.println();
                    }

                }
                case 4 -> {
                    System.out.println("\n  MATRIZ:");
                    System.out.println("-".repeat(11));
                    for (l = 0; l < 4; l++) {
                        for (c = 0; c < 4; c++) {
                            if (c < l) {
                                System.out.printf("%4d ", valores[l][c]);
                            } else {
                                System.out.print("     ");
                            }
                        }
                        System.out.println();
                    }
                }
                case 5 ->
                    System.out.println("Operação cancelada");
                default ->
                    System.out.println("Opção inválida!");

            }
        } while (opcao != 5);

    }
}
