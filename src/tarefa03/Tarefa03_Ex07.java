package tarefa03;

import java.util.Scanner;

/*
  7) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: Volume = π*Raio2*Altura
 */
public class Tarefa03_Ex07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio da lata de óleo: ");
        float raio = scan.nextFloat();
        System.out.println("Digite a altura da lata de óleo: ");
        float altura = scan.nextFloat();
        double volume = Math.PI * (raio * raio) * altura;
        System.out.println("O volume da lata de óleo é igual a: " + volume);

        scan.close();
    }
}
