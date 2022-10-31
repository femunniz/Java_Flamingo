package tarefa07;

import java.util.Scanner;

/*13) Faça um algoritmo para ler: a descrição do produto (nome), a quantidade 
adquirida e o preço unitário. Calcular e escrever o total (total = quantidade 
adquirida * preço unitário), o desconto e o total a pagar (total a pagar = total - 
desconto), sabendo-se que:

- Se quantidade <= 5 o desconto será de 2%

- Se quantidade > 5 e quantidade <=10 o desconto será de 3%

- Se quantidade > 10 o desconto será de 5%*/

public class Tarefa07_Ex13 {

	public static void main(String[] args) {

		int quantidade;
		float valorTotal, precoUnitario;
		String nome;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do produto: ");
		nome = sc.nextLine();
		System.out.print("Digite a quantidade de " + nome + " comprado: ");
		quantidade = sc.nextInt();
		System.out.print("Digite o valor unitário do/a " + nome + " ");
		precoUnitario = sc.nextFloat();

		if (quantidade <= 5) {
			valorTotal = (quantidade * precoUnitario) - (quantidade * precoUnitario * 0.02f);
		} else if (quantidade > 5 && quantidade <= 10) {
			valorTotal = (quantidade * precoUnitario) - (quantidade * precoUnitario * 0.03f);
		} else {
			valorTotal = (quantidade * precoUnitario) - (quantidade * precoUnitario * 0.05f);
		}

		System.out.println(valorTotal);

		sc.close();

	}

}
