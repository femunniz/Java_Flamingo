package tarefa02;
import java.util.Scanner;

/*
 * 1) Escreva um algoritmo para ler um valor do teclado e exibir como resposta o número sucessor.
 */

public class Tarefa02_Ex01 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero, sucessor;

        System.out.println("Digite um número: ");
        numero = teclado.nextInt();

        sucessor = numero + 1;
        System.out.println("O sucessor do número " + numero + " é: " + sucessor);

        teclado.close();
    }
}
