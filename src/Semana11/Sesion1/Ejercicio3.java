package Semana11.Sesion1;

import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        final int cantidadPersonas = 10;
        int[] edades = new int[cantidadPersonas];
        int suma = 0;

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.printf("Ingrese edad de Persona N %d: ", i + 1);
            edades[i] = sc.nextInt();
            sc.nextLine();
            suma += edades[i];
        }
        double promedio = (double) suma / cantidadPersonas;
        int personasPorEncimaPromedio = 0;
        for (int i = 0; i < cantidadPersonas; i++) {
            if(edades[i] > promedio) personasPorEncimaPromedio++;
        }
        System.out.printf("Cantidad de personas con edad mayor al promedio %.2f: %d \n", promedio, personasPorEncimaPromedio);
    }
}
