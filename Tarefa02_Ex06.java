package tarefa02;
import java.util.Scanner;

/*
 * 6) Escreva um algoritmo para ler dois valores do teclado e exibir como resposta a divisão dos valores.
 */

public class Tarefa02_Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número: ");
        int n2 = scan.nextInt();

        int divisao = n1 / n2;
        System.out.println("A divisão dos números digitados é: " + divisao);

        scan.close();
    }
}
