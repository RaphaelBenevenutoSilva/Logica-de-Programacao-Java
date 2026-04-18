package projetos.turma;

import java.util.Scanner;

public class Turma {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nome[] = new String[4];
        float n1[] = new float[4];
        float n2[] = new float[4];
        float m[] = new float[4];
        float somaMedia = 0;
        int totAlunos = 0;

        for (int c = 0; c < 4; c++) {
            System.out.println("ALUNO" + (c + 1));
            System.out.print("Nome: ");
            nome[c] = teclado.next();
            System.out.print("Primeira nota: ");
            n1[c] = teclado.nextFloat();
            System.out.print("Segunda nota: ");
            n2[c] = teclado.nextFloat();

            m[c] = (n1[c] + n2[c]) / 2;

            somaMedia = somaMedia + m[c];

        }

        float mediaTurma = somaMedia / 4;

        System.out.println("\nLISTAGEM DE ALUNOS");
        System.out.println("-".repeat(25));
        for (int c = 0; c < 4; c++) {

            /* EXPLICANDO O PRINTF:
               %-15s -> Mostra o nome (String) alinhado à esquerda em 15 espaços.
               %.1f  -> Mostra a média (float) com apenas 1 casa decimal. */
            System.out.printf("%-15s %.1f \n", nome[c], m[c]);

            if (m[c] > mediaTurma) {
                totAlunos = totAlunos + 1;
            }

        }

        System.out.printf("\nTotal de alunos que ficaram a cima da média %d em uma turma que a media foi %.1f", totAlunos, mediaTurma);

        teclado.close();

    }
}
