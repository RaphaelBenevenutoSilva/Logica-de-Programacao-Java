package projetos.anguloseno;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AnguloSeno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat("#.#"); //Para deixar o resultado Limpo
        
        System.out.print("Informe um angulo: ");
        double anguloGraus = teclado.nextDouble();
        
        // O java precisa converter Graus para Radianos primeiro
        double radiano = Math.toRadians(anguloGraus);
        
        //Agora calculamos o Seno 
        double seno = Math.sin(radiano);
        
        System.out.println("O Seno de " + anguloGraus + " é igual a " + df.format(seno));
        
        teclado.close();
    }
}
