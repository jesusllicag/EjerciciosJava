package Semana4;

import java.util.Scanner;

/**
 * La evaluación de un postulante a un puesto de
 * trabajo resulta en una puntuación entre 0 y 10. Se
 * desea mostrar una descripción de la evaluación
 * alcanzada de acuerdo con los siguientes criterios:
 * • 0-4 → descartado
 * • 5 → en suspenso
 * • 6 → aceptable
 * • 7,8 → notable
 * • 9, 10 → sobresaliente
 * • Escriba un programa que solicite la puntuación de
 * un candidato y muestre la descripción que le
 * corresponda.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class S4Sesion1Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar la puntuacion (0-10): ");
        int nota = sc.nextInt();

        String descripcion = "";
        switch (nota) {
            case 0,1,2,3,4:
                descripcion = "Descartado";
                break;
            case 5:
                descripcion = "En suspenso";
                break;
            case 6:
                descripcion = "Aceptable";
                break;
            case 7,8:
                descripcion = "Notable";
                break;
            case 9,10:
                descripcion = "Sobresaliente";
                break;
            default:
                descripcion = "La nota ingresada no es valida";
                break;
        }
        System.out.println(descripcion);
    }
}
