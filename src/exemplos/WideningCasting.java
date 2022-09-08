package exemplos;

public class WideningCasting {

	public static void main(String[] args) {
		int valor = 20;
		float valor1 = valor;
		double valor2 = valor1;
		double resultado = valor2 + 1.234567890;
		System.out.println("O valor inteiro é: " + valor);
		System.out.println("O valor flutuante é: " + valor1);
		System.out.println("O valor flutuante double é: " + valor2);
		System.out.println("O valor flutuante double é: " + resultado);

	}

}
