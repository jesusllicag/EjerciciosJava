import java.util.Scanner;

/**
 * Semana 1 - Sesion 2
 * Ejercicio 3
 * Implementar un programa en Java que permita convertir dólares a soles
 * (tipo de cambio: 3.72)
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class CircleAreaCalculator {
    public static double PI = Math.PI;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE AREA DE CIRCULO");
        // Captura de datos
        System.out.print("Ingrese el radio del círculo en cm: ");
        double radio = scanner.nextDouble();

        // Calculo
        double area = PI * Math.pow(radio, 2);

        // Impresion de resultado
        System.out.printf("El area del circulo de radio %.2f cm es igual a %.2f cm². %n", radio, area);
    }
}
