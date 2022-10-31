package tarefa09;

import java.util.Scanner;

/*10) Elaborar um programa que apresente o resultado inteiro da divisão 
de dois números quaisquer. Para a elaboração do programa, não utilizar 
em hipótese alguma o conceito do operador aritmético DIV. A solução deve 
ser alcançada com a utilização de looping. Ou seja, o programa deve 
apresentar como resultado (quociente) quantas vezes o divisor cabe no dividendo.*/

public class Tarefa09_Ex10 {

	public static void main(String[] args) {

		int numero1, numero2, acumuladora, contadora = 1, soma = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("primeiro numero: ");
		numero1 = sc.nextInt();
		System.out.println("dividido por: ");
		numero2 = sc.nextInt();

		do {
			soma++;
			acumuladora = numero2 * contadora;

			// if (acumuladora > numero1) {

			// }

			contadora++;

		} while (acumuladora <= numero1);

		System.out.println(soma);

		sc.close();
	}

}
