package exemplos;

import java.util.Scanner;

public class if_else {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int valor = sc.nextInt();
		if (valor > 20) {
			System.out.println("Valor digitado é menor que 20");
		} else {
			System.out.println("Valor digitado é menor que 20");
		}
		sc.close();
	}

}
