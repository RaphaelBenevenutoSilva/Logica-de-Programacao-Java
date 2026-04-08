package projetos.notasdosalunosmelhoraproveitamento;

import java.util.Scanner;

public class NotasDosAlunosMelhorAproveitamento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String melhorAluno = "";
        float maiorNota = 0;
        
        System.out.print("Quantos alunos tem: ");
        int quantidadeAluno = teclado.nextInt();
        teclado.nextLine();
        
        for (int i = 1; i <= quantidadeAluno; i++) {
            
            System.out.println("ALUNO " + i);
            
            System.out.print("Nome do aluno: ");
            String nome = teclado.nextLine();
            
            System.out.print("Nota de " + nome + ": " );
            float nota = teclado.nextFloat();
            teclado.nextLine();  
            
            if (nota > maiorNota) {
                maiorNota = nota;
                melhorAluno = nome;
            }
                                                                 
        }
        
        System.out.println("O melhor aproveitamento foi de " + melhorAluno + "com a nota " + maiorNota);
        
        
        
    }
}
