package tarefa04;

/*1) Ler quatro números inteiros e apresentar o resultado da adição e multiplicação, 
baseando-se na utilização do conceito da propriedade distributiva. Ou seja, se 
forem lidas as variáveis A, B, C, e D, devem ser somadas e multiplicadas A com B, 
A com C e A com D. Depois B com C, B com D e por fim C com D. Perceba que será 
necessário efetuar seis operações de adição e seis operações de multiplicação e 
apresentar doze resultados de saída.*/

import java.util.Scanner;

public class Tarefa04_Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero01, numero02, numero03, numero04, resultadoAdicao1, resultadoAdicao2,
                resultadoAdicao3, resultadoAdicao4, resultadoAdicao5, resultadoAdicao6,
                resultadoMutiplicacao1, resultadoMutiplicacao2, resultadoMutiplicacao3, resultadoMutiplicacao4,
                resultadoMutiplicacao5, resultadoMutiplicacao6;

        System.out.println("Digite o primeiro número:");
        numero01 = sc.nextFloat();
        System.out.println("Digite o segundo número:");
        numero02 = sc.nextFloat();
        System.out.println("Digite o terceiro número:");
        numero03 = sc.nextFloat();
        System.out.println("Digite o quarto número:");
        numero04 = sc.nextFloat();

        resultadoAdicao1 = numero01 + numero02;
        resultadoAdicao2 = numero01 + numero03;
        resultadoAdicao3 = numero01 + numero04;
        resultadoAdicao4 = numero02 + numero03;
        resultadoAdicao5 = numero02 + numero04;
        resultadoAdicao6 = numero03 + numero04;

        resultadoMutiplicacao1 = numero01 * numero02;
        resultadoMutiplicacao2 = numero01 * numero03;
        resultadoMutiplicacao3 = numero01 * numero04;
        resultadoMutiplicacao4 = numero02 * numero03;
        resultadoMutiplicacao5 = numero02 * numero04;
        resultadoMutiplicacao6 = numero03 * numero04;
        System.out.println();
        System.out.println("Resultado Adição");
        System.out.println(resultadoAdicao1);
        System.out.println(resultadoAdicao2);
        System.out.println(resultadoAdicao3);
        System.out.println(resultadoAdicao4);
        System.out.println(resultadoAdicao5);
        System.out.println(resultadoAdicao6);
        System.out.println();
        System.out.println("Resultado Multiplicação");
        System.out.println(resultadoMutiplicacao1);
        System.out.println(resultadoMutiplicacao2);
        System.out.println(resultadoMutiplicacao3);
        System.out.println(resultadoMutiplicacao4);
        System.out.println(resultadoMutiplicacao5);
        System.out.println(resultadoMutiplicacao6);

        sc.close();

    }
}
