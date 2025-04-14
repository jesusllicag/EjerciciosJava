import java.util.Scanner;

public class SaleReceipt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Datos del cliente
        System.out.print("Ingrese nombre del cliente: ");
        String cliente = scanner.nextLine().toUpperCase();

        // Datos del vendedor
        System.out.print("Ingrese nombre del vendedor: ");
        String vendedor = scanner.nextLine().toUpperCase();

        // Datos del producto 1
        System.out.print("Ingrese nombre del producto 1: ");
        String producto1 = scanner.nextLine().toUpperCase();
        System.out.print("Ingrese precio del producto 1: ");
        double precio1 = scanner.nextDouble();
        System.out.print("Ingrese cantidad del producto 1: ");
        int cantidad1 = scanner.nextInt();
        scanner.nextLine(); // limpiar buffer

        // Datos del producto 2
        System.out.print("Ingrese nombre del producto 2: ");
        String producto2 = scanner.nextLine().toUpperCase();
        System.out.print("Ingrese precio del producto 2: ");
        double precio2 = scanner.nextDouble();
        System.out.print("Ingrese cantidad del producto 2: ");
        int cantidad2 = scanner.nextInt();

        // Calcular total sin descuentos
        double subtotal1 = precio1 * cantidad1;
        double subtotal2 = precio2 * cantidad2;
        double total = subtotal1 + subtotal2;

        // Descuentos
        double descuento = 0.0;

        if (cliente.equals("ANA") || cliente.equals("JUAN")) {
            descuento += 0.05;
        }

        if (producto1.contains("GAMER")) {
            descuento += 0.02;
        }

        if (producto2.contains("GAMER")) {
            descuento += 0.02;
        }

        double montoDescuento = total * descuento;
        double totalFinal = total - montoDescuento;

        // Mostrar boleta
        System.out.println("##############################");
        System.out.println("         TIENDA ABC           ");
        System.out.println("##############################");
        System.out.println("ID: 0000252145");
        System.out.println("COMPRAS");
        System.out.println("AV. SAENZ PEÑA 376");
        System.out.println("CHICLAYO");
        System.out.println("LOTE: B   TERM:5268");
        System.out.println("##############################");
        System.out.println("FECHA: 07MAR22   HORA: 15:35");
        System.out.printf("VEND: %-10s CLI: %s%n", vendedor, cliente);
        System.out.println("##############################");
        System.out.printf("%d %s (%.2f)%n", cantidad1, producto1, subtotal1);
        System.out.printf("%d %s (%.2f)%n", cantidad2, producto2, subtotal2);
        System.out.println("------------------------------");
        System.out.printf("PAGO TOTAL: S/. %,.2f%n", totalFinal);
        System.out.println("##############################");
        System.out.println("      VUELVA PRONTO!");
        System.out.println("##############################");
    }
}