package projetos.somadetodososvaloresdigitados;

import java.util.Scanner;

public class SomaDeTodosOsValoresDigitados {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int soma = 0;
        int valor;
        int maior = 0;
        int menor = 0;

        // TUDO EM UMA LINHA: (início; condição; incremento)
        for (int contador = ; contador <= 5; contador++) {
            System.out.print("Digite o " + contador + "º valor: ");
            valor = teclado.nextInt();

            soma += valor;

            if (contador == 1) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        } 

        System.out.println("A soma de todos os valores foi: " + soma);
        System.out.println("E o maior numero digitado foi " + maior);
        System.out.println("E o menor numero digitado foi " + menor);

        teclado.close();
    }
}