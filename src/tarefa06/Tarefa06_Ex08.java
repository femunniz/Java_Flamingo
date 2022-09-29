package tarefa06;

import java.util.Scanner;

// 8. Efetuar a leitura de cinco números inteiros e identificar o maior e o menor valores.

public class Tarefa06_Ex08 {

    static int[] processa(int[] vetor) {
        int[] resultado = new int[2];
        int maior = -1, menor = 99999999;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                resultado[0] = vetor[i];
            }
            if (vetor[i] < menor) {
                resultado[1] = vetor[i];
            }
        }
        return resultado;
    }

    public static void main(String[] args) {

        int[] vetor = new int[5];
        Scanner dados = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("digite o " + (i + 1) + "ª valor: ");
            vetor[i] = dados.nextInt();
        }
        int resultado[] = processa(vetor);
        System.out.println("maior valor: " + resultado[0]);
        System.out.println("menor valor: " + resultado[1]);

        dados.close();

    }
}
