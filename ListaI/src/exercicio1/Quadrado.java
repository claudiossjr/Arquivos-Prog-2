package exercicio1;

public class Quadrado {

    public static void criaQuadrado(int n) {
        char matriz[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    matriz[i][j] = '*';
                } else if (j == 0) {
                    matriz[i][j] = '*';
                } else if (i == n - 1) {
                    matriz[i][j] = '*';
                } else if (j == n - 1) {
                    matriz[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
