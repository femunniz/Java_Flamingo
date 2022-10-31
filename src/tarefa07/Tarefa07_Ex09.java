package tarefa07;

import java.util.Scanner;

/*9) Escreva um algoritmo que leia o número de litros vendidos 
e o tipo de combustível (codificado da seguinte forma: A-álcool, 
G-gasolina), calcule e imprima o valor a ser pago pelo cliente 
sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço 
do litro do álcool é R$ 2,90.*/

public class Tarefa07_Ex09 {

	public static void main(String[] args) {

		char tipoCombustivel;
		float litrosCombustivel, valorTotal;

		Scanner sc = new Scanner(System.in);

		System.out.println("--------- Posto de Combustível ----------");
		System.out.println("-------------------------------------");
		System.out.println("--- Digite o tipo de combustível ----");
		System.out.println("A - alcool preço por litro: R$ 2,90");
		System.out.println("G - gasolina Preço por litro: R$ 3,30");
		tipoCombustivel = sc.next().charAt(0);
		System.out.println("Digite quantos litros você quer");
		litrosCombustivel = sc.nextFloat();

		if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
			if (litrosCombustivel <= 20) {
				valorTotal = (litrosCombustivel * 2.90f) - ((litrosCombustivel * 2.90f) * (0.03f));
			} else {
				valorTotal = (litrosCombustivel * 2.90f) - ((litrosCombustivel * 2.90f) * (0.05f));
			}
			System.out.println("Resumo da Compra:");
			System.out.println("combustível: alcool, litros: " + litrosCombustivel + " valor a pagar R$ " + valorTotal);

		} else if (tipoCombustivel == 'g' || tipoCombustivel == 'G') {
			if (litrosCombustivel <= 20) {
				valorTotal = (litrosCombustivel * 3.30f) - ((litrosCombustivel * 3.30f) * (0.04f));
			} else {
				valorTotal = (litrosCombustivel * 3.30f) - ((litrosCombustivel * 3.30f) * (0.06f));
			}

			System.out.println("Resumo da Compra:");
			System.out
					.println("combustível: gasolina, litros: " + litrosCombustivel + " valor a pagar R$ " + valorTotal);
		} else {
			System.out.println("Não existe esse tipo de combustível");
		}

		sc.close();
	}

}
