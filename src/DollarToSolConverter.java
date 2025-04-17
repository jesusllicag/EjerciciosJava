import java.util.Scanner;

/**
 * Semana 1 - Sesion 2
 * Ejercicio 3
 * Implementar un programa en Java que permita convertir dólares a soles
 * (tipo de cambio: 3.72)
 */
public class DollarToSolConverter {

    public static float EXCHANGE_RATE = 3.72F;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura de datos
        System.out.print("Ingrese el monto en dolares ($): ");
        float dollar = scanner.nextFloat();

        // Calculo
        float sol = dollar * EXCHANGE_RATE;

        // Impresion de resultado
        System.out.printf("%.2f dolares equivale a %.2f soles: %n", dollar, sol);
    }

}
