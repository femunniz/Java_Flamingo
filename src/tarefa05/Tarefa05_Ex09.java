package tarefa05;

import java.util.Scanner;

/* 9)A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,cujo cálculo é o valor da hora regular com um acréscimo de 50%.Escreva um algoritmo que leia o número de horas trabalhadas em um mês,o salário por hora e escreva o salário total do funcionário,que deverá ser acrescido das horas extras,caso tenham sido trabalhadas(considere que o mês possua 4 semanas exatas).
*/

public class Tarefa05_Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de horas trabalhadas no mês: ");
        float horasTrabalhadas = scan.nextFloat();

        System.out.println("Digite o valor do seu salário mensal: ");
        float salario = scan.nextFloat();

        float valorHora = salario / 160;
        float salarioTotal = salario + (valorHora * 50) / 100 + valorHora;

        if (horasTrabalhadas > 160) {
            System.out.println("Seu salário final esse mês será de R$ " + salarioTotal);
        } else {
            System.out.println("Seu salário final esse mês não houve hora extra. Então será o valor padrão" + salario);
        }

        scan.close();

    }
}
