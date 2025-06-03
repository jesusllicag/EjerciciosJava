package Semana11.Sesion1;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadPrecios = 6;
        int[] precios = new int[cantidadPrecios];

        boolean inBucle = true;
        while (inBucle) {
            System.out.println("Menu de opciones");
            System.out.printf("1: Ingresar 6 precios\n2: Ordenar precios\n3: Salir\nIngresar opcion: ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < cantidadPrecios; i++) {
                        System.out.printf("Ingresar Precio %d: ", i + 1);
                        precios[i] = sc.nextInt();
                    }
                    break;
                case 2:
                    Arrays.sort(precios);
                    System.out.println("Precios ordenados:");
                    for (int precio : precios) System.out.printf("%d ", precio);
                    sc.nextInt();
                    break;
                case 3:
                    inBucle = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }
    }
}
