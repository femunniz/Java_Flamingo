package tarefa04;

import java.util.Scanner;

//7) Elaborar um programa que efetue a leitura de três valores (A, B e C)
// e apresente como resultado final o quadrado da soma dos três valores lidos.

public class Tarefa04_Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vairaveis

        int a, b, c, quadradoDasSomas, somas;

        // variaveis

        System.out.println("Digite o primeiro valor");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        c = sc.nextInt();

        somas = a + b + c;
        quadradoDasSomas = somas * somas;

        System.out.println("O quadrado da soma dos três valores é: " + quadradoDasSomas);

        sc.close();

    }
}
