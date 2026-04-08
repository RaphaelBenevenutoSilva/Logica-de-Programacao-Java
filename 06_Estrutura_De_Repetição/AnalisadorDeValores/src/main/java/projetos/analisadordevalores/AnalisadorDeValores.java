package projetos.analisadordevalores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AnalisadorDeValores {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        int soma = 0;
        double media = 0;
        int Par = 0;
        int Div = 0;
        int nulos = 0;
        
        
        for (int i = 1; i <= 5; i++) {
            System.out.printf("Digite o %d° Valor: ", i);
            int valor = teclado.nextInt();
            
           soma = soma + valor;
           
           media = (double) soma / 5;
           
           if (valor % 5 ==0) {
               Div++;
           }
           
           if (valor == 0) {
               nulos++;
           }
           
           if (valor % 2 == 0) {
               Par = Par + valor;
           }
                   
           } 
        
        System.out.printf("A soma entre os valores é %d", soma);
        System.out.print("\nA média entre os valores é " + df.format(media));
        System.out.printf("\nNumeros divisiveis por 5: %d", Div);
        System.out.printf("\nValores nulos: %d", nulos);
        System.out.printf("\nA soma dos valores pares é %d", Par);
        
    }
       
}
