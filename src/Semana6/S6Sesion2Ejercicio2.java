package Semana6;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class S6Sesion2Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patronSi = Pattern.compile("(?i)s[iíÍ]");
        Pattern patronNo = Pattern.compile("(?i)n[o]");

        int sumaNotas = 0;
        int cantidadEstudiantes = 0;
        int aprobados = 0;
        int desaprobados = 0;

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese la nota del estudiante (o -1 para terminar): ");
            int nota = scanner.nextInt();
            scanner.nextLine();
            boolean notaValida = nota >= 0 && nota <= 20;
            boolean esFin = nota == -1;

            if (esFin) {
                continuar = false;
            } else if (notaValida) {
                sumaNotas += nota;
                cantidadEstudiantes++;

                if (nota >= 11) {
                    aprobados++;
                } else {
                    desaprobados++;
                }

                System.out.print("¿Desea ingresar otra nota? (Sí/No): ");
                String respuesta = scanner.nextLine().trim();

                Matcher matcherSi = patronSi.matcher(respuesta);
                Matcher matcherNo = patronNo.matcher(respuesta);

                if (matcherNo.matches()) {
                    continuar = false;
                } else if (!matcherSi.matches()) {
                    System.out.println("Respuesta no válida. Finalizando programa.");
                    continuar = false;
                }

            } else {
                System.out.println("Nota inválida. Ingrese un valor entre 0 y 20.");

            }
        }

        if (cantidadEstudiantes > 0) {
            double promedio = (double) sumaNotas / cantidadEstudiantes;
            System.out.printf("Promedio global: %.2f%n", promedio);
            System.out.println("Estudiantes aprobados: " + aprobados);
            System.out.println("Estudiantes desaprobados: " + desaprobados);
        } else {
            System.out.println("No se ingresaron notas válidas.");
        }
    }
}
