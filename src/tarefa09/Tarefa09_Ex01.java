package tarefa09;

//1) Apresentar os quadrados dos números inteiros de 15 a 200.

public class Tarefa09_Ex01 {

	public static void main(String[] args) {

		int numero = 15;

		do {

			System.out.println(numero * numero);

			numero++;

		} while (numero <= 200);
	}

}
