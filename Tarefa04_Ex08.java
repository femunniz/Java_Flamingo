package tarefa04;

import java.util.Scanner;

/*8) Elaborar um programa de computador que efetue a leitura de quatro valores 
inteiros (variáveis A, B, C e D). Ao final o programa deve apresentar o resultado 
do produto (variável P) do primeiro com o terceiro valor, e o resultado do produto 
(variável P) do primeiro com o terceiro valor, e o resultado da soma (variável S) 
do segundo com o quarto valor.*/

public class Tarefa04_Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variaveis

        int a, b, c, d, p, s;

        // variaveis

        System.out.println("Digite o primeiro valor");
        a = sc.nextInt();
        System.out.println("Digite o segundo valor");
        b = sc.nextInt();
        System.out.println("Digite o terceiro valor");
        c = sc.nextInt();
        System.out.println("Digite o quarto valor");
        d = sc.nextInt();

        p = a * c;
        s = b + d;

        System.out.println("Resultado do produto " + p + " Resultado da soma " + s);

        sc.close();
    }
}
