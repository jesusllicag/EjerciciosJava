import java.util.Scanner;

/**
 * Semana 3 Sesion 2
 * Ejercicio 1
 * El gobierno ha decretado un aumento en los salarios de los altos
 * funcionarios de acuerdo con la siguiente escala:
 * |-------------------------------------------|
 * | Sexo     | Salud | Educación | Transporte |
 * |----------|-------|-----------|------------|
 * | Femenino | 25%   | 12%       | 20%        |
 * | Masculino| 20%   | 11%       | 15%        |
 * |-------------------------------------------|
 * Salarios actuales:
 * - Salud: S/. 15000
 * - Educación: S/. 12000
 * - Transporte: S/. 18000
 * Escribir un programa en Java que solicite el sexo y sector de un
 * funcionario y calcule el monto que recibirá luego de aplicado el aumento.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class SalaryRise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de parametros
        System.out.print("Ingrese el sexo del funcionario (Femenino/Masculino): ");
        String sexo = scanner.nextLine().trim().toLowerCase();

        System.out.print("Ingrese el sector (Salud/Educación/Transporte): ");
        String sector = scanner.nextLine().trim().toLowerCase();

        double salario = 0;
        double aumentoPorcentaje = 0;

        // Toma de decisiones

        // Asignar salario base
        if (sector.equals("salud")) {
            salario = 15000;
        } else if (sector.equals("educacion")) {
            salario = 12000;
        } else if (sector.equals("transporte")) {
            salario = 18000;
        } else {
            System.out.println("Sector no válido.");
            return;
        }

        // Estructura condicional anidada para aumento
        if (sexo.equals("femenino")) {
            if (sector.equals("salud")) {
                aumentoPorcentaje = 0.25;
            } else if (sector.equals("educacion")) {
                aumentoPorcentaje = 0.12;
            } else if (sector.equals("transporte")) {
                aumentoPorcentaje = 0.20;
            }
        } else if (sexo.equals("masculino")) {
            if (sector.equals("salud")) {
                aumentoPorcentaje = 0.20;
            } else if (sector.equals("educacion")) {
                aumentoPorcentaje = 0.11;
            } else if (sector.equals("transporte")) {
                aumentoPorcentaje = 0.15;
            }
        } else {
            System.out.println("Sexo no válido.");
            return;
        }

        // Cálculo de resultados
        double aumento = salario * aumentoPorcentaje;
        double nuevoSalario = salario + aumento;

        // Imprimiendo mensaje
        System.out.println("El aumento sera de S/. " + aumento);
        System.out.println("El nuevo salario será de S/. " + nuevoSalario);
    }
}
