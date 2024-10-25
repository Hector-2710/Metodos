import java.util.Arrays;

public class ArrayUtils {

    // Método para invertir un array
    public static int[] invertirArray(int[] array) {
        int[] invertido = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            invertido[i] = array[array.length - 1 - i];
        }
        return invertido;
    }

    // Método para buscar el máximo valor en un array
    public static int buscarMaximo(int[] array) {
        return Arrays.stream(array).max().orElse(Integer.MIN_VALUE);
    }

    // Método para buscar el mínimo valor en un array
    public static int buscarMinimo(int[] array) {
        return Arrays.stream(array).min().orElse(Integer.MAX_VALUE);
    }

    // Método para calcular la suma de un array
    public static int sumaArray(int[] array) {
        return Arrays.stream(array).sum();
    }

    // Método para ordenar un array de manera ascendente
    public static int[] ordenarArray(int[] array) {
        Arrays.sort(array);
        return array;
    }
}
