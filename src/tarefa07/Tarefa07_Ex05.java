package tarefa07;

import java.util.Scanner;

/*5) Ler 3 valores (A, B e C) representando as medidas dos 
lados de um triângulo e escrever se formam ou não um triângulo. 
OBS: para formar um triângulo, o valor de cada lado deve ser 
menor que a soma dos outros 2 lados.*/

public class Tarefa07_Ex05 {

	public static void main(String[] args) {

		float lado1, lado2, lado3;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primero lado do triângulo: ");
		lado1 = sc.nextFloat();
		System.out.print("Digite o segundo lado do triângulo: ");
		lado2 = sc.nextFloat();
		System.out.print("Digite o terceiro lado do triângulo: ");
		lado3 = sc.nextFloat();

		if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
			System.out.println("Os valores digitados formam um triângulo");
		} else {
			System.out.println("Os valores digitados não formam um triângulo");
		}

		sc.close();
	}

}
