package tarefa06;

// 6. Efetuar a leitura de três valores(variáveis A,B e C)e efetuar o cálculo da equação completa de segundo grau,apresentando as duas raízes,se para os valores informados for possível efetuar o referido cálculo.Lembre-se de que a variável A deve ser diferente de zero.

import java.util.Scanner;

public class Tarefa06_Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorA, valorB, valorC;

        System.out.println("Digite o valor da variável A: ");
        valorA = scan.nextInt();

        System.out.println("Digite o valor da variável B: ");
        valorB = scan.nextInt();

        System.out.println("Digite o valor da variável C: ");
        valorC = scan.nextInt();

        if (valorA < valorB & valorB < valorC) {
            System.out
                    .println("Os números ordenados em ordem crescente são: " + valorA + ", " + valorB + ", " + valorC);
        } else if (valorA < valorB & valorB > valorC & valorC > valorA) {
            System.out
                    .println("Os números ordenados em ordem crescente são: " + valorA + ", " + valorC + ", " + valorB);
        } else if (valorA > valorB & valorB < valorC & valorA < valorC) {
            System.out
                    .println("Os números ordenados em ordem crescente são: " + valorB + ", " + valorA + ", " + valorC);
        } else if (valorA < valorB & valorA > valorC) {
            System.out
                    .println("Os números ordenados em ordem crescente são: " + valorC + ", " + valorA + ", " + valorB);
        } else if (valorB < valorA & valorC > valorB) {
            System.out
                    .println("Os números ordenados em ordem crescente são: " + valorB + ", " + valorC + ", " + valorA);
        } else {
            System.out
                    .println("Os números ordenados em ordem crescente são: " + valorC + ", " + valorB + ", " + valorA);
        }
        scan.close();
    }

}
