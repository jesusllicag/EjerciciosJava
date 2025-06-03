package Semana11.Sesion1;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        final int cantidadNotas = 5;
        int[] notas = new int[cantidadNotas];

        for (int i = 0; i < cantidadNotas; i++) {
            int nota = 0;
            System.out.printf("Ingrese nota N %d: ", i + 1);
            nota = sc.nextInt();
            sc.nextLine();
            if (nota > 20 || nota < 0) {
                System.out.println("Nota fuera de rango. Ingrese una nota entre 0 y 20.");
                i--;
            } else {
                notas[i] = nota;
            }
        }
        Arrays.sort(notas);
        System.out.printf("Nota Mayor: %d \nNota Menor: %d \n", notas[cantidadNotas - 1], notas[0]);
    }
}
