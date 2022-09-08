package exemplos;

public class Variaveis {
	static void mostrar() {
		int valor = 45;
		System.out.println("O valor da variável é: " + valor);
	}

	public static void main(String[] args) {

		int data = 50; // Variável de Instância
		System.out.println("O valor da variável data é: " + data);

		exibir();

	}

	static void exibir() {
		int valor = 40;
		System.out.println("O valor da variável é: " + valor);

	}

}
