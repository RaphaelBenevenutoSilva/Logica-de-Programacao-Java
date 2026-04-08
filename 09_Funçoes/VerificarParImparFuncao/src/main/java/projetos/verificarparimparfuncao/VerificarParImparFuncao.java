package projetos.verificarparimparfuncao;

import java.util.Scanner;

public class VerificarParImparFuncao {

    public static String verificar(int v) {
        if (v % 2 == 0) {
            return "PAR";
        } else {
            return "IMPAR";
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite Um numero: ");
        int n = teclado.nextInt();
               

        System.out.printf("O valor de %d é um numero %s", n, verificar(n));

    }

}
