package Desafios;

import java.util.Scanner;

public class DesafioConversao {
//
//    public static void main(String[] args) {
//
//
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite o seu primeiro salário: ");
//        String salario1 = entrada.nextLine();
//        System.out.println("Digite o seu segundo salário: ");
//        String salario2 = entrada.nextLine();
//        System.out.println("Digite o seu terceiro salário: ");
//        String salario3 = entrada.nextLine();
//
//        double valor = Double.parseDouble(salario1 + salario2 + salario3);
//        double media = valor / 3;
//
//        System.out.println("A média dos seus 3 salários é: " + media);
//
//
//
//
//
//
//    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("\nInforme o primeiro salário: ");
        String valor1 = entrada.nextLine().replace(",", ".");

        System.out.println("\nInforme o segundo salário: ");
        String valor2 = entrada.nextLine().replace(",", ".");

        System.out.println("\nInforme o terceiro salário: ");
        String valor3 = entrada.nextLine().replace(",", ".");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);

        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("A média dos salários é: " + media);


        entrada.close();
    }
}