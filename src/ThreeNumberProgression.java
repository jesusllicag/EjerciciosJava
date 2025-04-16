import java.util.Scanner;

/*
 *  Semana 3 Sesion 1 | Ejercicio 1
 *      Se requiere saber si 3 números enteros ingresados se encuentran o no en
 *      progresión aritmética. Las variables leídas son: n1, n2 y n3.
 */
public class ThreeNumberProgression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando Numeros
        System.out.print("Ingrese valor de n1: ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingrese valor de n2: ");
        double n2 = scanner.nextDouble();

        System.out.print("Ingrese valor de n3: ");
        double n3 = scanner.nextDouble();

        // Toma de Decision
        boolean decision = (n2 - n1) == (n3 - n2);
        String message = decision ? "si" : "no";

        // Imprimir resultado
        System.out.printf("Los numeros %s pertenecen a una progresion aritmetica", message);
    }
}
