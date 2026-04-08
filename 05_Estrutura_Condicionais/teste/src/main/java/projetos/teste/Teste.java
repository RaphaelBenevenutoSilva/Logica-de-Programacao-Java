package projetos.teste;
public class Teste {
        // Tradução da "Funcao operacao"
    public static double operacao(int n) {
        double x;
        if (n % 2 == 0) {
            // n ^ 2 em Java usamos Math.pow(base, expoente)
            x = Math.pow(n, 2); 
        } else {
            // n / 2 (usamos 2.0 para garantir que o resultado seja real/double)
            x = n / 2.0;
        }
        return x;
    }

    public static void main(String[] args) {
        double s = 0;

        // Tradução do "Para c <- 1 ate 3 faca"
        for (int c = 1; c <= 3; c++) {
            s = s + operacao(c);
        }

        // Escreva(S)
        System.out.println("O valor final de S é: " + s);
    }
} 
