package projetos.produtopromocao;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class ProdutoPromocao {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            Locale brasil = new Locale("pt", "BR");
            NumberFormat moeda = NumberFormat.getCurrencyInstance(brasil);

            int opcao;

            System.out.println("-".repeat(69));
            System.out.println("                  CAMISAS DE TIME COM 5% DE DESCONTO");
            System.out.println("-".repeat(69));

            System.out.println("[1] CAMISA OFICIAL DO REAL MADRID R$400,OO + 5% DE DESCONTO");
            System.out.println("[2] CAMISA OFICIAL DO GUARANI R$180,35 + 5% DE DESCONTO");
            System.out.println("[3] CAMISA OFICIAL DA SELEÇÃO BRASILEIRA R$599,99 + 5% DE DESCONTO");
            System.out.println("[4] CAMISA OFICIAL DO PSG R$459,50 + 5% DE DESCONTO");

            System.out.print("Qual o produto da sua escolha: ");
            opcao = teclado.nextInt();

            double precoVitrine = switch (opcao) { //(pv = preço vitrine)
                case 1 ->
                    400.00;
                case 2 ->
                    180.35;
                case 3 ->
                    599.99;
                case 4 ->
                    459.50;
                default -> {
                    System.out.println("Opção Inválida");
                    yield 0.0; // O yield é usado quando temos blocos {} no case
                }
            };
            if (precoVitrine > 0) {
                double precoDesconto = precoVitrine * 0.05;
                double precoFinal = precoVitrine - precoDesconto;

                System.out.println("-".repeat(69));
                System.out.println("Desconto:" + moeda.format(precoDesconto));
                System.out.print("Total a pagar:" + moeda.format(precoFinal));
            }
          // Fechamos a chave do try e iniciamos o catch
        } catch (Exception e) {
            System.out.println("Erro na leitura dos dados. Certifique-se de digitar apenas números");
        }

    }
}
