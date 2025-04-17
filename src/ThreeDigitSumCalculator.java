import java.util.Scanner;

/**
 *
 * Escribir un programa en Java que solicite un número entero de tres
 * cifras y muestre la suma de sus dígitos.
 *
 * Mostrar el reporte formateado como se indica. Por
 * ejemplo, si el usuario ingresa 235, la suma de sus
 * dígitos es 10, y deberá mostrarse el mensaje:
 *      “la suma de 2 + 3 + 5 = 10”
 *
 * Indicar adicionalmente si el número ingresado tuvo o no tres cifras.
 *
 * @author mizterfrek | Jesus. Llica Garcia
 */

public class ThreeDigitSumCalculator {

    private int number;
    private int sum;
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;

    public static void main(String[] args) {
        ThreeDigitSumCalculator digitSum = new ThreeDigitSumCalculator();
        digitSum.readInputNumber();
        
        if (digitSum.validateIfNumberHasThreeDigits()) {
            digitSum.splitNumberDigits();
            digitSum.sumNumberDigits();
        }

        digitSum.printResponse();
    }

    private void readInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero de tres cifras: ");
        this.number = scanner.nextInt();
    }

    private boolean validateIfNumberHasThreeDigits() {
        return Integer.toString(this.number).length() == 3;
    }

    private void splitNumberDigits() {
        this.firstDigit = this.number / 100;
        this.secondDigit = (this.number / 10) % 10;
        this.thirdDigit = this.number % 10;
    }

    private void sumNumberDigits() {
        this.sum = this.firstDigit + this.secondDigit + this.thirdDigit;
    }

    private void printResponse() {
        boolean numberHasThreeDigits = this.validateIfNumberHasThreeDigits();
        String message = numberHasThreeDigits
                ? "La suma de %d + %d + %d = %d%n"
                : "El número \"%d\" no tiene tres cifras.%n";


        Object[] args = numberHasThreeDigits
                ? new Object[]{this.firstDigit, this.secondDigit, this.thirdDigit, this.sum}
                : new Object[]{this.number};

        System.out.printf(message, args);
    }
}
