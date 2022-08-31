package tarefa02;
import java.util.Scanner;

/*
    9) Escreva um algoritmo para ler as dimensões de um quadrado (lado), calcular e escrever a área do quadrado. Dica a=l²
 */
public class Tarefa02_Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int lado = scan.nextInt();

        int area = lado * lado;
        System.out.println("A área do quadrado é: " + area + " m");

        scan.close();
    }
}
