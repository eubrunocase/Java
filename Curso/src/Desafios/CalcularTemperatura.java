package Desafios;

import java.util.Scanner;

public class CalcularTemperatura {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temp = entrada.nextDouble();


        double conversao = (temp * 1.8 + 32);


        System.out.println("A temperatura em Farenheits é " + conversao);


        entrada.close();

    }
}
