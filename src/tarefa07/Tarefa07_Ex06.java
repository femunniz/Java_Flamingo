package tarefa07;

import java.util.Scanner;

/*6) Ler o nome de 2 times e o número de gols marcados na partida 
(para cada time). Escrever o nome do vencedor. Caso não haja 
vencedor deverá ser impressa a palavra EMPATE.*/

public class Tarefa07_Ex06 {

	public static void main(String[] args) {

		String time1, time2;
		int golsTime1, golsTime2;

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do primerio time: ");
		time1 = sc.nextLine();
		System.out.print("Digite a quantidade de gols que esse time fez: ");
		golsTime1 = sc.nextInt();
		System.out.print("Digite o nome do segundo time: ");
		sc.nextLine();
		time2 = sc.nextLine();
		System.out.print("Digite a quantidade de gols que esse time fez: ");
		golsTime2 = sc.nextInt();

		if (golsTime1 > golsTime2) {
			System.out.println("O time " + time1 + " ganhou o jogo de " + golsTime1 + " a " + golsTime2);
		} else if (golsTime1 == golsTime2) {
			System.out.println("A partida terminou empatada");
		} else {
			System.out.println("O time " + time2 + " ganhou o jogo de " + golsTime2 + " a " + golsTime1);
		}

		sc.close();
	}

}
