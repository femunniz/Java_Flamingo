package tarefa09;

import java.util.Scanner;

/*6) Elaborar um programa que efetue a leitura sucessiva 
de valores numéricos e apresente no final o total do 
somatório, a média aritmética e o total de valores lidos. 
O programa deve fazer as leituras dos valores enquanto o 
usuário estiver fornecendo valores positivos. Ou seja, o 
programa deve parar quando o usuário fornecer um valor negativo. 
Não se esqueça que o usuário pode entrar como primeiro número 
um número negativo, portanto, cuidado com a divisão por zero 
no cálculo da média.*/

public class Tarefa09_Ex06 {

	public static void main(String[] args) {

		float numero;
		int valoresLidos = 0;
		float soma = 0;
		float media = 0;
		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Digite um valor ");
			numero = sc.nextFloat();

			valoresLidos = valoresLidos + 1;
			soma = numero + soma;
			media = soma / valoresLidos;

			if (numero <= 0) {
				valoresLidos = valoresLidos - 1;
				soma = soma - (+numero);
				media = soma / valoresLidos;

				if (valoresLidos == 0) {
					media = 0;
				}

			}

		} while (numero >= 0);

		System.out.println("Valores Lidos " + (valoresLidos));
		System.out.println("Soma " + soma);
		System.out.println("Média " + media);
		sc.close();

	}

}
