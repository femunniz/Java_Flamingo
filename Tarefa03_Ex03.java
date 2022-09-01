package tarefa03;

import java.util.Scanner;

/*
 * 3) Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
 * Calcular e escrever o valor do novo salário.
 */
public class Tarefa03_Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do seu sálario atual: R$");
        float salarioAtual = scan.nextFloat();
        System.out.println("Digite o valor do percentual de reajuste: ");
        float reajuste = scan.nextFloat();

        float salarioNovo = salarioAtual / 100 * reajuste + salarioAtual;
        System.out.println("O valor do seu sálario com o reajuste será de R$ " + salarioNovo);

        scan.close();

    }
}
