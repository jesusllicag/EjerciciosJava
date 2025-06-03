package Semana11.Sesion1;

import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadEstudiantes = 10;
        String[] estudiantes = new String[cantidadEstudiantes];

        System.out.println("Ingresa los nombres de 10 estudiantes:");
        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            estudiantes[i] = scanner.nextLine();
        }

        for (int i = 0; i < cantidadEstudiantes; i++) {
            if(estudiantes[i].startsWith("A") || estudiantes[i].startsWith("a")) {
                System.out.println(estudiantes[i]);
            }
        }
    }
}
