package Semana4;

import java.util.Scanner;

public class S4Sesion2Ejercicio3 {

    public static void main(String[] args) {

        final String
                MSG_NOTA_INVALIDA = "Nota fuera de rango. Ingrese una nota entre 0 y 20.",
                MSG_VERSION_INVALIDA = "Por favor ingrese una version valida (1 o 2)."
        ;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota del alumno (0 - 20): ");
        double nota = sc.nextDouble();

        System.out.println("Ingrese la version disponible ( 1 - 2 ): ");
        System.out.println("[1 | Operador ternario]");
        System.out.println("[2 | Switch Mejorado]");
        int version = sc.nextInt();

        String resultado = "";

        if (version == 1) {
            resultado = (nota > 18 && nota <= 20) ? "Excelente" :
                        (nota > 15 && nota <= 18) ? "Bueno" :
                        (nota >= 13 && nota <= 15) ? "Regular" :
                        (nota >= 0 && nota < 13) ? "Deficiente" : MSG_NOTA_INVALIDA;

        } else if (version == 2) {
            resultado = switch ((int) nota) {
                case Integer n when (n > 18 && n <= 20) -> "Excelente";
                case Integer n when (n > 15 && n <= 18) -> "Bueno";
                case Integer n when (n >= 13 && n <= 15) -> "Regular";
                case Integer n when (n >= 0 && n < 13) -> "Deficiente";
                default -> MSG_NOTA_INVALIDA;
            };
        } else {
            resultado = MSG_VERSION_INVALIDA;
        }

        System.out.println(resultado);
    }
}
