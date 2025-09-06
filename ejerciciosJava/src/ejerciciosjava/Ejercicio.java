
package ejerciciosjava;
import java.util.Scanner;
public class Ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir la cantidad de frutas
        System.out.print("¿Cuántas frutas deseas ingresar? ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        // Arreglo para guardar las frutas
        String[] frutas = new String[cantidad];

        // Pedir frutas al usuario
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingresa el nombre de la fruta #" + (i + 1) + ": ");
            frutas[i] = sc.nextLine();
        }

        // Imprimir la lista de frutas
        System.out.println("\nLas frutas ingresadas son:");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("- " + frutas[i]);
        }

        sc.close();
    }
}
