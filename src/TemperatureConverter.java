import java.util.Scanner;

/**
 *
 * Semana 1 - Sesion 2
 * Ejercicio 2
 * Escribir un programa que convierta grados Centígrados en grados Fahrenheit.
 * Fórmula: F = (C * 9/5) + 32
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura de datos
        System.out.print("Ingrese temperatura en °C: ");
        float celsius = scanner.nextFloat();

        // Calculo
        float fahrenheit = (celsius * 9/5) + 32;

        // Impresion de resultado
        System.out.printf("%.2f°C equivale a %.2f °F: %n", celsius, fahrenheit);
    }
}
