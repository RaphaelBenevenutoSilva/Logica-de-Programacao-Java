package projetos.quantosentre0e10;

import java.util.Scanner;

public class QuantosEntre0e10 {

    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        int Tot010 = 0;
        int valor = 0;
        int Simp = 0;
        int soma = 0;
        
    for(int c = 1; c <= 6; c++) {
        System.out.print("Digite um valor: ");
        valor = teclado.nextInt();
        
        soma +=valor;
        
        if (valor >=0 && valor <=10) {
           Tot010 = Tot010 + 1;
           } 
        if (valor % 2 != 0) {
           Simp = Simp + valor; 
           }
        }
    System.out.printf("Ao todo foram digitados %d valores entre 0 e 10", Tot010);
    System.out.printf("\nA Soma de impares foi de %d", Simp);
    System.out.printf("\nA soma de todos os numeros foi de %d", soma);    
    }
}
