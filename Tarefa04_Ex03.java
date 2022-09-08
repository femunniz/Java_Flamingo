package tarefa04;

/*3) Ler dois inteiros (variáveis A e B) e imprimir o resultado do quadrado da 
diferença do primeiro valor pelo segundo.*/

import java.util.Scanner;

public class Tarefa04_Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, diferenca, quadrado;

        System.out.print("Digite o primero valor: ");
        a = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        b = sc.nextInt();

        diferenca = a - b;
        quadrado = diferenca * diferenca;

        System.out.println("O quadrado da diferença é: " + quadrado);

        sc.close();
    }
}
