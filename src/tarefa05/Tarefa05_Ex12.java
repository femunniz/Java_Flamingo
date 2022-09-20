package tarefa05;

// 12)Faça um algoritmo para ler:quantidade atual em estoque,quantidade máxima em estoque e quantidade mínima em estoque de um produto.Calcular e escrever a quantidade média((quantidademédia=quantidade máxima+quantidade mínima) /2). Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem'Não efetuar compra',senão escrever a mensagem'Efetuar compra'.

import java.util.Scanner;

public class Tarefa05_Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade Atual, a quantidade mínima e a quantidade máxima no estoque: ");
        int qntAtual = scan.nextInt();
        int qntMinima = scan.nextInt();
        int qntMaxima = scan.nextInt();

        int qntMedia = (qntMaxima + qntMinima) / 2;

        if (qntAtual >= qntMedia) {
            System.out.println("Seu estoque está cheio, não precisa efetuar compras.");
        } else {
            System.out.println("Seu estoque está acabando, você precisa efetuar as compras");
        }

        scan.close();

    }
}
