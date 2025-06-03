package Semana11.Sesion1;

import java.util.Scanner;
/**
 * @author Jesus LLica | U24221245
 */
public class Ejercicio6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        final String[] meses = {"ENE","FEB","MAR","ABR","MAY","JUN","JUL","AGO","SET","OCT","NOV","DIC"};
        for(int i = meses.length; 0 < i; i--) System.out.println(meses[i - 1]);
        System.out.println("Ingresar numero del mes");
        int mes = sc.nextInt();
        System.out.println(meses[mes - 1]);
    }
}
