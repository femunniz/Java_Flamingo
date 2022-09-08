package tarefa03;

import java.util.Scanner;

/**
 * 1) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
 * dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano
 * com 365 dias e mês com 30 dias.
 */
public class Tarefa03_Ex01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quantos anos você tem: ");
        int idade = scan.nextInt();

        int dias = (365 * idade) + 30;
        System.out.println("Sua idade representada em dias vívidos é igual a: " + dias + " dias");

        scan.close();
    }

}