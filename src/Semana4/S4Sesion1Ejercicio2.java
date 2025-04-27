package Semana4;

import java.util.Scanner;

/**
 * Hoy la cotización del dólar y del euro
 * son la siguientes:
 * • 1 dólar = 3.82 soles
 * • 1 euro = 4.17 soles
 * • Escribe un programa para convertir
 * entre dólares, euros y soles.
 * • El usuario elegirá las monedas de
 * origen y destino e ingresará el monto
 * a convertir.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class S4Sesion1Ejercicio2 {

    public static void main(String[] args) {

        final double USD = 3.82, EUR = 4.17;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto: ");
        double monto = sc.nextDouble();
        sc.nextLine();

        System.out.print("Elegir moneda de origen (EUR | USD | PEN): ");
        String origen = sc.nextLine().trim().toUpperCase();

        double montoSoles = 0;

        switch (origen) {
            case "PEN": montoSoles = monto;
                break;
            case "EUR": montoSoles = monto * EUR;
                break;
            case "USD": montoSoles = monto * USD;
                break;
            default:
                System.out.print("Moneda de origen incorrecta");
                return;
        }

        System.out.print("Ingrese moneda de destino (EUR | USD | PEN): ");
        String destino = sc.nextLine().trim().toUpperCase();

        double resultado = 0;
        switch (destino) {
            case "PEN":
                 resultado = montoSoles;
                break;
            case "EUR":
                resultado = montoSoles / EUR;
                break;
            case "USD":
                resultado = montoSoles / USD;
                break;
            default:
                System.out.println("Moneda de destino no válida.");
                return;
        }

        System.out.printf("El monto convertido es: %.2f%n", resultado);
    }
}
