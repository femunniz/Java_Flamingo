package tarefa04;

import java.util.Scanner;

/*5) Elaborar um programa que efetue a apresentação do valor da conversão em 
dólar de um valor lido em real. O programa deve solicitar o valor da cotação 
do dólar e também a quantidade de reais disponível com o usuário, para que seja 
apresentado o valor em moeda americana.*/

public class Tarefa04_Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float dolar, real, cotacaoReal;

        System.out.print("Digite o valor da cotação do real: ");
        cotacaoReal = sc.nextFloat();
        System.out.print("Digite a quantidade de reais que você tem: ");
        real = sc.nextFloat();

        dolar = real * cotacaoReal;

        System.out.printf("Você tem (Dolar/es)$: %.2f%n ", dolar);

        sc.close();
    }

}
