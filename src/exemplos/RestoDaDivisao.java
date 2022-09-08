package exemplos;

import java.util.Scanner;

public class RestoDaDivisao {

	public static void main(String[] args) {

		// Resto da divisão
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor9 = sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor10 = sc.nextInt();
		int restoD = valor9 % valor10;
		System.out.println("O resto da divisão de dois valores corresponde a: " + restoD);

		sc.close();

	}

}
