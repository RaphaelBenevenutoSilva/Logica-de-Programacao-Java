package projetos.projetocadastrocomswitch;

import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoCadastroComSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> usuarios = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Buscar usuário");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine();

                    usuarios.add(new Usuario(nome, idade));
                    System.out.println("Usuário cadastrado!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Usuários ---");
                    for (Usuario u : usuarios) {
                        System.out.println("Nome: " + u.nome + " | Idade: " + u.idade);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome para busca: ");
                    String busca = scanner.nextLine();
                    boolean encontrado = false;

                    for (Usuario u : usuarios) {
                        if (u.nome.equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: " + u.nome + " | " + u.idade);
                            encontrado = true;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Usuário não encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 4);
    }
}