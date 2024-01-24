package Desafios;

import java.util.Scanner;

public class CalculadoraIMC {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu peso em kg: ");
        double peso = entrada.nextDouble();
        System.out.println("Informe a sua altura: ");
        double altura = entrada.nextDouble();

        double imc = (peso / altura);

        System.out.println("Seu IMC é de " + imc);

        entrada.close();



    }
}
