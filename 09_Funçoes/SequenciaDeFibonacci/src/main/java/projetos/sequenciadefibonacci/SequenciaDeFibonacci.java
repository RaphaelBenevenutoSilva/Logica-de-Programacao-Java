package projetos.sequenciadefibonacci;
public class SequenciaDeFibonacci {
    public static void fibonacci(int[] a, int[] b) {
        int c = a[0] + b[0];
        System.out.println(c);
        a[0] = b[0];
        b[0] = c;
    }
        
    public static void main(String[] args) {
        int[] t1 = {0};
        int[] t2 = {1};
        
        System.out.println(t1[0]);
        System.out.println(t2[0]);
        
        for (int c =3; c <= 10; c++) {
            fibonacci(t1, t2);
        }
    }           
}
