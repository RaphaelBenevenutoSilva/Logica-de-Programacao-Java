package projetos.opcaocriancaesperanca;


import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OpcaoCriancaEsperanca {
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
                
        Locale brasil = new Locale("pt", "BR");
        NumberFormat moeda = NumberFormat.getCurrencyInstance(brasil);        
        
        
        int opcao;
        double valor = 0;
        
        System.out.println("-".repeat(27));
        System.out.println("     CRIANÇA ESPERANÇA");
        System.out.println("-".repeat(27));
        System.out.println(" Muito obrigado por ajudar");
        System.out.println("[1] para doar R$10");
        System.out.println("[2] para doar R$25");
        System.out.println("[3] para doar R$50");
        System.out.println("[4] para doar outros valores");
        System.out.println("[5] para cancelar");
        
        System.out.print("Escolha uma opção: ");
        opcao = teclado.nextInt();
        
        if (opcao == 1) {
            valor = 10;
        } else if (opcao == 2) {
            valor = 25;
        } else if (opcao == 3) {
            valor = 50;
        } else if (opcao == 4) {
            System.out.print("Qual o valor da doação: R$");
            valor = teclado.nextDouble();
        } else if (opcao == 5) {
            System.out.println("Doação cancelada.");
        } else {
            System.out.println("Opção Invalida.");
        }
        
        if (opcao >= 1 && opcao <=4) {
            System.out.println("-".repeat(27));
            System.out.println("SUA DOAÇÃO FOI DE R$ " + moeda.format(valor));
            System.out.println("MUITO OBRIGADO!");
            System.out.println("-".repeat(27));
            teclado.close();
            
        }
        
        
    }
}
