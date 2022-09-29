package tarefa06;

import java.util.Scanner;

// 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença do maior pelo menor valor.

public class Tarefa06_Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui o primeiro valor: ");
        int valor1 = scan.nextInt();

        System.out.println("Digite aqui o segundo valor: ");
        int valor2 = scan.nextInt();

        if (valor1 > valor2) {
            System.out.println(
                    "A diferença do primeiro valor " + valor1 + " para o segundo valor " + valor2 + " é: "
                            + (valor1 - valor2));
        } else {
            System.out.println(
                    "A diferença do primeiro valor " + valor2 + " para o segundo valor " + valor1 + " é: "
                            + (valor2 - valor1));
        }

        scan.close();
    }
}
