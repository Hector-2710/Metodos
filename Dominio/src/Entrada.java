import java.util.Scanner;

public class Entrada {

    // Método para pedir un entero
    public static int pedirEntero(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        while (!scanner.hasNextInt()) {
            System.out.print("Por favor, introduce un número entero: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    // Método para pedir un número flotante
    public static float pedirFloat(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        while (!scanner.hasNextFloat()) {
            System.out.print("Por favor, introduce un número decimal: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }

    // Método para pedir una cadena
    public static String pedirCadena(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    // Método para pedir un valor booleano (sí/no)
    public static boolean pedirBooleano(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje + " (sí/no): ");
        String respuesta = scanner.next().toLowerCase();
        return respuesta.equals("sí") || respuesta.equals("s");
    }

    // Método para validar un rango de enteros
    public static int pedirEnteroEnRango(String mensaje, int min, int max) {
        int valor;
        do {
            valor = pedirEntero(mensaje + " (" + min + " - " + max + "): ");
        } while (valor < min || valor > max);
        return valor;
    }
}
