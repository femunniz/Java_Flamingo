package tarefa05;

import java.util.Scanner;

// 1)Ler um valor e escrever a mensagem É MAIOR QUE 10!se o valor lido for maior que 10,caso
// contrário escrever NÃO É MAIOR QUE 10!

public class Tarefa05_Ex01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Olá, digite um número: ");
        int numero = scan.nextInt();

        if (numero > 10) {
            System.out.println("O número digitado é maior do que 10 !");
        } else {
            System.out.println("O número digitado é menor do que 10 !");
        }

        scan.close();
    }
}
