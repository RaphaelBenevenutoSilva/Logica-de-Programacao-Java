package projetos.somafatorialquercontinuarsimounao;

import java.util.Scanner;

public class SomaFatorialQuerContinuarSimOuNao {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                
        String resposta;
        
        do {
            System.out.print("Digite um numero: ");
            int numero = teclado.nextInt();
            
            long f = 1; //Reiniciar o fatorial para 1 a cada nova rodada
            int c;
            
            for (c = numero; c >= 1; c--) {
                f *= c;
            }
            
            System.out.printf("O fatorial de %d é %,d\n", numero, f);

            while (true) { //Loop de validação da resposta
                System.out.print("Quer continuar [S/N]: ");
                resposta = teclado.next();

                if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("OPÇÃO INVALIDA!");
                }
            }
            
        } while (resposta.equalsIgnoreCase("s"));
        
        System.out.println("FIM");        
        
    }
}
