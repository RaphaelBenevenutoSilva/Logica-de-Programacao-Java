package projetos.valorepares;

import java.util.Scanner;

public class ValorePares {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = 0;

        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();

        if (valor % 2 != 0) {
            valor = valor - 1;
        }

        for (int c = valor; c >= 0; c = c -= 2) {
            System.out.println(c);
        }
    }

}
