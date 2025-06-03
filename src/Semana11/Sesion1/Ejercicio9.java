package Semana11.Sesion1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> numeros = new ArrayList<>();
        double suma = 0;

        System.out.println("Ingresa 6 números decimales:");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Número " + i + ": ");
            double numero = scanner.nextDouble();
            numeros.add(numero);
            suma += numero;
        }

        double promedio = suma / numeros.size();
        System.out.println("\nPromedio: " + promedio);

        System.out.println("Números mayores al promedio:");
        boolean hayMayores = false;
        for (double numero : numeros) {
            if (numero > promedio) {
                System.out.println(numero);
                hayMayores = true;
            }
        }

        if (!hayMayores) {
            System.out.println("Ningún número es mayor al promedio.");
        }

    }
}
