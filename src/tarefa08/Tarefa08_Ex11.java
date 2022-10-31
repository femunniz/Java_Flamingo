package tarefa08;

import java.util.Scanner;

/*11) Elaborar um programa que possibilite calcular a área total de
uma residência (sala, cozinha, banheiro, quartos, área de serviço, 
quintal, garagem, etc.). O programa deve solicitar a entrada do 
nome, a largura e o comprimento de um determinado cômodo. Em seguida,
deve apresentar a área do cômodo lido e também uma mensagem solicitando 
do usuário a confirmação de continuar calculando novos cômodos. Caso o 
usuário responda “NAO”, o programa deve apresentar o valor total acumulado 
da área residencial.*/

public class Tarefa08_Ex11 {

	public static void main(String[] args) {

		float altura, largura, area, acumulaArea;
		String continuar = "";
		String comodo;
		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Calculadora de area das casas");
		System.out.println();

		do {

			System.out.println("Digite o nome do comodo da casa");

			System.out.println("Deseja continuar calculando? ");
			continuar = sc.next();

		} while (continuar == "sim");

		sc.close();
	}

}
