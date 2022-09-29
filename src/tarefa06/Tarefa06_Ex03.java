package tarefa06;

import java.util.Scanner;

// 3. Ler quatro valores referentes a quatro notas escolares de um aluno e imprimir uma mensagem dizendo que o aluno foi aprovado,se o valor da média escolar for maior ou igual a 5. Se o aluno não foi aprovado,indicar uma mensagem informando esta condição.Apresentar junto das mensagens o valor da média do aluno para qualquer condição.

public class Tarefa06_Ex03 {
    public static void main(String []args) {
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

        if (media >= 5) {
            System.out.println("O aluno foi APROVADO com nota média de: " + media);
        } else {
            System.out.println("O aluno foi REPROVADO com nota média de: " + media);
        }

        scan.close();
        
    }
}
