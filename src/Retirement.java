import java.util.Scanner;

/**
 *  Semana 3 Sesion 1
 *  Ejercicio 2
 *  Una persona se puede jubilar si tiene 65 años o más en el caso de los hombres,
 *  y 60 como mínimo, en el caso de las mujeres. Las variables leídas son: sexo y
 *  edad. Determinar si la persona puede jubilarse.
 *
 *  @author mizterfrek | Jesus. Llica Garcia
 */
public class Retirement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de parametros
        System.out.print("Ingresar sexo de la persona [H|M]: ");
        String sexo = scanner.nextLine().toUpperCase();

        System.out.print("Ingresar edad de la persona: ");
        int edad = scanner.nextInt();

        // Toma de decision
        boolean canRetirement = false;
        if (sexo.equals("H")) {
            canRetirement = edad >= 65;
        } else if (sexo.equals("M")) {
            canRetirement = edad >= 60;
        } else {
            System.out.println("El sexo ingresado no es correcto");
        }

        // Imprimiendo mensaje
        String message = canRetirement ? "si" : "no";
        System.out.printf("La persona %s puede jubilarse.", message);
    }

}
