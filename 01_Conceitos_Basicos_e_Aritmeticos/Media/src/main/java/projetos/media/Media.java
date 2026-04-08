package projetos.media;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner media = new Scanner(System.in); 
        
        // O padrão "#.#" significa: mostre o numero e, se houver decimal, mostre 1 casa
        DecimalFormat df = new DecimalFormat("#.#");
            
        System.out.print("Informe um numero: ");
        int n1 = media.nextInt(); 
        
        System.out.print("Informe ouro numero: ");
        int n2= media.nextInt();
        
        //Cálculo da média
        float m = (n1 + n2) / 2.0f;
        
        System.out.println("A média entre " + n1 + " e " + n2 + " é igual a " + df.format(m));
        
        media.close();
        
    }
}
