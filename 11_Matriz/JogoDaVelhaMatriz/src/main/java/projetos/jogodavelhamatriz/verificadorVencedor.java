package projetos.jogodavelhamatriz;

public class verificadorVencedor {

    public static boolean verificarVencedor(String[][] tab, String jogador) {
        for (int i = 0; i < 3; i++) {
            // Verifica Linhas
            if (tab[i][0].equals(jogador) && tab[i][1].equals(jogador) && tab[i][2].equals(jogador)) {
                return true;
            }
            // Verifica Colunas 
            if (tab[0][i].equals(jogador) && tab[1][i].equals(jogador) && tab[2][i].equals(jogador)) {
                return true;
            }
        }
        // Diagonais
        if (tab[0][0].equals(jogador) && tab[1][1].equals(jogador) && tab[2][2].equals(jogador)) {
            return true;
        }
        if (tab[0][2].equals(jogador) && tab[1][1].equals(jogador) && tab[2][0].equals(jogador)) {
            return true;
        }

        return false;
    }
}
