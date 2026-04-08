package projetos.opcaocriancaesperancausandoswitch;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class OpcaoCriancaEsperancaUsandoSwitch {
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
        
        switch (opcao) {
            case 1 -> valor = 10;
            case 2 -> valor = 25;
            case 3 -> valor = 50;
            case 4 -> {
                System.out.print("Qual o valor da doação: ");
                valor = teclado.nextDouble();
            }
            case 5 -> System.out.println("Doação cancelada.");
            default -> System.out.println("Opção inválida.");
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
