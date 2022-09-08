package tarefa04;

import java.util.Scanner;

/*9) Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador 
e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar 
o valor do novo salário (variável NS).*/

public class Tarefa04_Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variavel

        float salario, percentualReajuste, novoSalario;

        // variavel

        System.out.println("Digite o salário do peão:");
        salario = sc.nextFloat();
        System.out.println("Digite o percentual de reajuste:");
        percentualReajuste = sc.nextFloat();

        novoSalario = (salario * (percentualReajuste / 100)) + salario;

        System.out.println("O novo salario do peão é: " + novoSalario);

        sc.close();
    }
}
