package tarefa05;

import java.util.Scanner;

// 2)Ler um valor e escrever se é positivo ou negativo(considere o valor zero como positivo).

public class Tarefa05_Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, digite um número: ");
        int numero = scan.nextInt();

        if (numero >= 0) {
            System.out.println("O número digitado é POSITIVO !");
        } else {
            System.out.println("O número digitado é NEGATIVO !");
        }

        scan.close();

    }
}
