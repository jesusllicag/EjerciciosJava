package PRACTICA2;

import java.util.Random;

/**
 * @author Jesus Llica Garcia U24221245
 */
public class EJERCICIO4 {
    public static void main(String[] args) {
        int[] numeros = new int[15];
        Random random = new Random();
        int[] suma = {0,0};

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Números generados:");
        for(int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            if (numeros[i] % 2 == 0) {
                suma[0] += numeros[i];
            } else {
                suma[1] += numeros[i];
            }
        }

        System.out.println("\n\nSuma de números pares: " + suma[0]);
        System.out.println("Suma de números impares: " + suma[1]);
    }
}
/**
 * @author Jesus Llica Garcia U24221245
 */