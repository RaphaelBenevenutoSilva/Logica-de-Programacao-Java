/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package projetos.qualseunome;

import java.util.Scanner;

/**
 *
 * @author rafin
 */
public class QualSeuNome {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Qual é o seu nome: ");
        
        String nome = teclado.nextLine();
        
        System.out.println("Olá" + nome + ", é um prazer em te conhecer!");
        
        teclado.close();
    }
}
