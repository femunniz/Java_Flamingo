package tarefa05;

import java.util.Scanner;

// 3) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12.
// Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

public class Tarefa05_Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas maçãs você gostaria?");
        int maca = scan.nextInt();

        if (maca < 12) {
            System.out.println("Você pegou " + maca + " maçãs, o valor a ser pago será de R$ " + maca * 1.3);
        } else {
            System.out.println("Você pegou " + maca + " maçãs, o valor a ser pago será de R$ " + maca * 1);
        }

        scan.close();

    }
}
