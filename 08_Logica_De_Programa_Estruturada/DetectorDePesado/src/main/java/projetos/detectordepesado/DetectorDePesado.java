package projetos.detectordepesado;

import java.util.Scanner;

public class DetectorDePesado {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso = 0;
        double Mai = 0;
        String nome;
        String Pesado = "Ninguém";

        for (int c = 1; c <= 5; c++) {

            System.out.println("-".repeat(35));
            System.out.println(" D E T E C T O R   DE  P E S A D O");
            System.out.printf(" Maior Peso ate agora: %.2f Kg\n", Mai);
            System.out.println("-".repeat(35));

            System.out.print("Digite o nome: ");
            nome = teclado.nextLine();

            System.out.printf("Digite o peso de %s : ", nome);
            peso = teclado.nextDouble();

            teclado.nextLine();

            if (peso > Mai) {
                Mai = peso;
                Pesado = nome;
            }
        }
        System.out.println("\n-- RESULTADO FINAL");
        System.out.printf("O recorde foi de %s com %.2f Kg!\n", Pesado, Mai);

    }
}
