package tarefa08;

//2) Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

public class Tarefa08_Ex02 {

	public static void main(String[] args) {

		int contadora = 0;
		int soma = 0;

		while (contadora <= 100) {
			soma = soma + contadora;
			contadora++;

		}

		System.out.println(soma);

	}

}
