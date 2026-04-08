package projetos.usuarioescolheatequenumeroelequer;

import java.util.Scanner;

public class UsuarioEscolheAteQueNumeroEleQuer {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Escolha um numero: ");
        int numero = teclado.nextInt();

        System.out.print("Escolha quantos saltos você quer que o contador dê: ");
        int salto = teclado.nextInt();

        int contador = 0;

        while (contador <= numero) {
            System.out.println(contador);
            contador = contador + salto;
        }
        System.out.println("Contagem de 0 até " + numero + " finalizada!");

        teclado.close();

    }
}
