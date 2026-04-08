package projetos.somadetodososvaloresdigitadoscodigolimpo;

import java.util.Scanner;

public class SomaDeTodosOsValoresDigitadosCodigoLimpo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int soma = 0;
        // Inicializamos com valores extremos para a lógica de comparação
        int maior = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º valor: ");
            int valor = teclado.nextInt();

            soma += valor; // Mais limpo que soma = soma + valor
            
            // Usando a biblioteca Math para comparar
            maior = Math.max(maior, valor);
            menor = Math.min(menor, valor);
        }

        System.out.printf("Soma total: %d\nMaior: %d\nMenor: %d\n", soma, maior, menor);

        teclado.close();
    }
}