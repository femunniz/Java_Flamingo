package tarefa03;

import java.util.Scanner;

/*
     10) Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados.
 */
public class Tarefa03_Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int aux;

        System.out.println("Digite o valor de A: ");
        int valorA = scan.nextInt();
        System.out.println("Digite o valor de B: ");
        int valorB = scan.nextInt();

        aux = valorA;
        valorA = valorB;
        valorB = aux;

        System.out.println("O valor de A é: " + valorA);
        System.out.println("O valor de B é: " + valorB);

        scan.close();
    }
}
