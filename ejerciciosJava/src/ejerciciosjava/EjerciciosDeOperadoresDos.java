/*
Una persona tiene una cantidad de dinero en su cuenta bancaria y 
quiere retirar una cantidad fija cada semana durante un mes. Si 
la persona tiene inicialmente $1000 en su cuenta y retira $200 
cada semana, ¿Cuánto dinero le quedará en su cuenta al final del mes?
*/
package ejerciciosjava;
public class EjerciciosDeOperadoresDos {
    public static void main(String[] args) {
        double saldo = 1000.0;

        // Retiro fijo semanal
        double retiroSemanal = 200.0;

        // Un mes = 4 semanas
        int semanas = 4;

        // Calcular saldo final
        double saldoFinal = saldo - (retiroSemanal * semanas);

        // Mostrar resultados
        System.out.println("Saldo inicial: $" + saldo);
        System.out.println("Cantidad retirada cada semana: $" + retiroSemanal);
        System.out.println("Saldo final después de " + semanas + " semanas: $" + saldoFinal);
    }
}
