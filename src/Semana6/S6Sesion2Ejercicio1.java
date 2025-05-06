package Semana6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S6Sesion2Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern patronSi = Pattern.compile("(?i)s[iíÍ]");
        Pattern patronNo = Pattern.compile("(?i)n[o]");

        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese un número entre 1 y 100: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            boolean numeroValido = numero >= 1 && numero <= 100;

            if (numeroValido) {
                System.out.println("Número ingresado: " + numero);

                System.out.print("¿Desea continuar? (Sí/No): ");
                String respuesta = scanner.nextLine().trim();

                Matcher matcherSi = patronSi.matcher(respuesta);
                Matcher matcherNo = patronNo.matcher(respuesta);

                if (matcherNo.matches()) {
                    continuar = false;
                    System.out.println("Programa finalizado.");
                } else if (!matcherSi.matches()) {
                    System.out.println("Respuesta no válida. Programa finalizado por seguridad.");
                    continuar = false;
                }

            } else {
                System.out.println("Número fuera de rango. Debe estar entre 1 y 100.");
            }
        }
    }
}
