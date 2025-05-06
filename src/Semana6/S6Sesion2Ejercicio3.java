package Semana6;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class S6Sesion2Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String CLAVE_CORRECTA = "P@55w0rd";
        final int MAX_INTENTOS = 5;

        // Expresión regular básica para validar email
        Pattern patronCorreo = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");

        int intentos = 0;
        boolean accesoConcedido = false;

        while (intentos < MAX_INTENTOS && !accesoConcedido) {
            System.out.print("Ingrese su correo electrónico: ");
            String correo = scanner.nextLine();

            Matcher matcherCorreo = patronCorreo.matcher(correo);

            System.out.print("Ingrese su clave de acceso: ");
            String clave = scanner.nextLine();

            boolean correoValido = matcherCorreo.matches();
            boolean claveCorrecta = clave.equals(CLAVE_CORRECTA);

            if (correoValido && claveCorrecta) {
                accesoConcedido = true;
                System.out.println("Bienvenido al sistema.");
            } else {
                intentos++;
                System.out.println("Acceso denegado. Intento " + intentos + " de " + MAX_INTENTOS);
            }
        }

        if (!accesoConcedido) {
            System.out.println("Cuenta suspendida.");
        }
    }
}
