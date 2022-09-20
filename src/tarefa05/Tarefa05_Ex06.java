package tarefa05;

import java.util.Scanner;

// 6)Ler dois valores(considere que não serão lidos valores iguais)e escrever o maior deles.

public class Tarefa05_Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite aqui o segundo valor: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            System.out.println("O valor maior é: " + valor1);
        } else {
            System.out.println("O valor maior é: " + valor2);
        }

        scan.close();

    }
}
