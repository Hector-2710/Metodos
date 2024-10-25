
public class Matriz {

    // Método para sumar dos matrices
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return resultado;
    }

    // Método para multiplicar dos matrices
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filasMatriz1 = matriz1.length;
        int columnasMatriz2 = matriz2[0].length;
        int[][] producto = new int[filasMatriz1][columnasMatriz2];

        for (int i = 0; i < filasMatriz1; i++) {
            for (int j = 0; j < columnasMatriz2; j++) {
                for (int k = 0; k < matriz1[0].length; k++) {
                    producto[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }
        return producto;
    }

    // Método para transponer una matriz
    public static int[][] transponerMatriz(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }
        return transpuesta;
    }
}
