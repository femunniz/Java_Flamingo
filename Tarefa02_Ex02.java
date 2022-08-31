package tarefa02;
import java.util.Scanner;

/*
 * 2) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número antecessor.
 */

public class Tarefa02_Ex02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero, antecessor;

        System.out.println("Digite um número: ");
        numero = scan.nextInt();

        antecessor = numero - 1;
        System.out.println("O antecessor do número " + numero + " é: " + antecessor);

        scan.close();

    }

}
