
package projetos.confrontosdarodada;

import java.util.Scanner;

public class ConfrontosDaRodada {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String times[] = new String[3];
        int c, f; 
        
        System.out.println("-".repeat(36));
        System.out.println("      CONFRONTOS DO CAMPEONATO");
        System.out.println("-".repeat(36));
        
        for( c = 0; c < 3; c++) {
            System.out.printf("Nome do %d° time: ", (c + 1));
            times[c] = teclado.nextLine();
            
        }
        
        System.out.println();
        System.out.println("-".repeat(36));
        System.out.println("         TABELA DE PARTIDAS");
        System.out.println("-".repeat(36));
        
        // Geração da tabela de partidas (Ida e Volta)
        
        
        for ( c = 0; c < 3; c++) { // O primeiro laço (c) representa o TIME DA CASA (Mandante)
            
            
            // Para CADA time da casa, o segundo laço (f) vai percorrer 
            // TODOS os times novamente para serem o VISITANTE
            for(f = 0; f < 3; f++ ) {  
                
                // LOGICA DE CONDUÇÃO:
                // c: controla a linha (quem joga primeiro)
                // f: controla a coluna (contra quem joga)
                
                // Condição para o time não jogar contra ele mesmo
                if ( c != f) {
                    System.out.printf("%-10s [ ] x [ ] %s\n", times[c], times[f]);
                }
            }
        }
        teclado.close();
    }
}
