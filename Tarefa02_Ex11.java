package tarefa02;
import java.util.Scanner;

/*
    11) Escreva um algoritmo para ler as dimensões de um trapézio (base amior, base menor e altura), calcular e escrever a área do trapézio. a=(B+b).h/2
 */

public class Tarefa02_Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a base maior do trapézio: ");
        int maior = scan.nextInt();
        System.out.println("Digite a base menor do trapézio: ");
        int menor = scan.nextInt();
        System.out.println("Digite a altura do trapézio: ");
        int altura = scan.nextInt();

        int area = (maior + menor) * altura / 2;
        System.out.println("A área do trapézio é: " + area + " m");

        scan.close();
    }
}
