package tarefa07;

import java.util.Scanner;

//2) Ler 3 valores (considere que não serão informados valores iguais) e escrever o maior deles.

public class Tarefa07_Ex02 {

	public static void main(String[] args) {
		int valor1, valor2, valor3;

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.print("Digite o terceiro valor: ");
		valor3 = sc.nextInt();

		if (valor1 > valor2 && valor1 > valor3) {
			System.out.println("O maior valor: " + valor1);
		} else if (valor2 > valor1 && valor2 > valor3) {
			System.out.println("O maior valor: " + valor2);
		} else {
			System.out.println("O maior valor: " + valor3);
		}

		sc.close();
	}

}
