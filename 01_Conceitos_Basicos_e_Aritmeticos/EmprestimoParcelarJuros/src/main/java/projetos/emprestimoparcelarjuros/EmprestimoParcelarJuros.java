package projetos.emprestimoparcelarjuros;

import java.text.DecimalFormat;
import java.util.Scanner;

public class EmprestimoParcelarJuros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df =  new DecimalFormat("0.00");
        
        System.out.print("Qual valor do emprestimo:R$");
        double e = teclado.nextDouble();
        
        System.out.print("Quantas parcelas: ");
        int p = teclado.nextInt();
        
        double juros  = e * 1.20;
        
        double vpfinal = juros / p;
        
        System.out.println("Eu vou pagar " + p + " parcelas de R$" + df.format(vpfinal));
        
        teclado.close();
        
        
        
    }
}
