package tarefa06;

/*
    Elaborar um programa que efetue a leitura de um número inteiro e apresentar
    uma mensagem informando se o número é par ou ímpar.:
*/

import java.util.Scanner;

public class Tarefa06_Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite aqui um número qualquer: ");
        numero = scan.nextInt();

        if (numero % 2 == 1) {
            System.out.println("O número digitado é ímpar!");
        } else {
            System.out.println("O número digitado é par!");
        }

        scan.close();

    }
}
