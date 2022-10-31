package tarefa08;

import java.util.Scanner;

/*9) Elaborar um programa que efetue a leitura de 10 valores 
numéricos e apresente no final o total do somatório e a 
média aritmética dos valores lidos.*/

public class Tarefa08_Ex09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int contadora = 1;
		float numero = 0;
		float somador = 0;

		while (contadora <= 10) {
			System.out.print("Digite o valor numero " + contadora + ": ");
			numero = sc.nextFloat();

			somador = somador + numero;

			contadora++;

		}

		System.out.println("A soma dos número digitados é: " + somador);
		System.out.println("A média dos números digitados é: " + (somador / 10));

		sc.close();
	}

}
