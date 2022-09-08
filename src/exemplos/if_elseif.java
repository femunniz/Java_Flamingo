package exemplos;

import java.util.Scanner;

public class if_elseif {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número de 1 á 7: ");
		int numero = sc.nextInt();
		if (numero == 1) {
			System.out.println("Pelo número digitado hoje é, Domingo");
		} else if (numero == 2) {
			System.out.println("Pelo número digitado hoje é, Segunda-Feira");
		} else if (numero == 3) {
			System.out.println("Pelo número digitado hoje é, Terça-Feira");
		} else if (numero == 4) {
			System.out.println("Pelo número digitado hoje é, Quarta-Feira");
		} else if (numero == 5) {
			System.out.println("Pelo número digitado hoje é, Quinta-Feira");
		} else if (numero == 6) {
			System.out.println("Pelo número digitado hoje é, Sexta-Feira");
		} else if (numero == 7) {
			System.out.println("Pelo número digitado hoje é, Sábado");
		}
		;

		sc.close();

	}

}
