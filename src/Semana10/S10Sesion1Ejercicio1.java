package Semana10;

public class S10Sesion1Ejercicio1 {

    public static void shell(int[] A) {
        int N = A.length;
        int INT = N + 1;
        boolean BAND;
        int I, AUX;

        while (INT > 1) {
            INT = INT / 2;
            BAND = true;

            while (BAND) {
                BAND = false;
                I = 0;

                while ((I + INT) < N) {
                    if (A[I] > A[I + INT]) {
                        AUX = A[I];
                        A[I] = A[I + INT];
                        A[I + INT] = AUX;
                        BAND = true;
                    }
                    I++;
                }
            }
        }
    }

    public static void main(String[] args) {
        //int[] arreglo = {34, 8, 64, 51, 32, 21};
        int[] arreglo = {16, 25, 34, 11, 78, 6, 31, 55};
        System.out.println("Arreglo original:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }

        shell(arreglo);

        System.out.println("\nArreglo ordenado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }
}
