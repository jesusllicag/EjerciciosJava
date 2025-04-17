import java.util.Scanner;

/**
 * Semana 1 - Sesion 2 - Actividad Domiciliaria 3
 * Escribir un programa que, dado un monto total, lo descomponga en monto a pagar e IGV (18%).
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class IGVCalculator {
    public static final double IGV_RATE = 0.18;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("DESCOMPONEDOR DE MONTO TOTAL E IGV");

        // Entrada de datos
        System.out.print("Ingrese el monto total (incluye IGV): ");
        double montoTotal = scanner.nextDouble();

        // Cálculos
        double montoBase = montoTotal / (1 + IGV_RATE);
        double igv = montoTotal - montoBase;

        // Resultados
        System.out.printf("Monto sin IGV: %.2f%n", montoBase);
        System.out.printf("IGV (18%%): %.2f%n", igv);
    }
}