package Semana11.Sesion1;

import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[6];

        System.out.println("Ingresa 6 edades:");
        for (int i = 0; i < edades.length; i++) {
            System.out.print("Edad " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        System.out.println("\nEdades ingresadas:");
        for (int edad : edades) {
            System.out.println(edad);
        }

        scanner.close();
    }
}
