package tarefa05;

import java.util.Scanner;

/*
10)Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor,calcular e escrever o seu salário total.
*/

public class Tarefa05_Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do salário mensal do vendedor: ");
        float salarioMensal = scan.nextFloat();

        System.out.println("Digite o valor total de vendas feita pelo funcionário: ");
        float valorVendas = scan.nextFloat();

        float salarioFinal = valorVendas / 100 * 3 + salarioMensal;

        if (valorVendas <= 1500) {
            System.out.println("Com base nas suas vendas, seu salário esse mês será de R$ " + salarioFinal);
        } else if (valorVendas >= 1501) {
            System.out.println("Com base nas suas vendas, seu salário esse mês será de R$ "
                    + (salarioFinal - 1500) / 100 * 5 + salarioMensal);
        }

        scan.close();

    }

}
