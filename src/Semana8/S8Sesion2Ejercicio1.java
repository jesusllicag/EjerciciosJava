package Semana8;

import java.util.Scanner;

public class S8Sesion2Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String LINEA_SEPARADORA = "#############################################\n";
        final String[] MESES = {"ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC"};

        String nombreEmpleado = "";
        String tipoEmpleado = "";
        double salarioMensual = 0;
        int mesActual = 0;
        int boletasEmitidas = 0;
        boolean datosIngresados = false;

        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Ingresar nombre y tipo de empleado");
            System.out.println("2. Ingresar salario, boletas emitidas y mes actual");
            System.out.println("3. Mostrar reporte");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del empleado: ");
                    nombreEmpleado = scanner.nextLine();
                    System.out.print("Ingrese el tipo (1 = Contratado, 2 = Nombrado): ");
                    int tipo = scanner.nextInt(); // TODO: Validar entrada para que sea 1 o 2
                    tipoEmpleado = (tipo == 1) ? "Contratado" : "Nombrado";
                    break;

                case 2:
                    System.out.print("Ingrese el salario mensual: ");
                    salarioMensual = scanner.nextDouble(); // TODO: Validar que sea numerico
                    System.out.print("Ingrese el número de boletas emitidas: ");
                    boletasEmitidas = scanner.nextInt(); // TODO: Validar que sea numero entero
                    System.out.print("Ingrese el mes actual (1=ENE, 2=FEB, 3=MAR, 4=ABR ... 12=DIC): "); // TODO: Validar ingreso de numero
                    mesActual = scanner.nextInt();
                    datosIngresados = true;
                    break;

                case 3:
                    if (!datosIngresados || nombreEmpleado.isEmpty()) {
                        System.out.println("Debe ingresar todos los datos antes de mostrar el reporte.");
                        break;
                    }

                    StringBuilder reporte = new StringBuilder();

                    reporte.append(LINEA_SEPARADORA);
                    reporte.append("# RESUMEN DE BOLETAS DE PAGO\n");
                    reporte.append(String.format("# Empleado: %-33s#\n", nombreEmpleado));
                    reporte.append(String.format("# Tipo: [%s] Contratado   [%s] Nombrado\n",
                            tipoEmpleado.equals("Contratado") ? "X" : " ",
                            tipoEmpleado.equals("Nombrado") ? "X" : " "
                            ));
                    reporte.append(LINEA_SEPARADORA);
                    reporte.append("# Datos del Salario           Boleta\n");

                    double totalPagado = 0;
                    for (int i = 0; i < mesActual; i++) {
                        String boleta = (i < boletasEmitidas) ? "SI" : "NO";
                        if (boleta.equals("SI")) totalPagado += salarioMensual;
                        reporte.append(String.format("# Salario %s: S/. %-8.2f %7s\n", MESES[i], salarioMensual, boleta));
                    }

                    int boletasRestantes = mesActual - boletasEmitidas;

                    reporte.append(LINEA_SEPARADORA);
                    reporte.append(String.format("# Boletas emitidas: %d  Boletas Restantes: %d\n", boletasEmitidas, boletasRestantes));
                    reporte.append(String.format("# Monto total pagado: S/. %.2f\n", totalPagado));
                    reporte.append(LINEA_SEPARADORA);

                    System.out.println("\n" + reporte.toString());
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
