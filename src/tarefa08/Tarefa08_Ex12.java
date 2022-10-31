package tarefa08;

import java.util.Scanner;

/*12) Elaborar um programa que efetue a leitura de valores positivos 
inteiros até que um valor negativo seja informado. Ao final devem 
ser apresentados o maior e o menor valores informados pelo usuário.*/

public class Tarefa08_Ex12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valor;
		int auxMaior = 0;
		int auxMenor = 0;

		do {
			System.out.print("Digite um valor: ");
			valor = sc.nextInt();

			if (valor > auxMaior) {
				auxMaior = valor;
			} else {
				auxMenor = valor;
			}

		} while (valor > 0);

		System.out.println();
		System.out.println("Maior valor digitado: " + auxMaior);
		System.out.println("Menor valor digitado: " + auxMenor);

		sc.close();
	}

}
