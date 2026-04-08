package projetos.cadastroseletordepessoas;

import java.util.Scanner;

public class CadastroSeletorDePessoas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int totalPreto = 0;
        int totalCastanho = 0;
        int totalLoiro = 0;
        int totalRuivo = 0;
        String resposta, sexo;
        int opcao, idade;
        int contM = 0;
        int contF = 0;
        
        do{
            System.out.println("=".repeat(20));
            System.out.println("SELETOR DE PESSOAS");
            System.out.println("=".repeat(20));
            while (true) {
                                                
                System.out.print("Qual o Sexo [M/F]? ");
                sexo = teclado.nextLine();                
                                
                if(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f") ) {
                    break;
                } System.out.println("OPÇÃO INVALIDA");
                                
            }
                        
            System.out.print("Qual a idade? ");
            idade = teclado.nextInt();
            teclado.nextLine();
                    
            
            System.out.println("Qual a cor do cabelo? ");
            System.out.println("-".repeat(20));
            System.out.println("[1] Preto");
            System.out.println("[2] Castanho");
            System.out.println("[3] Loiro");
            System.out.println("[4] Ruivo");
            System.out.print("Escolha: ");
            
            opcao = teclado.nextInt();
            teclado.nextLine();
            
            switch (opcao) {
                case 1 -> totalPreto++;
                case 2 -> {
                    if(sexo.equalsIgnoreCase("m") && idade >= 18) {
                      totalCastanho++;
                    }
                }    
                case 3 -> {
                    if(sexo.equalsIgnoreCase("f") && (idade >= 25 && idade <=30)) {
                       totalLoiro++;
                    }
                }    
                case 4 -> totalRuivo++;
                
                default -> System.out.println("OPÇÃO INVÁLIDA");
            } 
            
            
            while (true) {
                System.out.print("Deseja continuar [S/N]? ");
                resposta = teclado.nextLine();
                
                if(resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                    break;
                }else {
                    System.out.println("OPÇÃO INVALIDA");
                }
            }
            
           
        } while(resposta.equalsIgnoreCase("s"));
        
        System.out.printf("Total de Homens com mais de 18 e cabelos castanhos: %d", totalCastanho);
        System.out.printf("\nTotal de Mulheres entre 25 e 30 anos: %d", totalLoiro);
    }
}
