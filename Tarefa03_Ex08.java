package tarefa03;

import java.util.Scanner;

/*
    8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto

    (TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da

    distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade

    média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros  (LITROS_USADOS) utilizada na viagem.
 */
public class Tarefa03_Ex08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem: ");
        double tempoGasto = scan.nextDouble();

        System.out.println("Informe a velocidade média: ");
        double velocidadeMedia = scan.nextDouble();

        double distancia = tempoGasto * velocidadeMedia;
        double litrosUsados = distancia / 12;

        System.out.println("A distância percorrida foi de " + distancia + "km");
        System.out.println("A quantidade de litros usados foi de " + litrosUsados + " litros");

        scan.close();
    }
}
