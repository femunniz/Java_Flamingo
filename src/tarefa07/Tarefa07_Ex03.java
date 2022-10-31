package tarefa07;

import java.util.Scanner;

//3) Ler 3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores

public class Tarefa07_Ex03 {

	public static void main(String[] args) {
		int valor1, valor2, valor3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		valor3 = sc.nextInt();

		if (valor1 < valor2 && valor1 < valor3) {
			System.out.println("Soma dos dois maiores valores: " + (valor2 + valor3));
		} else if (valor2 < valor3 && valor2 < valor1) {
			System.out.println("Soma dos dois maiores valores: " + (valor1 + valor3));
		} else {
			System.out.println("Soma dos dois maiores valores: " + (valor1 + valor2));
		}

		sc.close();

	}

}
