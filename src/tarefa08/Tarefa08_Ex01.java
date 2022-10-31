package tarefa08;

import java.util.Scanner;

//1) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.

public class Tarefa08_Ex01 {

	public static void main(String[] args) {

		int contadora, numeroTaboada;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o numero que você quer apresentar a taboada: ");
		numeroTaboada = sc.nextInt();

		contadora = 1;

		while (contadora <= 10) {
			System.out.println(contadora + " X " + numeroTaboada + " = " + (numeroTaboada * contadora));
			contadora++;
		}

		sc.close();
	}

}
