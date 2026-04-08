package projetos.contadorde10a0;

import java.util.concurrent.TimeUnit;

public class ContadorDe10a0 {
    public static void main(String[] args) {
        
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            
            try {
                // Muito mais óbvio que 1000ms!
                TimeUnit.SECONDS.sleep(1); 
            } catch (InterruptedException e) {
                System.err.println("A contagem foi interrompida!");
            }
        }
        
        System.out.println("Fim da contagem regressiva!");
    }
}