package tarefa06;

import java.util.Scanner;

// 4. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado,se o valor da média escolar for maior ou igual a 5. Se o valor da média for menor que 7,solicitar a nota de exame,somar com o valor da média e obter nova média.Se a nova média for maior ou igual a 5,apresentar uma mensagem dizendo que o aluno foi aprovado em exame.Se o aluno não foi aprovado,indicar uma mensagem informando esta condição.Apresentar com as mensagens o valor da média do aluno,para qualquer condição.

public class Tarefa06_Ex04 {
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.println("Digite o valor da primeira nota: ");
        nota1 = scan.nextFloat();

        System.out.println("Digite o valor da segunda nota: ");
        nota2 = scan.nextFloat();

        System.out.println("Digite o valor da terceira nota: ");
        nota3 = scan.nextFloat();

        System.out.println("Digite o valor da quarta nota: ");
        nota4 = scan.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        if (media >= 7) {
            System.out.println("O aluno(a) está aprovado(a) com a média " + media);
        } else {
            System.out.println("Digite a nota do exame do aluno(a) aqui: ");
            float exame = scan.nextFloat();
            media = (media + exame) / 2;
            if (media >= 5) {
                System.out.println("O aluno(a) está aprovado(a) com a média " + media);
            } else {
                System.out.println("O aluno(a) está reprovado(a) com a média " + media);
            }
        }

        scan.close();
        
    }
}
