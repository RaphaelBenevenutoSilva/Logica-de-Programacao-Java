package projetos.distanciaemmetros;

import java.util.Scanner;

public class DistanciaEmMetros {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        
        System.out.print("Digite uma Distância em metros: ");
        double metros = entrada.nextDouble();  
        
        //Cálculo das conversões
        
        double km = metros / 1000; //QUILÔMETRO  V: 1000 METROS
        double hm = metros / 100; //HECTÔMETRO   V:  100 METROS
        double dam = metros / 10; //DECÂMETRO    V:   10 METROS
        double dm = metros * 10;  //DECÍMETRO    V: 0,1 OU 10 CENTÍMETROS 
        double cm = metros * 100; //CENTÍMETRO   V: 0,01 METRO
        double mm = metros * 1000; //MILÍMETRO    V: 0,001 METRO(1.000 MM FORMAM 1 METRO)
        
        // Exibição dos resultados
        System.out.println("A distância de " + metros + "m corresponde a: ");
        
        System.out.println(km + "Km");
        System.out.println(hm + "Hm");
        System.out.println(dam + "Dam");
        System.out.println(dm + "Dm");
        System.out.println(cm + "Cm");
        System.out.println(mm + "MM");
        
        entrada.close();
        
        
    }
}
