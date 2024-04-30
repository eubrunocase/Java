package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        // if (...) sentença; ou {}
        // while (...) sentença; ou {}
        // for (...; ...; ...) sentença; ou {}

        // do sentença; ou {} while (...);

        Scanner entrada = new Scanner(System.in);

        String texto = "";

do {
    System.out.println("Voce precisa falar as palavras magicas...");
    System.out.println("Quer sair? ");
    texto = entrada.nextLine();
} while (!texto.equalsIgnoreCase("por favor"));


        System.out.println("Obrigado! ");
    entrada.close();

    }
}
