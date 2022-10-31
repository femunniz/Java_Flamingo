package tarefa08;

/*8) Elaborar um programa que apresente os valores de conversão de 
graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a 
contagem em 10 graus Celsius e finalizando em 100 graus Celsius. 
O programa deve apresentar os valores das duas temperaturas. A fórmula 
de conversão é F = (9*C +160) /5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

public class Tarefa08_Ex08 {

	public static void main(String[] args) {

		float celcius = 10;
		float farenit;

		while (celcius <= 100) {

			farenit = (celcius * 9 / 5) + 32;

			System.out.println(farenit + " graus farenit");

			celcius = celcius + 10;
		}

	}

}
