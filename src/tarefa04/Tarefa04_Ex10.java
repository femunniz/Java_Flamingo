package tarefa04;

import java.util.Scanner;

/*candidatos 
a b c
nulos
brancos
votos validos
(entrada de dados)criar programa que lé a quantidade de votos 
validos para cada candidato
ler votos brancos e nulos
(saida de dados) numero total de eleitores
percentual de votos validos em relação ao numero de eleitores 
percentual de votos validos de cada candidato em relação ao total de eleitores
percentual de votos brancos e nulos em relação a quantidade de eleitores  */

public class Tarefa04_Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variavel
        int candidato1, candidato2, candidato3, votosBrancos, votosTotais, votosNulos, votosValidos;
        float percentualCandidato1, percentualCandidato2, percentualCandidato3, percentualBrancos, percentualNulos,
                percentualValidos;
        // variavel

        // Candidatos
        System.out.print("Digite a quantidade de votos que o candidato 1 teve: ");
        candidato1 = sc.nextInt();
        System.out.print("Digite a quantidade de votos que o candidato 2 teve: ");
        candidato2 = sc.nextInt();
        System.out.print("Digite a quantidade de votos que o candidato 3 teve: ");
        candidato3 = sc.nextInt();

        // votos Brancos e nulos
        System.out.print("Digite a quantidade de votos brancos: ");
        votosBrancos = sc.nextInt();
        System.out.print("Digite a quantidade de votos nulos: ");
        votosNulos = sc.nextInt();

        votosValidos = candidato1 + candidato2 + candidato3;
        votosTotais = candidato1 + candidato2 + candidato3 + votosBrancos + votosNulos;

        percentualValidos = (float) votosValidos * 100 / votosTotais;
        percentualCandidato1 = (float) candidato1 * 100 / votosTotais;
        percentualCandidato2 = (float) candidato2 * 100 / votosTotais;
        percentualCandidato3 = (float) candidato3 * 100 / votosTotais;
        percentualBrancos = (float) votosBrancos * 100 / votosTotais;
        percentualNulos = (float) votosNulos * 100 / votosTotais;

        System.out.println();
        System.out.println("---Resumo das eleições---");
        System.out.println();
        System.out.println("Total de votos: " + votosTotais);
        System.out.println("Votos Válidos: " + votosValidos);
        System.out.println("Votos Brancos: " + votosBrancos);
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.printf("Percentual de votos do candidato 1 em relação ao numero de eleitores: %.2f%n ",
                percentualCandidato1);
        System.out.printf("Percentual de votos do candidato 2 em relação ao numero de eleitores: %.2f%n ",
                percentualCandidato2);
        System.out.printf("Percentual de votos do candidato 3 em relação ao numero de eleitores: %.2f%n ",
                percentualCandidato3);
        System.out.printf("Percentual de votos Validos em relação ao número de eleitores: %.2f%n ", percentualValidos);
        System.out.printf("Percentual de votos brancos em relação ao número de eleitores: %.2f%n ", percentualBrancos);
        System.out.printf("Percentual de votos nulos em relação ao número de eleitores: %.2f%n ", percentualNulos);

        sc.close();

    }
}
