package Desafios;

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a base: ");
        double base = entrada.nextDouble();

        System.out.println("Informe a altura: ");
        double altura = entrada.nextDouble();

        double area = (base * altura / 2);

        System.out.println("A área do triângulo é de: " + area);

         entrada.close();

    }
}
