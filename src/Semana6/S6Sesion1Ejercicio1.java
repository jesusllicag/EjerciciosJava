package Semana6;
import java.util.Scanner;
import java.util.regex.Pattern;

public class S6Sesion1Ejercicio1 {

    private static final String PATRON_CODIGO = "U\\d{8}";
    private static final Pattern PATRON = Pattern.compile(PATRON_CODIGO);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String codigo = "";

        while (!esCodigoValido(codigo)) {
            System.out.print("Ingrese su código universitario (Ej: U23205077): ");
            codigo = scanner.nextLine();
        }

        System.out.println("Código válido. ¡Bienvenido!");
        scanner.close();
    }

    private static boolean esCodigoValido(String codigo) {
        boolean valido = PATRON.matcher(codigo).matches();
        if (!valido) {
            System.out.println("Formato incorrecto. Intente nuevamente.");
        }
        return valido;
    }
}
