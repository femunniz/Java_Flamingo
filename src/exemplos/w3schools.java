package exemplos;

import java.util.Scanner;

public class w3schools {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String nome = scan.toString();
        System.out.println("Qual seu nome? " + nome);

        int idade = scan.nextInt();
        System.out.println("Digite sua idade: " + idade);

        float peso = scan.nextFloat();
        System.out.println("Digite o seu peso: " + peso);

        // char sexo = scan.nextChar();
        // System.out.println("Digite o seu sexo:  " +sexo);

        // boolean
        scan.close();
    }
}