package projetos.passagemdeparametro;

public class PassagemDeParametro {

    static class RefInt {
        int valor;
    }
    
        public static void soma(RefInt A, RefInt B) {
            A.valor = A.valor + 1;
            B.valor = B.valor + 2;
            
            System.out.println("Valor de A = " + A.valor);
            System.out.println("Valor de B = " + B.valor);
            System.out.println("Soma A + B = " + (A.valor + B.valor));
        }
        
        public static void main(String[] args) {
            
            RefInt X = new RefInt();
            RefInt Y = new RefInt();
             
            X.valor = 4;
            Y.valor = 8;
            
            soma(X, Y);
            
            System.out.println("Valor de X = " + X.valor);
            System.out.println("Valor de Y = " + Y.valor);
             
        }
    
}
