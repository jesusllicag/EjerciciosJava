import java.util.Scanner;

public class SpeedOfLight {

    private static final double SPEED_LIGHT = 299792458;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        System.out.println("Ingresar el número de días: ");
        days = scanner.nextInt();

        long secs = (long) days * 24 * 60 * 60;

        long distance = Math.round((double) secs * SPEED_LIGHT);

        String labelDay = (days == 1) ? "día" : "dias";

        System.out.printf("En %d " + labelDay + ", la luz recorre aproximadamente %,d metros.%n", days, distance);
    }
}