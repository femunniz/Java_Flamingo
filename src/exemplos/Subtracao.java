package exemplos;

import java.util.Scanner;

public class Subtracao {

	public static void main(String[] args) {

		// Subtração
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor3 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor4 = sc.nextInt();
		int subtracao = valor3 - valor4;
		System.out.println("A subtração dos dois valores corresponde a: " + subtracao);

		sc.close();

	}

}
