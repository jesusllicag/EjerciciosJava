package PRACTICA2;

import java.util.Scanner;

/**
 * @author Jesus Llica Garcia U24221245
 */
public class EJERCICIO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] precios = new Double[5];
        double promedio = 0;

        while (true) {
            System.out.println("\n=== Menu de opciones ===");
            System.out.println("1. Ingresar 5 precios en arreglo");
            System.out.println("2. Calcular promedio");
            System.out.println("3. Mostrar precios mayores al promedio");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < precios.length; i++) {
                        System.out.println("Ingrese el precio del producto " + (i + 1) + ": ");
                        precios[i] = scanner.nextDouble();
                        scanner.nextLine();
                        if (precios[i] < 0) {
                            System.out.println("El precio debe ser mayor que cero.");
                        }
                    }
                    break;

                case 2:

                    for (int i = 0; i < precios.length; i++) {
                        promedio += precios[i];
                    }
                    promedio /= precios.length;
                    System.out.println("El promedio de los precios es: " + promedio);
                    break;

                case 3:
                    StringBuilder mayores = new StringBuilder();
                    for (int i = 0; i < precios.length; i++) {
                        if (precios[i] > promedio) {
                            mayores.append(String.format("# %d: S/. %.2f\n", i + 1, precios[i]));
                        }
                    }
                    System.out.println("Los precios mayores al promedio son:\n" + mayores.toString());
                    break;

                case 4:
                    System.out.println("Saliendo del programa.");
                    return;

                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
/**
 * @author Jesus Llica Garcia U24221245
 */