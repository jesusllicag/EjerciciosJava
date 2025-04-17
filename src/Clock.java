import java.util.Scanner;

/**
 *  Semana 3 Sesion 2
 *  Ejercicio 2
 *  Escribir un programa en Java que lea las horas, minutos y
 *  segundos individualmente, y calcule qué hora sería en el
 *  siguiente segundo.
 *  Validar los valores ingresados de las horas (0-23), minutos (0-59) y segundos (0-59).
 *
 *  @author mizterfrek | Jesus. Llica Garcia
 */
public class Clock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horas, minutos, segundos;

        // Entrada de parametros
        System.out.print("Ingrese la hora (0-23): ");
        horas = scanner.nextInt();
        System.out.print("Ingrese los minutos (0-59): ");
        minutos = scanner.nextInt();
        System.out.print("Ingrese los segundos (0-59): ");
        segundos = scanner.nextInt();

        // Validaciones
        boolean horaValidator = horas < 0 || horas > 23;
        boolean minutosValidator = minutos < 0 || minutos > 59;
        boolean segundosValidator = segundos < 0 || segundos > 59;

        if (horaValidator || minutosValidator || segundosValidator) {
            System.out.println("Valores fuera de rango. Intente nuevamente.");
            return;
        }

        // Calculo
        segundos++;
        if (segundos == 60) {
            segundos = 0;
            minutos++;
            if (minutos == 60) {
                minutos = 0;
                horas++;
                if (horas == 24) {
                    horas = 0;
                }
            }
        }

        // Impresion de resultado
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}
