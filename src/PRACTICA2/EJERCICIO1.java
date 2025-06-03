package PRACTICA2;

import java.util.Scanner;

/**
 * @author Jesus Llica Garcia U24221245
 */
public class EJERCICIO1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];

        for (int i = 0; i < edades.length; i++) {
            System.out.printf("Ingrese el nombre N %d: ", i + 1);
            nombres[i] = sc.nextLine();
            do {
                System.out.printf("Ingrese el edad: ");
                edades[i] = sc.nextInt();
                sc.nextLine();
            } while (edades[i] < 0);
        }

        int multiploCinco = 0;
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] % 5 == 0) multiploCinco++;
            System.out.printf("%s %s \n", nombres[i], edades[i]);
        }
        System.out.println("Cantidad de personas con edad multiplo de 5: " + multiploCinco);
    }
}
/**
 * @author Jesus Llica Garcia U24221245
 */
