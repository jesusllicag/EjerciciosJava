package Semana4;

import java.util.Scanner;

public class S4Sesion2Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota del alumno (0 - 20): ");
        double nota = sc.nextDouble();

        String mencion = switch ((int) nota) {
            case Integer n when (n >= 18 && n <= 20) -> "Excelente";
            case Integer n when (n >= 15 && n < 18) -> "Bueno";
            case Integer n when (n >= 13 && n < 15) -> "Regular";
            case Integer n when (n >= 0 && n < 13) -> "Deficiente";
            default -> {
                System.out.println("Nota fuera de rango. Ingrese una nota entre 0 y 20.");
                yield "";
            }
        };

        if (mencion.isEmpty()) return;

        String mensaje = "Usted obtuvo la mención de #mencion#";

        mensaje = mensaje.replace("#mencion#", mencion);

        System.out.println(mensaje);
    }
}
