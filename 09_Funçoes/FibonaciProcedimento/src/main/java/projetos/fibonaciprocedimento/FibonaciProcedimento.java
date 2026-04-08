package projetos.fibonaciprocedimento;


import java.util.Scanner;

public class FibonaciProcedimento {
    
    static long i, t1, t2, t3, n; // Variaveis globais

    public static long procedimentoFibonacci(long n1, long n2) {
        long n3;
        
        n3 = n1 + n2;
        return n3;       
        
    }           

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
                        
        System.out.print("Digite a posição da sequencia: ");
        n = teclado.nextLong();
        
        t1 = 0;
        System.out.printf("%d ", t1);
        
        t2 = 1;
        System.out.printf("%d ", t2);
        
        for (i = 3; i <= n; i++) {
            t3 = procedimentoFibonacci(t1, t2);
            System.out.printf("%d ", t3);
            
            t1 = t2;
            t2 = t3;
        }
        teclado.close();
        
    }
}
