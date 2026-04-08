package projetos.fatorialfuncao;

import java.util.Scanner;

public class FatorialFuncao {
    
    static long n, f;
    
    public static long fatorial(long v) {
        
        long r = 1;
        for (long c = 1; c<= v; c++) {
            r *= c;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        
        n = teclado.nextLong();
        
        f = fatorial(n);
        
        System.out.printf("O valor de %d ! é igual a %d", n, f);
        
        teclado.close();

    }
}
