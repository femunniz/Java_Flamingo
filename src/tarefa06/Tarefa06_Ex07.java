package tarefa06;

import java.util.Scanner;

// Efetuar a leitura de quatro números inteiros e apresentar os números que são divisíveis por 2 e 3.

public class Tarefa06_Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1, valor2, valor3, valor4;

        System.out.println("Digite aqui o primeiro valor: ");
        valor1 = scan.nextInt();

        System.out.println("Digite aqui o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("Digite aqui o terceiro valor: ");
        valor3 = scan.nextInt();

        System.out.println("Digite aqui o quarto valor: ");
        valor4 = scan.nextInt();

        if (((valor1 % 2) == 0) || ((valor1 % 3) == 0))
            System.out.printf("\n%d é divisivel por 2 ou 3.\n", valor1);

        if (((valor2 % 2) == 0) || ((valor2 % 3) == 0))
            System.out.printf("\n%d é divisivel por 2 ou 3.\n", valor2);

        if (((valor3 % 2) == 0) || ((valor3 % 3) == 0))
            System.out.printf("\n%d é divisivel por 2 ou 3.\n", valor3);

        if (((valor4 % 2) == 0) || ((valor4 % 3) == 0))
            System.out.printf("\n%d é divisivel por 2 ou 3.\n", valor4);

        scan.close();

    }
}
