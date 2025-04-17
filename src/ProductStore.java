import java.util.Scanner;

/**
 *  Semana 3 Sesion 1
 *  Ejercicio 3
 *  Una tienda acepta cambio de productos en los siguientes casos:
 *  - si el producto tiene un precio entre 50 y 80 soles y fue comprado el día lunes (día 1)
 *  - si el producto tiene un precio no por debajo de 120 soles y fue comprado cualquier
 *    día, excepto miércoles o jueves (días 3 o 4, respectivamente).
 *  Evaluar si procede o no el cambio del producto.
 *  Las variables leídas son precioProducto y numeroDia.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */
public class ProductStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de parametros
        System.out.println("Lun:1 | Mar:2 | Mie:3 | Jue:4 | Vie:5 | Sab:6 | Dom:7");
        System.out.print("Ingrese numero de dia: ");
        int numeroDia = scanner.nextInt();

        System.out.print("Ingrese precio del Produto: ");
        double precioProducto = scanner.nextDouble();

        // Toma de decisiones
        boolean returnProduct = false;

        if (numeroDia == 1) {
            returnProduct = (50 <= precioProducto) && (precioProducto <= 80);
        } else if (numeroDia != 3 && numeroDia != 4) {
            returnProduct = 120 <= precioProducto;
        }
        String message = returnProduct ? "si" : "no";

        // Imprimir resultado
        System.out.printf("La tienda %s procede con la devolucion del producto", message);
    }
}
