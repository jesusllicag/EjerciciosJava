package Semana4;

import java.util.Scanner;

/**
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class S4Sesion2Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entre 1 y 50: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 50) {
            System.out.println("Número fuera de rango. Debe ser entre 1 y 50.");
            return;
        }

        String romano = "";

        romano += (numero == 50) ? "L" : "";

        if (numero < 50) {
            romano += (numero >= 40) ? "XL" : "";
            numero = numero >= 40 ? numero - 40 : numero;

            romano += "X".repeat(numero / 10);
            numero %= 10;

            romano += numero == 9 ? "IX" :
                      numero >= 5 ? "V" + "I".repeat(numero - 5) :
                      numero == 4 ? "IV" :
                      "I".repeat(numero)
            ;
        }

        System.out.println("El número en romano es: " + romano);
    }
}
