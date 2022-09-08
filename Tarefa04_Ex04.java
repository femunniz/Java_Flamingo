package tarefa04;

/*4) Elaborar um programa que efetue a apresentação do valor da conversão
em real de um valor lido em dólar. O programa deve solicitar o valor da cotação
do dólar e também a quantidade de dólares disponível com o usuário, para que seja 
apresentado o valor em moeda brasileira.*/

import java.util.Scanner;

public class Tarefa04_Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float dolar, real, cotacaoDolar;

        System.out.print("Digite o valor da cotação do dolar: ");
        cotacaoDolar = sc.nextFloat();
        System.out.print("Digite a quantidade de dolares que você tem: ");
        dolar = sc.nextFloat();

        real = dolar * cotacaoDolar;

        System.out.printf("Você tem R$: %.2f%n ", real);

        sc.close();
    }
}
