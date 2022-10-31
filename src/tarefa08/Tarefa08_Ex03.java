package tarefa08;

//3) Elaborar um programa que apresente no final o somatório dos valores pares existentes na faixa de 1 até 500.

public class Tarefa08_Ex03 {

	public static void main(String[] args) {

		int contadora = 0;
		int soma = 0;

		while (contadora <= 500) {
			soma = soma + contadora;
			contadora = contadora + 2;
		}
		System.out.println(soma);
	}

}
