import java.util.ArrayList;
import java.util.Collections;

public class ArrayListUtils {

    // Método para agregar un elemento a un ArrayList
    public static void agregarElemento(ArrayList<Integer> lista, int elemento) {
        lista.add(elemento);
    }

    // Método para eliminar un elemento por índice
    public static void eliminarElemento(ArrayList<Integer> lista, int indice) {
        if (indice >= 0 && indice < lista.size()) {
            lista.remove(indice);
        } else {
            System.out.println("Índice fuera de rango.");
        }
    }

    // Método para buscar un elemento en la lista
    public static boolean buscarElemento(ArrayList<Integer> lista, int elemento) {
        return lista.contains(elemento);
    }

    // Método para obtener el tamaño de la lista
    public static int obtenerTamaño(ArrayList<Integer> lista) {
        return lista.size();
    }

    // Método para ordenar un ArrayList de manera ascendente
    public static void ordenarLista(ArrayList<Integer> lista) {
        Collections.sort(lista);
    }

    // Método para encontrar el máximo en un ArrayList
    public static int maximoLista(ArrayList<Integer> lista) {
        return Collections.max(lista);
    }
}
