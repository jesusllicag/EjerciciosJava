package PRACTICA2;

import java.util.Scanner;

/**
 * @author Jesus Llica Garcia U24221245
 */
public class EJERCICIO3 {
    public static void main(String[] args) {
        int[] notas = new int[6];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            do {
                System.out.print("Ingresar nota " + (i + 1) + " (0 a 20): ");
                notas[i] = scanner.nextInt();
            } while (notas[i] < 0 || notas[i] > 20);
        }

        System.out.println("\nLista de Notas:");
        for(int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }

        int excelente = 0, bueno = 0, regular = 0, deficiente = 0;
        for (int nota : notas) {
            switch (nota) {
                case 18, 19, 20 -> excelente++;
                case 14, 15, 16, 17 -> bueno++;
                case 11, 12, 13 -> regular++;
                default -> deficiente++;
            }
        }

        System.out.println("\nResumen por categoría:");
        System.out.println("A: Excelente (18-20): " + excelente);
        System.out.println("B: Bueno (14-17): " + bueno);
        System.out.println("C: Regular (11-13): " + regular);
        System.out.println("D: Deficiente (0-10): " + deficiente);
    }
}
/**
 * @author Jesus Llica Garcia U24221245
 */