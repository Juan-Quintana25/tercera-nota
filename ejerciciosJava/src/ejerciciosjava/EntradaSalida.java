
package ejerciciosjava;
import java.util.Scanner;
public class EntradaSalida {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double num3 = sc.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de los tres números es: " + media);

       
    }

}
