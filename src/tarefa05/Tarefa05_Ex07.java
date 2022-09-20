package tarefa05;

import java.util.Scanner;

// 7)Ler dois valores(considere que não serão lidos valores iguais)e escrevê-los em ordem crescente.

public class Tarefa05_Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite aqui o segundo valor: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            System.out.println("A ordem crescente dos números digitados é: " + valor2 + ", " + valor1);
        } else {
            System.out.println("A ordem crescente dos números digitados é: " + valor1 + ", " + valor2);
        }

        scan.close();

    }
}
