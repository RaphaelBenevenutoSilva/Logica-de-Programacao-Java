package projetos.combinacoes;

import java.util.concurrent.TimeUnit;

public class Combinacoes {

    public static void main(String[] args) {

        int c1;
        int c2;

        for (c1 = 1; c1 <= 3; c1++) {
            for (c2 = 1; c2 <= 3; c2++) {
                System.out.printf("%d %d\n", c1, c2);
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException erro) {
                    System.err.println("A contagem foi interrompida!");
                }
            }
        }
    }
}
