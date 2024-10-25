import java.util.*;

public class Otros {

    // Reversa de una cadena
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Verificar si una cadena es un palíndromo
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Convertir una cadena en un entero
    public static int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    // Convertir un entero en cadena
    public static String intToString(int num) {
        return String.valueOf(num);
    }

    // Buscar un valor en un array
    public static int buscarEnArray(int[] array, int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1; // No encontrado
    }

    // Ordenar un array
    public static void ordenarArray(int[] array) {
        Arrays.sort(array);
    }

    // Leer una cadena del usuario
    public static String pedirCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena: ");
        return scanner.nextLine();
    }

    // Leer un entero del usuario
    public static int pedirEntero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número entero: ");
        return scanner.nextInt();
    }

    // Leer un double del usuario
    public static double pedirDouble() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número decimal: ");
        return scanner.nextDouble();
    }

    // Eliminar un elemento por valor en un ArrayList
    public static void eliminarPorValor(ArrayList<Integer> list, int valor) {
        list.remove(Integer.valueOf(valor));
    }

    // Buscar un valor en un ArrayList
    public static int buscarEnArrayList(ArrayList<Integer> list, int valor) {
        return list.indexOf(valor);
    }

    // Leer varios enteros en una lista
    public static List<Integer> pedirEnteros(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }
        return numeros;
    }

    // Leer varias cadenas en una lista
    public static List<String> pedirCadenas(int cantidad) {
        Scanner scanner = new Scanner(System.in);
        List<String> cadenas = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce la cadena " + (i + 1) + ": ");
            cadenas.add(scanner.nextLine());
        }
        return cadenas;
    }

    // Buscar una clave en un mapa
    public static boolean buscarClaveEnMap(Map<String, Integer> map, String clave) {
        return map.containsKey(clave);
    }

    // Obtener un valor por clave en un mapa
    public static Integer obtenerValorDeClave(Map<String, Integer> map, String clave) {
        return map.get(clave);
    }
}
