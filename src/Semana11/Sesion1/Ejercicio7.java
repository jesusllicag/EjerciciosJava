package Semana11.Sesion1;

import java.util.Random;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio7 {
    public static void main(String[] args) {
        int[] numeros = new int[7];
        Random random = new Random();
        int suma = 0;
        int pares = 0;
        int impares = 0;

        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50) + 1; // entre 1 y 50
            System.out.print(numeros[i] + " ");
            suma += numeros[i];
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("\n\nSuma total: " + suma);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
