package tarefa07;

import java.util.Scanner;

/*14) Faça um algoritmo para ler as 3 notas obtidas por um aluno 
 * nas 3 verificações e a média dos exercícios que fazem parte da 
 * avaliação. Calcular a média de aproveitamento, usando a fórmula 
 * abaixo e escrever o conceito do aluno de acordo com a tabela de 
 * conceitos mais abaixo:
 */

public class Tarefa07_Ex14 {

	public static void main(String[] args) {

		float nota1, nota2, nota3, mediaExercicio, mediaAproveitamento;
		char conceito;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a primeira nota do aluno: ");
		nota1 = sc.nextFloat();
		System.out.print("Digite a segunda nota do aluno: ");
		nota2 = sc.nextFloat();
		System.out.print("Digite a terceira nota do aluno: ");
		nota3 = sc.nextFloat();
		System.out.print("Digite a nota média dos exercícios feitos: ");
		mediaExercicio = sc.nextFloat();

		mediaAproveitamento = (nota1 + nota2 * 2 + nota3 * 3 + mediaExercicio) / 7;

		if (mediaAproveitamento >= 9) {
			conceito = 'a';
		} else if (mediaAproveitamento >= 7.5 && mediaAproveitamento < 9) {
			conceito = 'b';
		} else if (mediaAproveitamento >= 6 && mediaAproveitamento < 7.5) {
			conceito = 'c';
		} else {
			conceito = 'd';
		}

		System.out.println("nota: " + mediaAproveitamento + ", " + conceito);

		sc.close();
	}

}
