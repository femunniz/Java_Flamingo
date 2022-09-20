package tarefa05;

import java.util.Scanner;

// Ler as notas da 1a e 2a avaliações de um aluno.
// Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado
// (considerar que nota igual ou maior que 6 o aluno é aprovado).Escrever também a média calculada.

public class Tarefa05_Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite qual foi a primeira nota: ");
        int n1 = scan.nextInt();

        System.out.println("Digite qual foi a segunda nota: ");
        int n2 = scan.nextInt();

        int mediaAritmetica = (n1 + n2) / 2;

        if (mediaAritmetica >= 6) {
            System.out.println("Parabéns, sua média foi de " + mediaAritmetica + ", você foi aprovado!");
        } else {
            System.out.println("Que pena, sua média foi de " + mediaAritmetica + ", você foi reprovado!");
        }
        scan.close();

    }
}
