package tarefa03;

import java.util.Scanner;

/*
  5) Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é F = (9*C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */
public class Tarefa03_Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        float celsius = scan.nextFloat();

        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura digitada em celsius, equivale a " + fahrenheit + " em graus Fahrenheit");

        scan.close();

    }
}
