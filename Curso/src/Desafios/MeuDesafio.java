package Desafios;

import java.util.Scanner;

public class MeuDesafio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

    double nota = 0;
    double quantidaDeNotas = 0;
    double total = 0;

        while (nota != -1) {
            System.out.println("Bem vindo a cálculadora de média do aluno,\n " +
                    "para continuar insira as respectivas notas, ou '-1' para sair:  ");
            nota = entrada.nextDouble();

            if (nota <= 10 && nota >= 0) {
                total += nota;  // total = total + nota
                quantidaDeNotas++;
                System.out.println("Nota válida! ");
            }   else if (nota != -1) {
                System.out.println("Nota inválida! ");

            }
        }

    double media = total / quantidaDeNotas;
        System.out.println("Média: " + media);

        entrada.close();
    }
}
