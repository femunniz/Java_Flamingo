package tarefa04;

import java.util.Scanner;

/*2) Elaborar um programa que calcule e apresente o volume de uma caixa retangular,
por meio da fórmula VOLUME=COMPRIMENTO * LARGURA * ALTURA.*/

public class Tarefa04_Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float comprimento, largura, altura, volume;

        System.out.print("Digite a largura da caixa: ");
        largura = sc.nextFloat();
        System.out.print("Digite o comprimento da caixa: ");
        comprimento = sc.nextFloat();
        System.out.print("Digite a altura da caixa: ");
        altura = sc.nextFloat();

        volume = comprimento * largura * altura;

        System.out.println("O volume da caixa é: " + volume);

        sc.close();
    }
}