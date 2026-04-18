package projetos.corrigindoasprovascomgabarito;

import java.util.Scanner;

public class CorrigindoAsProvasComGabarito {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String gabarito[] = new String[5];
        int g, a;
        String aluno[] = new String[3];
        // Criamos uma matriz para salvar as respostas: 3 alunos, 5 questões cada
        String respostaDoAluno[][] = new String[3][5];
        double acertos; //Acumulador temporário para a nota de cada aluno
        double notasAlunos[] = new double[3]; // Guarda a nota de cada aluno
        double somaNotasTurma = 0; // Acumulador para calcular a média geral depois

        System.out.println("-".repeat(30));
        System.out.println("      CADASTRO GABARITO");
        System.out.println("-".repeat(30));

        for (g = 0; g < 5; g++) {
            System.out.printf("Questão %d: ", (g + 1));
            gabarito[g] = teclado.next();

        }
        // 2. CADASTRO DOS ALUNOS E SUAS RESPOSTAS

        for (a = 0; a < 3; a++) {
            System.out.printf("    ALUNO %d\n", (a + 1));
            System.out.print("Nome: ");
            aluno[a] = teclado.next();
            System.out.println("RESPOSTAS DADAS");
            
            acertos = 0; // Acumulador temporário para a nota de cada aluno
                                    
            // Loop aninhado: para cada aluno (a), percorremos as 5 questões (g)
            for (g = 0; g < 5; g++) {
                System.out.printf("Questão %d: ", (g + 1));
                respostaDoAluno[a][g] = teclado.next();
                
                // COMPARAÇÃO: Verifica se a resposta dada é igual ao gabarito na mesma posição, e ele tb le tanto letra maiuscula como minuscula.
                if(respostaDoAluno[a][g].equalsIgnoreCase(gabarito[g])) {
                    acertos = acertos + 2;
                }
            }
            
            notasAlunos[a] = acertos; // Após o loop interno, salvamos a nota final do aluno no vetor de notas
            somaNotasTurma = somaNotasTurma + acertos; // Soma a nota deste aluno ao total da turma para a média futura
            
        }
        System.out.println("\n" + "-".repeat(30));
        System.out.println(" NOTAS FINAIS");
        System.out.println("-".repeat(30));
        
        for(a = 0; a < 3; a++) {
            // Exibe o nome (aluno[a]) e a nota (notasAlunos[a]) formatada com 1 casa decimal
            System.out.printf("%-15s %.1f\n", aluno[a], notasAlunos[a]);
        }
        System.out.println("-".repeat(30));
        // Cálculo final da média: total acumulado dividido pela quantidade de alunos
        double mediaTurma = somaNotasTurma / 3;
        System.out.printf("Média da turma: %.1f\n", mediaTurma);
        
        teclado.close();

    }
}
