package tarefa05;

import java.util.Scanner;

// 8)Ler a hora de início e a hora de fim de um jogo de Xadrez(considere apenas horas inteiras,sem os minutos)
// e calcule a duração do jogo em horas,sabendo-se que o tempo máximo de duração do jogo é de 24 horas
// e que o jogo pode iniciar em um dia e terminar no dia seguinte.

public class Tarefa05_Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite em que horas a partida começou: ");
        int inicio = scan.nextInt();

        System.out.println("Digite em que horas a partida terminou: ");
        int fim = scan.nextInt();

        // Se iniciado as 23hrs da noite e terminado as 01hr da manha já se passou 1 dia
        // e a duração total será de 03 horas.
        int duracao = fim - inicio + 24;

        if (duracao > 24) {
            System.out.println("A duração total da partida foi de " + duracao + " horas!");
        } else {
            System.out.println("A duração total da partida foi de " + duracao + " horas!");
        }

        scan.close();

    }
}
