package tarefa02;
import java.util.Scanner;

/*
 * 4) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a subtração dos valores.
 */

public class Tarefa02_Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scan.nextInt();

        int subtracao = n1 - n2;
        System.out.println("A subtração dos números digitados é: " + subtracao);

        scan.close();
    }
}