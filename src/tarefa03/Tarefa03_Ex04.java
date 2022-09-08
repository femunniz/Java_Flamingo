package tarefa03;

import java.util.Scanner;

/*
  4) O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.
 */
public class Tarefa03_Ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo de produção de um veículo: ");
        float custoFabrica = scan.nextFloat();

        float custoDistribuidor = custoFabrica * 28 / 100;
        float custoImposto = custoFabrica * 45 / 100;
        float custoConsumidor = custoFabrica + custoDistribuidor + custoImposto;

        System.out.println("O valor final ao consumidor será de R$ " + custoConsumidor);

        scan.close();
    }
}
