package Semana7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class S7Sesion1Ejercicio1 {

    private static final String REGEX_PRIMO = "^P\\d+$";
    private static final String REGEX_FACTORIAL = "^\\d+!$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String continuar;

        do {
             do {
                System.out.print("Ingresar instruccion: ");
                input = scanner.nextLine();
            } while (!esFormatoValido(input));

            if (input.startsWith("P")) {
                int numero = Integer.parseInt(input.substring(1));
                if (esPrimo(numero)) {
                    System.out.println(numero + " es un número primo.");
                } else {
                    System.out.println(numero + " no es un número primo.");
                }
            } else if (input.endsWith("!")) {
                int numero = Integer.parseInt(input.substring(0, input.length() - 1));
                System.out.println("El factorial de " + numero + " es: " + factorial(numero));
            }

            do {
                System.out.print("¿Desea continuar (SI/NO)? ");
                continuar = scanner.nextLine().toLowerCase();
            } while (!continuar.equals("si") && !continuar.equals("no"));

        } while (!continuar.equals("no"));

        System.out.println("Programa finalizado.");
        scanner.close();
    }

    private static boolean esFormatoValido(String input) {
        return validarRegex(REGEX_PRIMO, input) || validarRegex(REGEX_FACTORIAL, input);
    }

    private static boolean validarRegex(String regex, String input) {
        Pattern patron = Pattern.compile(regex);
        Matcher matcher = patron.matcher(input);
        return matcher.matches();
    }

    private static boolean esPrimo(int numero) {


        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    private static long factorial(int numero) {
        long resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
