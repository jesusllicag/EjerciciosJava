package Semana10;

import java.util.Scanner;

public class S10Sesion1Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = {0,0,0};
        int totalVotos = 10;

        System.out.println("Votación de colores para campaña publicitaria:");
        System.out.println("Opciones: 1: [C]eleste, 2: [M]orado, 3: [T]urquesa");

        for (int i = 0; i < totalVotos; i++) {
            System.out.printf("Voto %d: ", i + 1);
            String voto = sc.nextLine().trim().toLowerCase();

            switch (voto) {
                case "celeste", "c", "1":
                    votos[0]++;
                    break;
                case "morado", "m", "2":
                    votos[1]++;
                    break;
                case "turquesa", "t", "3":
                    votos[2]++;
                    break;
                default:
                    System.out.println("Voto inválido. No se contará.");
                    i--;
            }
        }

        double porcCeleste = (votos[0] * 100.0) / totalVotos;
        double porcMorado = (votos[1] * 100.0) / totalVotos;
        double porcTurquesa = (votos[2] * 100.0) / totalVotos;

        String colorGanador = "Empate";
        if (votos[0] > votos[1] && votos[0] > votos[2]) {
            colorGanador = "Celeste";
        } else if (votos[1] > votos[0] && votos[1] > votos[2]) {
            colorGanador = "Morado";
        } else if (votos[2] > votos[0] && votos[2] > votos[1]) {
            colorGanador = "Turquesa";
        }

        String reporte = String.format(
                "\n--- RESULTADOS DE LA VOTACIÓN ---\n" +
                        "Celeste:   %2d votos (%.2f%%)\n" +
                        "Morado:    %2d votos (%.2f%%)\n" +
                        "Turquesa:  %2d votos (%.2f%%)\n" +
                        "----------------------------------\n" +
                        "Color elegido: %s\n",
                votos[0], porcCeleste,
                votos[1], porcMorado,
                votos[2], porcTurquesa,
                colorGanador
        );

        System.out.println(reporte);
    }
}

