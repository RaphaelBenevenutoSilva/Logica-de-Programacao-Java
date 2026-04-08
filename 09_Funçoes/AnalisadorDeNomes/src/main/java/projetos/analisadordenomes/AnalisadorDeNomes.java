package projetos.analisadordenomes;

import java.util.Scanner;

public class AnalisadorDeNomes {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a letra que você quer descobrir o código: ");
        char letraBusca = teclado.next().charAt(0);
        
        int valorAscii = (int) letraBusca;
        int fim = Math.min(nome.length(), 10);
        
        System.out.println("Total de letras do seu nome: " + nome.length());
        System.out.println("Seu nome em maiusculas é: " + nome.toUpperCase());
        System.out.println("Seu nome em minusculas é: " + nome.toLowerCase());
        System.out.println("A primeira letra do seu nome é :" + nome.charAt(0));
        System.out.println("A ultima letra do seu nome é: " + nome.charAt(nome.length()-1));
        System.out.println("Obter (inicio de posição) e (quantidade de letra) : " + nome.substring(0, fim));
        System.out.print("A letra A aparece na posição: " );
        for(int i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == 'a') {
                System.out.print(i + ", ");
            }
        }
        System.out.printf("\nO código ASCIII da letra %s é %d", letraBusca, valorAscii);
        System.out.print("\nSeu nome ao contrário é: ");
        for (int i = nome.length() - 1; i>= 0; i--) {
            System.out.print(nome.charAt(i));
        }
        teclado.nextLine();
        
    }
}
