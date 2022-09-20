package tarefa05;

// 11)Faça um algoritmo para ler:número da conta do cliente,saldo,débito e crédito.Após,calcular e escrever o saldo atual(saldo atual=saldo-débito+crédito).Também testar se saldo atual for maior ou igual a zero escrever a mensagem'Saldo Positivo',senão escrever a mensagem'Saldo Negativo'.

import java.util.Scanner;

public class Tarefa05_Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o número da sua conta corrente aqui: ");
        int contaCorrente = scan.nextInt();

        System.out.println("Digite aqui o saldo da sua conta corrente: ");
        float saldoConta = scan.nextFloat();

        System.out.println("Digite aqui o valor de débito da sua conta corrente: ");
        float debitoConta = scan.nextFloat();

        System.out.println("Digite aqui o valor de crédito da sua conta corrente: ");
        float creditoConta = scan.nextFloat();

        float saldoAtual = saldoConta - debitoConta + creditoConta;

        if (saldoAtual >= 0) {
            System.out.println("Para a conta corrente informada: " + contaCorrente + " O saldo é de R$ " + saldoAtual
                    + ". POSITIVO");
        } else {
            System.out.println("Desculpe, mas seu saldo é de R$ " + saldoAtual + " ,e está negativo.");
        }

        scan.close();
    }
}
