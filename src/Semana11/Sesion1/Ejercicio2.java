package Semana11.Sesion1;

import java.util.Scanner;
/**
 * @author Jesus Llica | U24221245
 */
public class Ejercicio2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        final int cantidadNumeros = 10;
        int[] numeros = new int[cantidadNumeros];
        int[] cantidades = {0,0};

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.printf("Ingrese numero N %d: ", i + 1);
            numeros[i] = sc.nextInt();
            sc.nextLine();

            if (numeros[i] > 50) cantidades[0]++;
            else cantidades[1]++;
        }
        System.out.println("Numeros ingresados:");
        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.printf("%d ", numeros[i]);
        }
        System.out.printf(
                "Cantidad de numeros mayores a 50: %d \nCantidad de numeros menores a 50: %d \n",
                cantidades[0],
                cantidades[1]
        );
    }
}
