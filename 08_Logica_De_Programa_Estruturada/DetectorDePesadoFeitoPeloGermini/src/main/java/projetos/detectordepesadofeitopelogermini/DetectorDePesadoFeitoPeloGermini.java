package projetos.detectordepesadofeitopelogermini;

import java.util.Scanner;

public class DetectorDePesadoFeitoPeloGermini {

    // --- ESTE É O SEU PROCEDIMENTO "TOPO" ---
    // Ele recebe o maior peso e o nome do pesado para desenhar na tela
    static void Topo(double m, String p) {
        // Limpa a tela (pulando linhas) para dar o efeito de atualização
        
        System.out.println("----------------------------------");
        System.out.println(" D E T E C T O R  D E  P E S A D O ");
        System.out.printf(" Maior Peso ate agora: %.2f Kg (%s)\n", m, p);
        System.out.println("----------------------------------");
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double peso;
        double Mai = 0;
        String nome;
        String Pesado = "Ninguém";

        // Laço para 5 pessoas
        for (int c = 1; c <= 5; c++) {
            
            // CHAMADA DO PROCEDIMENTO (Igual ao Soma(X, Y) do seu exemplo)
            Topo(Mai, Pesado);

            System.out.print("Digite o nome da " + c + "a pessoa: ");
            nome = teclado.nextLine();

            System.out.printf("Digite o peso de %s: ", nome);
            peso = teclado.nextDouble();
            
            // Limpa o "Enter" do teclado para não pular o próximo nome
            teclado.nextLine(); 

            // Lógica para verificar o mais pesado
            if (peso > Mai) {
                Mai = peso;
                Pesado = nome;
            }
        }

        // Chama o topo uma última vez para mostrar o resultado final fixado
        Topo(Mai, Pesado);
        System.out.println("A pessoa mais pesada foi " + Pesado + " com " + Mai + " Kg.");
    }
}