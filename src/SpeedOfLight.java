import java.util.Scanner;

/**
 * Ejercicio 1 Semana 2:
 *   • Escribe un programa que calcule la distancia que recorre la luz en N días,
 *     sabiendo que en un segundo la luz viaja a 299792458 m/s.
 *   • Leer el número de días utilizando la clase Scanner.
 *   • Crear una constante para almacenar la velocidad de la luz.
 *   • Muestra el resultado utilizando salida con formato.
 *
 *   @author mizterfrek | Jesus. Llica Garcia
 */
public class SpeedOfLight {

    private static final double SPEED_LIGHT = 299792458;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        System.out.println("Ingresar el número de días: ");
        days = scanner.nextInt();

        long secs = (long) days * 24 * 60 * 60;

        long distance = Math.round((double) secs * SPEED_LIGHT);

        String labelDay = (days == 1) ? "día" : "dias";

        System.out.printf("En %d " + labelDay + ", la luz recorre aproximadamente %,d metros.%n", days, distance);
    }
}