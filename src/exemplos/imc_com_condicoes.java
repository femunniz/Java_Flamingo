package exemplos;

import java.util.Scanner;

public class imc_com_condicoes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		float peso, altura, imc;

		System.out.println("Calculadora de Imc");
		System.out.println();
		System.out.println("Digite o seu nome: ");
		nome = sc.next();
		System.out.println("Digite o seu peso: ");
		peso = sc.nextFloat();
		System.out.println("Digite sua altura: ");
		altura = sc.nextFloat();

		imc = peso / (float) (Math.pow(altura, 2));

		if (imc <= 18.5) {
			System.out.printf(nome + " Você está abaixo do peso!!! imc: %.2f%n", imc);
		} else if (imc <= 24.9) {
			System.out.printf(nome + " Você está no peso ideal!!! imc: %.2f%n", imc);
		} else if (imc <= 29.9) {
			System.out.printf(nome + " Você está acima do peso!!! imc: %.2f%n", imc);
		} else if (imc <= 34.9) {
			System.out.printf(nome + " Você está com obesidade grau 1!!! imc: %.2f%n", imc);
		} else if (imc <= 39.9) {
			System.out.printf(nome + " Você está com obesidade grau 2!!! imc: %.2f%n", imc);
		} else {
			System.out.printf(nome + " Você está com obesidade grau 3!!! imc: %.2f%n", imc);
		}

		sc.close();
	}

}
