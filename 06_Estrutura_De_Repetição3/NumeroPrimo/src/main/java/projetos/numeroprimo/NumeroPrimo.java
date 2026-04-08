package projetos.numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ContDiv = 0;

        System.out.print("Digite um numero: ");
        int numero = teclado.nextInt();

        for (int contador = 1; contador <= numero; contador++) {
            System.out.printf("%d ", contador);

            if (numero % contador == 0) {
                ContDiv = ContDiv + 1;
            }

        }
        System.out.printf("\nAo todo existem %d valores divisiveis", ContDiv);

        if (ContDiv == 2) {
            System.out.printf(", %d É UM NUMERO PRIMO", numero);
        } else {
            System.out.printf(", %d NÃO É UM NUMERO É PRIMO", numero);
        }

        teclado.close();

    }
}
