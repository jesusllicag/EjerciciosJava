package Semana11.Sesion1;

import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        final int cantidadNombres = 8;
        String[] nombres = new String[cantidadNombres];

        for (int i = 0; i < cantidadNombres; i++) {
            System.out.printf("Ingrese el nombre N %d: ", i + 1);
            nombres[i] = sc.nextLine();
        }
        for (int i = cantidadNombres; 0 < i; i--) {
            System.out.printf("%s \n", nombres[i - 1]);
        }
    }

}
