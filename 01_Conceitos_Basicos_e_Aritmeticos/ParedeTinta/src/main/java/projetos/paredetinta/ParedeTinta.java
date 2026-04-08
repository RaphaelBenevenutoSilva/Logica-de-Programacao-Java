package projetos.paredetinta;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ParedeTinta {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Largura da Parede (m): "  );
        double larg = teclado.nextDouble();
        
        System.out.print("Altura da Parede (m): ");
        double altu = teclado.nextDouble();
        
        double area = larg * altu;
        double tint = area / 2;
        
        System.out.println("Sua parede tem a dimensão de " + df.format(larg) + "x" + df.format(altu));
        System.out.println("A área total é de " + df.format(area) + " m².");
        System.out.println("Para isso, precisaremos de " + df.format(tint) + " litros de tinta");
                
        
    }
}
