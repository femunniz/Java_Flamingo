package tarefa08;

import java.util.Scanner;

/*6) Elaborar um programa que apresente como resultado o valor de uma 
potência de uma base qualquer elevada a um expoente qualquer, ou seja
, de BE, em que B é o valor da base e E o valor do expoente. Observe 
que neste exercício não pode ser utilizado o operador de exponenciação 
do portuguol (^).*/

public class Tarefa08_Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int base, expoente;

		System.out.print("Digite valor da base: ");
		base = sc.nextInt();
		System.out.print("Digite o valor do expoente: ");
		expoente = sc.nextInt();

		System.out.println(Math.pow(base, expoente));

		sc.close();

	}

}
