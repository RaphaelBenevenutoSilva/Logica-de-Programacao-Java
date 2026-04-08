package projetos.tabuada;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quer ver a tabuada de qual numero: ");
        int numero = teclado.nextInt();

        for (int c = 0; c <= 10; c++) { //"c" = contagem

            int resultado = numero * c;

            System.out.printf("%d X %d = %d\n", numero, c, resultado);

        }

        teclado.close();
    }
}
