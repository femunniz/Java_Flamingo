package tarefa02;
import java.util.Scanner;

/*
  8) Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular e escrever a área do triângulo. Dica a=b.h/2
 */

public class Tarefa02_Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base: ");
        int base = scan.nextInt();
        System.out.println("Digite a altura: ");
        int altura = scan.nextInt();

        int area = base * altura / 2;
        System.out.println("A área do triângulo é: " + area + " m");

        scan.close();
    }
}
