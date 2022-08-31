package tarefa02;
import java.util.Scanner;

/*
 * Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo. Dica a=b.h
 */

public class Tarefa02_Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();
        System.out.println("Digite a altura: ");
        int altura = scan.nextInt();

        int area = base * altura;
        System.out.println("A área do retângulo é: " + area + " m");

        scan.close();
    }
}
