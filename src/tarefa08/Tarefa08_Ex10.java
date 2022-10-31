package tarefa08;

/*10) Elaborar um programa que apresente os resultados da soma e 
da média aritmética dos valores pares situados na faixa numérica de 50 a 70.*/

public class Tarefa08_Ex10 {

	public static void main(String[] args) {

		float contadora = 50;
		float somador = 0;

		while (contadora < 70) {

			somador = somador + contadora;

			contadora = contadora + 2;
		}

		System.out.println("Soma: " + somador);
		System.out.println("Média: " + (somador / 10));

	}

}
