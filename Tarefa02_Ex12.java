package tarefa02;

import java.util.Scanner;

/*
    12) Escreva um algoritmo para ler as dimensões de um circulo (raio), calcular e escrever a área do circulo. a=pi*r²
 */
public class Tarefa02_Ex12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o raio: ");
        float raio = scan.nextFloat();

        double area = Math.PI * (raio * raio);
        System.out.println("A área do circulo é igual a: " + area);

        scan.close();
    }
}
