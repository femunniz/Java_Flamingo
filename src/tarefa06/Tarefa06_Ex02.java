package tarefa06;

// 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o número lido como sendo um valor positivo,ou seja,o programa deverá apresentar o módulo de um número fornecido.Lembre-se de verificar se o número fornecido é menor que zero;sendo,multiplique-o por-1.

import java.util.Scanner;

public class Tarefa06_Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite aqui um número: ");
        numero = scan.nextInt();

        if (numero < 0)
            numero = numero * (-1);
        System.out.println("O módulo do número informado é: " + numero);

        scan.close();
    }
}
