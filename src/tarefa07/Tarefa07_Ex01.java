package tarefa07;

import java.util.Scanner;

//1) Ler um valor e escrever se é positivo, negativo ou zero.

public class Tarefa07_Ex01 {

	public static void main(String[] args) {

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número");
		numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("positivo");
		} else if (numero == 0) {
			System.out.println("zero");
		} else {
			System.out.println("negativo");
		}

		sc.close();
	}

}
