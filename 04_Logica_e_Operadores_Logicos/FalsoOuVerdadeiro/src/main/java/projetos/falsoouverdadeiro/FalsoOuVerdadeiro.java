package projetos.falsoouverdadeiro;
public class FalsoOuVerdadeiro {
    public static void main(String[] args) {
        // No java, declaramos e já podemos atribuir o valor
        
        int a = 2;
        int b = 3;
        int c = 5;
        
        //O resultado de uma comparação é sempre um boolean
        // System.out.println imprime o resultado na tela
        System.out.println(a >= 2);
        
        // Tradução de: nao ((A=B) ou (C>A))
        System.out.println(! ((a ==b || (c>a))));
        
        
    }
}
