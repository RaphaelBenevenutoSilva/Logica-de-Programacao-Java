package projetos.jogodavelhamatriz;

import java.util.Scanner;

public class JogoDaVelhaMatriz {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i, j;
        String posicao;
        int totalJogadas = 0; // Para verificar empate

        // Criação da matriz 3x3 para o tabuleiro
        String[][] tabuleiro = {
            {"1", "2", "3"},
            {"4", "5", "6"},
            {"7", "8", "9"}
        };

        boolean jogoAtivo = true;
        String jogadorAtual = "X";

        while (jogoAtivo) {

            System.out.println("+---+---+---+");
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print("| " + tabuleiro[i][j] + " ");
                }
                System.out.println("|");
                System.out.println("+---+---+---+");
            }
            // Pergunta a posição
            System.out.print("Vai jogar [" + jogadorAtual + "] em qual posição: ");
            posicao = teclado.next();

            boolean jogadaValida = false;

            // Percorre a matriz para encontrar a posição e marcar
            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    if (tabuleiro[i][j].equals(posicao)) {
                        tabuleiro[i][j] = jogadorAtual;
                        jogadaValida = true;
                    }
                }
            }
            if (jogadaValida) {
                // VERIFICAÇÃO DE VITÓRIA
                if (verificadorVencedor.verificarVencedor(tabuleiro, jogadorAtual)) {
                    System.out.println("\nPARABÉNS! O jogador [" + jogadorAtual + "] venceu!");
                    jogoAtivo = false;
                } else if (totalJogadas == 9) { // VERIFICAÇÃO DE EMPATE
                    System.out.println("\nDEU VELHA! Ninguém venceu.");
                    jogoAtivo = false;
                }
                jogadorAtual = (jogadorAtual.equals("X")) ? "0" : "X";
            } else {
                System.out.println("Posição inválida ou já ocupada! Tente novamente.");
            }
        }
        

    }
}
