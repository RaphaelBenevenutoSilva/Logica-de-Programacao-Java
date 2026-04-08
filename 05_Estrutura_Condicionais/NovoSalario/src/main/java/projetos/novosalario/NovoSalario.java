package projetos.novosalario;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class NovoSalario {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            Locale brasil = new Locale("pt", "BR");
            NumberFormat moeda = NumberFormat.getCurrencyInstance(brasil);
            
            
            System.out.print("Qual o nome do Funcionário: ");
            String nome = teclado.nextLine();
            
            System.out.print("Qual o salario do funcionario: ");
            double sal = teclado.nextDouble();
            
            System.out.print("Qual é a quantidade de dependentes: ");
            int dep = teclado.nextInt();
            
            double novoSal = switch (dep) {
                case 0 -> sal + (sal * 5 / 100);
                case 1, 2, 3 -> sal + (sal * 10 / 100);
                case 4, 5, 6 -> sal + (sal * 15 / 100);
                default -> sal + (sal* 18 / 100);
            };
            System.out.println("O novo salario de " + nome);
            System.out.println("Será de: " + moeda.format(novoSal));
        }
        
    }
}
