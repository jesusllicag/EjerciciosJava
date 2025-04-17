import java.util.Scanner;

/**
 *  Ejercicio 2:
 * • Escribe un programa que genere una boleta de venta.
 * • Debes solicitar: nombre de cliente, nombre del producto, precio y cantidad comprada.
 * • Si el cliente se llama ANA o JUAN (String.equals), descontar el 5%.
 * • Si el nombre del producto contiene la palabra GAMER (String.contains), descontar adicionalmente el 2%.
 * • Ingresar los datos de dos productos distintos.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class SaleReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando Informacion del cliente
        System.out.print("Ingrese nombre del cliente: ");
        String cliente = scanner.nextLine().toUpperCase();

        // Datos del producto 1
        System.out.print("Ingrese nombre del producto 1: ");
        String producto1 = scanner.nextLine().toUpperCase();
        System.out.print("Ingrese precio del producto 1: ");
        double precio1 = scanner.nextDouble();
        System.out.print("Ingrese cantidad del producto 1: ");
        int cantidad1 = scanner.nextInt();

        scanner.nextLine();

        // Datos del producto 2
        System.out.print("Ingrese nombre del producto 2: ");
        String producto2 = scanner.nextLine().toUpperCase();
        System.out.print("Ingrese precio del producto 2: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Ingrese cantidad del producto 2: ");
        int cantidad2 = scanner.nextInt();

        // Logica de Descuentos
        double descuento = 0.0;

        if (cliente.equals("ANA") || cliente.equals("JUAN")) {
            descuento += 0.05;
        }

        if (producto1.contains("GAMER")) {
            precio1 = precio1 * 0.98;
        }

        if (producto2.contains("GAMER")) {
            precio2 = precio2 * 0.98;
        }

        // Calculo de cantidades
        double subtotal1 = precio1 * cantidad1;
        double subtotal2 = precio2 * cantidad2;
        double total = subtotal1 + subtotal2;

        double montoDescuento = total * descuento;
        double totalFinal = total - montoDescuento;

        // Impresion de resultado
        System.out.println("##############################");
        System.out.println("         TIENDA UTP           ");
        System.out.println("##############################");
        System.out.println("ID: 0000252145");
        System.out.println("           COMPRAS            ");
        System.out.println("      AV. SAENZ PEÑA 376      ");
        System.out.println("           CHICLAYO           ");
        System.out.println("      LOTE: B   TERM:5268     ");
        System.out.println("##############################");
        System.out.println("FECHA: 07MAR22     HORA: 15:35");
        System.out.printf("VEND: J.Llica CLI: %s%n", cliente);
        System.out.println("##############################");
        System.out.printf("%d %s (%.2f)%n", cantidad1, producto1, subtotal1);
        System.out.printf("%d %s (%.2f)%n", cantidad2, producto2, subtotal2);
        System.out.println("------------------------------");
        System.out.printf("PAGO TOTAL: S/. %,.2f%n", totalFinal);
        System.out.println("##############################");
        System.out.println("        VUELVA PRONTO!        ");
        System.out.println("##############################");
    }
}