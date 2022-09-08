package tarefa04;

import java.util.Scanner;

//6) Elaborar um programa que efetue a leitura de três valores (A, B e C) e 
//apresente como resultado final à soma dos quadrados dos três valores lidos.

public class Tarefa04_Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vairaveis

        int a, b, c, somaDosQuadrados;

        // variaveis

        System.out.println("Digite o primeiro valor");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        c = sc.nextInt();

        somaDosQuadrados = (a * a) + (b * b) + (c * c);

        System.out.println("A soma dos quadrados dos número digitados é: " + somaDosQuadrados);

        sc.close();
    }
}
