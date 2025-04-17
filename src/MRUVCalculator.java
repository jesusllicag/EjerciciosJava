import java.util.Scanner;

/**
 * Semana 1 - Sesion 2 - Actividad domiciliaria 2
 * Escribir un programa que resuelva una fórmula matemática
 * que utilice al menos 3 variables.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class MRUVCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE DISTANCIA (MRUV)");

        // Captura de datos
        System.out.print("Ingrese la velocidad inicial (v₀) en m/s: ");
        double velocidadInicial = scanner.nextDouble();

        System.out.print("Ingrese el tiempo (t) en segundos: ");
        double tiempo = scanner.nextDouble();

        System.out.print("Ingrese la aceleración (a) en m/s²: ");
        double aceleracion = scanner.nextDouble();

        // Cálculo
        double distancia = velocidadInicial * tiempo + 0.5 * aceleracion * Math.pow(tiempo, 2);

        // Impresión del resultado
        System.out.printf("La distancia recorrida es: %.2f metros.%n", distancia);
    }
}