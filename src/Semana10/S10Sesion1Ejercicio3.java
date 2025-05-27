package Semana10;

import java.util.Arrays;
import java.util.Scanner;

public class S10Sesion1Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[5];
        int[] edades = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("Ingrese el nombre N %d: ", i + 1);
            nombres[i] = sc.nextLine();
            System.out.printf("Ingrese el edad: ");
            edades[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < edades.length; i++) {
            for (int j = i + 1; j < edades.length; j++) {
                if (edades[i] > edades[j]) {
                    int auxEdad = edades[i];
                    edades[i] = edades[j];
                    edades[j] = auxEdad;

                    String auxNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = auxNombre;
                }
            }
        }

        System.out.println("------------------------------");
        System.out.println("| Nombre          | Edad     |");
        System.out.println("------------------------------");
        for (int i = 0; i < 5; i++) {
            String nombreFormateado = String.format("%-16s", nombres[i]);
            String edadFormateada = String.format("%-9d", edades[i]);
            System.out.println("| " + nombreFormateado + "| " + edadFormateada + "|");
        }
        System.out.println("------------------------------");

        System.out.println(Arrays.toString(nombres));
        System.out.println(Arrays.toString(edades));


    }
}
