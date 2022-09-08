package tarefa03;

import java.util.Scanner;

/*
 * 2) Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos,
 * nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
 */

public class Tarefa03_Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de eleitores de um município: ");
        int eleitores = scan.nextInt();
        System.out.println("Digite a quantidade de votos brancos: ");
        float brancos = scan.nextFloat();
        System.out.println("Digite a quantidade de votos nulos: ");
        float nulos = scan.nextFloat();
        System.out.println("Digite a quantidade de votos válidos: ");
        float validos = scan.nextFloat();

        if (brancos < 0) {
            System.out.println("Não houve votos em branco!");
        } else {
            System.out.println("A quantidade de votos brancos equivale a: " + 100 * brancos / eleitores + "%");
        }

        if (nulos < 0) {
            System.out.println("Não houve votos nulos!");
        } else {
            System.out.println("A quantidade de votos nulos equivale a: " + 100 * nulos / eleitores + "%");
        }

        if (validos < 0) {
            System.out.println("Não houve votos válidos!");
        } else {
            System.out.println("A quantidade de votos válidos equivale a: " + 100 * validos / eleitores + "%");
        }

        scan.close();
    }
}
