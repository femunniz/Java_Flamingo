package tarefa03;

import java.util.Scanner;

/*
      Efetuar o cálculo e a apresentação do valor de uma prestação em atraso, utilizando a fórmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
 */
public class Tarefa03_Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor da sua prestação: ");
        float valor = scan.nextFloat();

        System.out.println("Digite o valor da taxa: ");
        float taxa = scan.nextFloat();

        System.out.println("Digite o tempo que está atrasado: ");
        int tempo = scan.nextInt();

        float prestacao = valor + (valor * taxa / 100) * tempo;
        System.out.println("Sua prestação em atraso agora é R$ " + prestacao);

        scan.close();
    }
}
