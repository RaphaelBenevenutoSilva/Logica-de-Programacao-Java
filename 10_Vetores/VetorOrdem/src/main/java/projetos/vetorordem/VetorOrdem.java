package projetos.vetorordem;

import java.util.Arrays;
import java.util.Scanner;

public class VetorOrdem {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vetor[] = new int[4];
        int c;

        for (c = 0; c < 4; c++) {

            System.out.print("Digite um valor: ");
            vetor[c] = teclado.nextInt();

        }
        // PROCESSAMENTO:
        // O comando abaixo organiza os números do menor para o maior
        Arrays.sort(vetor);
        
        
        /* COMO FUNCIONA ESSE FOR:
           Pense nele como uma frase: "Para cada 'valor' que estiver dentro do 'vetor'..."
           
           1. 'int valor': Você cria uma variável temporária que vai segurar UM número por vez.
           2. ':' : Esse símbolo significa "DENTRO DE" ou "EM".
           3. 'vetor': É o nome da sua lista de números.
           
           O Java faz o seguinte sozinho:
           - Ele vai na posição [0], pega o número e joga em 'valor'. Aí executa o println.
           - Ele vai na posição [1], pega o número e joga em 'valor'. Aí executa o println.
           - Ele faz isso até o final da lista automaticamente, sem você precisar de contador (c++).
        */
        for (int valor : vetor) {
            System.out.println(valor);

        }

    }
}
