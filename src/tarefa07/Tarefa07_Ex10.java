package tarefa07;

import java.util.Scanner;

/*10) Escreva um algoritmo que leia as idades de 2 homens 
e de 2 mulheres (considere que as idades dos homens serão 
sempre diferentes entre si, bem como as das mulheres). 
Calcule e escreva a soma das idades do homem mais velho 
com a mulher mais nova, e o produto das idades do homem 
mais novo com a mulher mais velha.*/

public class Tarefa07_Ex10 {

	public static void main(String[] args) {

		int homem1, homem2, mulher1, mulher2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite a idade do primerio homem: ");
		homem1 = sc.nextInt();
		System.out.print("Digite a idade do segundo homem: ");
		homem2 = sc.nextInt();
		System.out.print("Digite a idade da primeria mulher: ");
		mulher1 = sc.nextInt();
		System.out.print("Digite a idade da segunda mulher: ");
		mulher2 = sc.nextInt();

		if (homem1 > homem2 && mulher1 > mulher2) {
			System.out.println("A soma das idades do homem mais velho com a melher mais velha é " + (homem1 + mulher1));
			System.out
					.println("O produto das idades do homem mais novo com a melher mais nova é " + (homem2 * mulher2));
		} else if (homem1 > homem2 && mulher2 > mulher1) {
			System.out.println("A soma das idades do homem mais velho com a melher mais velha é " + (homem1 + mulher2));
			System.out
					.println("O produto das idades do homem mais novo com a melher mais nova é " + (homem2 * mulher1));
		} else if (homem2 > homem1 && mulher1 > mulher2) {
			System.out.println("A soma das idades do homem mais velho com a melher mais velha é " + (homem2 + mulher1));
			System.out
					.println("O produto das idades do homem mais novo com a melher mais nova é " + (homem1 * mulher2));
		} else if (homem2 > homem1 && mulher2 > mulher1) {
			System.out.println("A soma das idades do homem mais velho com a melher mais velha é " + (homem2 + mulher2));
			System.out
					.println("O produto das idades do homem mais novo com a melher mais nova é " + (homem1 * mulher1));
		} else {
			System.out.println("Idades iguais");
		}

		sc.close();
	}

}
