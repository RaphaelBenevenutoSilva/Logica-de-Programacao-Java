package projetos.tiposdetriangulos;

import java.util.Scanner;

public class TiposDeTriangulos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Entrada de Dados
        System.out.print("Digite o primeiro lado: ");
        float l1 = teclado.nextFloat();
        System.out.print("Digite o segundo lado: ");
        float l2 = teclado.nextFloat();
        System.out.print("Digite o terceiro lado: ");
        float l3 = teclado.nextFloat();
        boolean podeFormar = false;
        
        //Lógica para verificar se pode formar um triângulo
        //Regra: A soma  de dois lados deve ser sempre maior que terceiro
        podeFormar = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
        
        //Lógica de classificação
        boolean equilatero = podeFormar && (l1 == l2 && l2 == l3);
        boolean escaleno = podeFormar && (l1 != l2 && l2 != l3 & l1 != l3);
        
        // Saída de dados
        System.out.println("Pode formar um TRIANGULO? " + (podeFormar ? "VERDADEIRO" : "FALSO"));
        System.out.println("O triangulo é EQUILATERO? " + (equilatero ? "VERDADEIRO" : "FALSO"));
        System.out.println("O triangulo é ESCALENO? " + (escaleno ? "VERDADEIRO" : "FALSO"));
        
        teclado.close();
    }
}
