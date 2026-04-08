package projetos.desejacontinuarsimounao;

import java.util.Scanner;

public class DesejaContinuarSimOuNao {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        String resposta;
        int numero;
        int total = 0; //essa variavél guarda o acúmulo
        
        do { 
            System.out.println("==== OPERAÇÃO DE ADIÇÃO ====");
            
            System.out.print("Digite um número para somar: ");
            numero = teclado.nextInt();
            
            total += numero;
            
            while (true) { //loop de validação: só sai daqui se digitar s ou n
            
               System.out.print("Quer continuar adicionando? [S/N]? ");
               resposta = teclado.next();
                           
               if(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                  break; // sai do loop de validação porque a resposta é válida
               }else {
                  System.out.println("OPÇÃO INVÁLIDA! Digite apenas S para sim e N para não.");
               }
            }
            
            System.out.println("-".repeat(15));
            
        } while (resposta.equalsIgnoreCase("s"));
        
        System.out.println("Soma total acumulado: " + total);
        System.out.println("Programa finalizado.");
        teclado.close();

    }
}
