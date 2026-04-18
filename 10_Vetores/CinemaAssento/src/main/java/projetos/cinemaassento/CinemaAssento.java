package projetos.cinemaassento;

import java.util.Scanner;

public class CinemaAssento {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // O vetor funciona como 10 caixinhas. Todas começam como 'false' (vazias).
        boolean ocupado[] = new boolean[10];
        int cadeira;
        String resposta;

        // Desenha a fileira
        do {
            for (int c = 0; c < 10; c++) {
                // O '!' inverte a lógica. Se ocupado[c] for false, o '!' torna true.
                // Lemos assim: "Se NÃO estiver ocupado...
                if (!ocupado[c]) {
                    System.out.printf("[ B%d]", (c+1));
                } else {
                    // Se o vetor tiver 'true', cai aqui e desenha os tracinhos.
                    System.out.printf("[ --- ]");
                }
            }
            System.out.println();

            //PEDIR A RESERVA
            // Lembre-se: Cadeira 1 é o índice 0, por isso usamos (cadeira - 1)
            System.out.print("Reservar cadeira: B");
            cadeira = teclado.nextInt();
            
            // 1ª Validação: O número existe? (Entre 1 e 10)
            if (cadeira < 1 || cadeira > 10) { 
                System.out.println("ERRO! CADEIRA INVÁLIDA.");
            } 
            // 2ª Validação: A caixinha do vetor na posição (cadeira-1) já está 'true'?
            else if (ocupado[cadeira - 1]) {
                System.out.println("LUGAR JÁ ESTÁ OCUPADO.");
            } 
            // 3ª Ação: Se passou pelas travas, marca como 'true' (ocupa o lugar)
            else {
                ocupado[cadeira - 1] = true; // Marca a posição no vetor como ocupada
                System.out.println("Cadeira B " + cadeira + " RESERVADA!");
            }

            while (true) {
                System.out.print("Quer reservar outro [S/N]? ");
                resposta = teclado.next();
                System.out.println();

                if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("n")) {
                    break;
                } else {
                    System.out.println("OPÇÃO INVALIDA!");
                }
            }
          // Se a resposta foi 's', o 'do' lá de cima repete tudo de novo
        } while (resposta.equalsIgnoreCase("s"));

    }
}
