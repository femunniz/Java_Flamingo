package tarefa02;
import java.util.Scanner;

/*
    10) Escreva um algoritmo para ler as dimensões de um losango (diagonal maior, diagonal menor), calcular e escrever a área do losango. Dica a=D.d/2
 */
public class Tarefa02_Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a diagonal maior: ");
        int maior = scan.nextInt();
        System.out.println("Digite a diagonal menor: ");
        int menor = scan.nextInt();

        int area = maior * menor / 2;
        System.out.println("A área do losango é: " + area + " m");

        scan.close();
    }
}
