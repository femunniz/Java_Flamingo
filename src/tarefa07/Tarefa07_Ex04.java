package tarefa07;

import java.util.Scanner;

/*4) Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los em ordem
crescente.*/

public class Tarefa07_Ex04 {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor de a número");
		a = sc.nextInt();
		System.out.println("Digite o valor de b número");
		b = sc.nextInt();
		System.out.println("Digite o valor de c número");
		c = sc.nextInt();

		if (a > b && a > c && b > c) {
			System.out.println(c + ", " + b + ", " + a);
		} else if (b > a && b > c && c > a) {
			System.out.println(a + ", " + c + ", " + b);
		} else if (c > a && c > b && b > a) {
			System.out.println(a + ", " + b + ", " + c);
		} else if (b > a && b > c && a > c) {
			System.out.println(c + ", " + a + ", " + b);
		} else if (c > a && c > b && a > b) {
			System.out.println(b + ", " + a + ", " + c);
		} else {
			System.out.println(b + ", " + c + ", " + a);
		}

		sc.close();

	}

}
