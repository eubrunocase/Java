package outros;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
//        System.out.print("Bom");
//        System.out.print(" Dia!");
//
//        System.out.println("Bom");
//        System.out.println("dia!");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("Nome = " + nome + " " + sobrenome);
    }
}
