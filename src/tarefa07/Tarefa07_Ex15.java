package tarefa07;

import java.util.Scanner;

/*15) Uma empresa quer verificar se um empregado está qualificado para
a aposentadoria ou não. Para estar em condições, um dos seguintes 
requisitos deve ser satisfeito:
	
- Ter no mínimo 65 anos de idade.

- Ter trabalhado no mínimo 30 anos.

- Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.

Com base nas informações acima, faça um algoritmo que leia: o número do empregado 
(código), o ano de seu nascimento e o ano de seu ingresso na empresa. O programa 
deverá escrever a idade e o tempo de trabalho do empregado e a mensagem 'Requerer 
aposentadoria' ou 'Não requerer'.*/

public class Tarefa07_Ex15 {

	public static void main(String[] args) {

		int anoNascimento, codigoFuncionario, anoDeIngresso, idade, tempoEmpresa;
		final int ano = 2022;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o código do funcionário: ");
		codigoFuncionario = sc.nextInt();
		System.out.print("Digite o ano de nascimento do funcionário: ");
		anoNascimento = sc.nextInt();
		System.out.print("Digite o ano de ingresso do funcionário a empresa: ");
		anoDeIngresso = sc.nextInt();

		idade = ano - anoNascimento;
		tempoEmpresa = ano - anoDeIngresso;

		if (idade >= 65 || tempoEmpresa >= 30 || (idade >= 60 && tempoEmpresa >= 25)) {
			System.out.println();
			System.out.println(codigoFuncionario + ", idade: " + idade + ", tempo de firma: " + tempoEmpresa
					+ ", pode aposentar, requerer aposentadoria?");
		} else {
			System.out.println();
			System.out.println(codigoFuncionario + ", idade: " + idade + ", tempo de firma: " + tempoEmpresa
					+ ", não pode aposenta ainda");
		}

		sc.close();
	}

}
