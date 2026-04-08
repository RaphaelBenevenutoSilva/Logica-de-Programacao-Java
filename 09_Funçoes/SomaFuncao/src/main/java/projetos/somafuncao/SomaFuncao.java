package projetos.somafuncao;

import java.util.Scanner;

public class SomaFuncao {
    
    public static int soma(int x, int y) {
        return x + y;
    }
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int v1, v2, s;
        
        System.out.print("Digite o primeiro valor: ");
        v1 = teclado.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        v2 = teclado.nextInt();
        
        s = soma(v1, v2);
        
        System.out.printf("A soma entre %d e %d é igual a %d", v1, v2, s);
    }
}
