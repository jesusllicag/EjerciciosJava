import java.util.Scanner;

// Ejercicio:
// Escribir un programa en Java que solicite un número entero de tres
// cifras y muestre la suma de sus dígitos.
//
// Mostrar el reporte formateado como se indica. Por
// ejemplo, si el usuario ingresa 235, la suma de sus
// dígitos es 10, y deberá mostrarse el mensaje:
//      “la suma de 2 + 3 + 5 = 10”
//
// Indicar adicionalmente si el número ingresado tuvo
// o no tres cifras.


// |----------------------------------------------------------------
// | Importante:
// | Tener en cuentra que el presente codigo no maneja excepciones
// | en caso se ingrese un numero decimal o letras en la entrada
// |----------------------------------------------------------------

public class ThreeDigitSumCalculator {

    private int number;
    private int sum;
    private int firstDigit;
    private int secondDigit;
    private int thirdDigit;

    public static void main(String[] args) {
        ThreeDigitSumCalculator digitSum = new ThreeDigitSumCalculator();
        if (digitSum.readInputNumber()) {
            digitSum.splitNumberDigits();
            digitSum.sumNumberDigits();
            digitSum.showResult();
        } else {
            digitSum.showErrorMessage();
        }

    }

    private boolean readInputNumber() {
        Scanner scanner = new Scanner(System.in);
        String message = "Ingresa un número entero de tres cifras:";
        this.print(message);
        this.number = scanner.nextInt();
        return (100 <= this.number && this.number < 1000);
    }

    private void splitNumberDigits() {
        this.firstDigit = this.number / 100;
        this.secondDigit = (this.number / 10) % 10;
        this.thirdDigit = this.number % 10;
    }

    private void sumNumberDigits() {
        this.sum = this.firstDigit + this.secondDigit + this.thirdDigit;
    }

    private void showResult() {
        String message = "La suma de ";
        message += this.firstDigit + " + ";
        message += this.secondDigit + " + ";
        message += this.thirdDigit + " = " + this.sum;
        this.print(message);
    }

    private void print(String message) {
        System.out.println(message);
    }

    private void showErrorMessage() {
        String errorMessage = "El número \"" + this.number + "\" no tiene tres cifras.";
        this.print(errorMessage);
    }
}
