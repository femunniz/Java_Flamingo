package tarefa06;

/* 
    Elaborar um programa que efetue a leitura de um valor que esteja entre a faixa de 1 a 9. 
    Após a leitura do valor fornecido pelo usuário, o programa deverá indicar uma de duas mensagens:
    "O valor está na faixa permitida", caso o usuário forneça o valor nesta faixa, ou a mensagem
    "O valor está fora da faixa permitida", caso o usuário forneça valores menores que 1 ou maiores que 9.
*/

import java.util.Scanner;

public class Tarefa06_Ex10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Digite aqui um número: ");
        numero = scan.nextInt();

        if (numero < 1 || numero > 9) {
            System.out.println("O valor está fora da faixa permitida");
        } else {
            System.out.println("O valor está dentro da faixa permitida");
        }

        scan.close();

    }
}
