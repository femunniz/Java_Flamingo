package tarefa03;

import java.util.Scanner;

/*
  Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula deconversão é C=(F-32)*(5/9), sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */
public class Tarefa03_Ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Fahrenheit: ");
        float fahrenheit = scan.nextFloat();

        float celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("A temperatura digitada em Fahrenheit, equivale a " + celsius + " em graus Celsius");

        scan.close();
    }
}
