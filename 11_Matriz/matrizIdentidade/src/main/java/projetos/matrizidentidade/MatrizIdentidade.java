package projetos.matrizidentidade;

public class MatrizIdentidade {

    public static void main(String[] args) {

        int[][] mID = new int[3][3];
        int i, j;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (i == j) {
                    mID[i][j] = 1;
                } else {
                    mID[i][j] = 0;
                }
            }
        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(mID[i][j] + " ");
            }
            
            System.out.println();
        }
    } 
}
