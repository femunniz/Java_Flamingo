package tarefa05;

import java.util.Scanner;

// 5) Ler o ano atual e o ano de nascimento de uma pessoa.
// Escrever uma mensagem que diga se ela poderá ou não votar este ano(não é necessário considerar o mês em que a pessoa nasceu).

public class Tarefa05_Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite aqui em qual ano você nasceu: ");
        int nascimento = scan.nextInt();

        System.out.println("Digite aqui em qual ano estamos: ");
        int anoAtual = scan.nextInt();

        int voto = anoAtual - nascimento;

        if (voto >= 18) {
            System.out.println("Cidadão, seu voto é obrigatório!");
        } else if (voto >= 16 && voto <= 17) {
            System.out.println("Cidadão, seu voto não é obrigatório, mas sim, opcional!");
        } else {
            System.out.println("Cidadão, você não possui idade o suficiente ainda para votar!");
        }

        scan.close();

    }
}
