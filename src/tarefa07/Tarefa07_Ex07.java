package tarefa07;

import java.util.Scanner;

/*7) Ler dois valores e imprimir uma das três mensagens a seguir:

‘Números iguais’, caso os números sejam iguais

‘Primeiro é maior’, caso o primeiro seja maior que o segundo;

‘Segundo maior’, caso o segundo seja maior que o primeiro.*/

public class Tarefa07_Ex07 {

	public static void main(String[] args) {

		int valor1, valor2;

		Scanner sc = new Scanner(System.in);

		System.out.println("DIgite o primeiro valor");
		valor1 = sc.nextInt();
		System.out.println("DIgite o segundo valor");
		valor2 = sc.nextInt();

		if (valor1 > valor2) {
			System.out.println("‘Primeiro é maior");
		} else if (valor1 == valor2) {
			System.out.println("Números iguais");
		} else {
			System.out.println("Segundo maior");
		}

		sc.close();

	}

}
