package projetos.gabaritonotasemedia;
import java.util.Scanner;
public class GabaritoNotaseMedia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char[] gabarito = new char[5];
        String[] nomes = new String[3];
        double[] notas = new double[3];
        double somaNotas = 0;
        
        //PASSO 1 - Cadastro de gabarito
        System.out.println("PASSO 1 - Cadastro de Gabarito");
        System.out.println("-------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.print("Questão " + (i + 1) + ": ");
            gabarito[i] = teclado.next().charAt(0);
        }
// Passo 2 - Cadastro de Alunos e Respostas
        for (int i = 0; i < 3; i++) {
        
        System.out.println("-------------------------------");
            System.out.println("ALUNO" + (i + 1));
         
        System.out.println("--------------------------------");
            System.out.print("Nome: ");
            nomes[i] = teclado.next();
            
        System.out.println("RESPOSTAS DADAS");
            double notaAluno = 0;
            for (int j = 0; j < 5; j++) {
               
        System.out.print("Questão " + (j + 1) + ": ");
            char resposta = teclado.next().charAt(0);
            
// Comparação: se acertar, ganha 2 pontos (total 10)
            if (resposta == gabarito[j]) {
                notaAluno += 2.0;
            }
         } 
         notas[i] = notaAluno;
         somaNotas += notaAluno;
        }
        
// PASSO 3 - Notas finais
        System.out.println("\nNOTAS FINAIS");
        
        System.out.println("--------------------------------");
           for (int i = 0; i < 3; i++) {
               System.out.printf("%s - %.2f%n", nomes[i], notas[i]);
               
           }
        
        System.out.println("---------------------------------");
           double media = somaNotas / 3;
                System.out.printf("Média da Turma: %.2f%n", media);
              
              teclado.close();
         
          
        
    }
}
