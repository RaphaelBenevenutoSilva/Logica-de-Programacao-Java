package projetos.nomesalariodofuncionario;

import java.text.DecimalFormat;
import java.util.Scanner;

public class NomeSalarioDoFuncionario {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Qual é o seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Slario: ");
        float salario = teclado.nextFloat();
        
        System.out.println("O funcionario " + nome + " tem um salário de R$" + df.format(salario) + " mês");
        
        teclado.close();
    }
}
