package tarefa08;

/*5) Apresentar os resultados das potências de 3, variando 
do expoente 0 até o expoente 15. Deve ser considerado 
que qualquer número elevado a zero é 1, e elevado a 1 
é ele próprio. Observe que neste exercício não pode ser 
utilizado o operador de exponenciação do portuguol (^).*/

public class Tarefa08_Ex05 {

	public static void main(String[] args) {

		int contadora = 0;
		int potencia = 3;

		while (contadora <= 15) {

			System.out.println(Math.pow(potencia, contadora));

			contadora++;
		}

	}

}
