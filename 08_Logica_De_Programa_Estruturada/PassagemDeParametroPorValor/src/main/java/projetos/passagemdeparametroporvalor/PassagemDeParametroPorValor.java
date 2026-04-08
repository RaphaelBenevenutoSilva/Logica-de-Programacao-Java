package projetos.passagemdeparametroporvalor;

public class PassagemDeParametroPorValor {

    static void soma(int A, int B) {
         
        System.out.println("Recebi o valor " + A);
        System.out.println("Recebi o valor " + B);
        System.out.println("A soma entre os dois é " + (A + B));

    }
    
    public static void main(String[] args) {
        int X, Y;
        
        X = 5;
        Y = 3;
     
        soma(X, Y);        
    }
}
