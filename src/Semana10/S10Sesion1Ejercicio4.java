package Semana10;

import java.util.Scanner;

public class S10Sesion1Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cantidad de numeros a ingresar: ");
        final int n = scanner.nextInt();
        int[] collection = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el numero #" + (i + 1) + ": ");
            collection[i] = scanner.nextInt();
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(collection[i]);
            if (i < (n - 1)) sb.append(", ");
        }
        System.out.println("String: " + sb.toString());

        // FOR
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += collection[i];
        }

        System.out.println("FOR: Suma: " + suma);

        // WHILE
        int suma2 = 0;
        int j = 0;
        while (j < n) {
            suma2 += collection[j];
            j++;
        }
        System.out.println("WHILE: Suma: " + suma2);

        // DO-WHILE
        int suma3 = 0;
        int k = 0;
        do {
            suma3 += collection[k];
            k++;
        } while (k < n);
        System.out.println("DO-WHILE: Suma: " + suma3);
    }
}
