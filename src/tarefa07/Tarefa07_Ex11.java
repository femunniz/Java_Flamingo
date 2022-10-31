package tarefa07;

import java.util.Scanner;

/*11) Uma fruteira está vendendo frutas com a seguinte tabela de preços:
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade 
(em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.*/

public class Tarefa07_Ex11 {

	public static void main(String[] args) {

		float morango, maca, opcao, valorTotal;

		Scanner sc = new Scanner(System.in);

		System.out.println("Quitanda do zé");
		System.out.println("1 - Morango preço por kg R$ 2,50 acima de 5 kg 2,20");
		System.out.println("2 - maça preço por kg R$ 1,80, acima de 5kg 1,50");
		System.out.println("3 - Deseja comprar os 2");
		opcao = sc.nextFloat();

		if (opcao == 1) {

			System.out.println();
			System.out.println("Você escolheu morango");
			System.out.print("Digite a quantidade de quilos que quer levar ");
			morango = sc.nextFloat();

			if (morango > 5) {
				valorTotal = morango * 2.20f;
			} else {
				valorTotal = morango * 2.50f;
			}

			if (morango > 8 || valorTotal > 25) {
				valorTotal = valorTotal - (valorTotal * 0.10f);
				System.out.println(morango + " kg deu R$ " + valorTotal + " Desconto de 10%");
			} else {
				System.out.println(morango + " kg deu R$ " + valorTotal);
			}

		} else if (opcao == 2) {

			System.out.println();
			System.out.println("Você escolheu maçã");
			System.out.print("Digite a quantidade de quilos que quer levar ");
			maca = sc.nextFloat();

			if (maca > 5) {
				valorTotal = maca * 1.50f;
			} else {
				valorTotal = maca * 1.80f;
			}

			if (maca > 8 || valorTotal > 25) {
				valorTotal = valorTotal - (valorTotal * 0.10f);
				System.out.println(maca + " kg deu R$ " + valorTotal + " Desconto de 10%");
			} else {
				System.out.println(maca + " kg deu R$ " + valorTotal);
			}

		} else if (opcao == 3) {
			System.out.println();
			System.out.println("Você escolheu comprar os 2");
			System.out.print("Digite a quantidade de quilos que quer levar de morango: ");
			morango = sc.nextFloat();
			System.out.print("Digite a quantidade de quilos que quer levar de maçã: ");
			maca = sc.nextFloat();

			if (morango > 5 && maca > 5) {
				valorTotal = (morango * 2.20f) + (maca * 1.50f);
			} else if (morango <= 5 && maca <= 5) {
				valorTotal = (morango * 2.50f) + (maca * 1.80f);
			} else if (morango <= 5 && maca > 5) {
				valorTotal = (morango * 2.50f) + (maca * 1.50f);
			} else {
				valorTotal = (morango * 2.20f) + (maca * 1.80f);
			}

			if (morango + maca > 8 || valorTotal > 25) {
				valorTotal = valorTotal - (valorTotal * 0.10f);
				System.out.println((maca + morango) + " kg deu R$ " + valorTotal + " Desconto de 10%");
			} else {
				System.out.println((maca + morango) + " kg deu R$ " + valorTotal);
			}

		} else {
			System.out.println("Opção inválida");
		}

		sc.close();

	}

}
