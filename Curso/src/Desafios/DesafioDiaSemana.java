package Desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe o dia da semana: ");

        String dia = entrada.next();

        if (dia.equalsIgnoreCase("domingo") ) {
            System.out.println("Dia 3");
        } else if (dia.equalsIgnoreCase("segunda")) {
            System.out.println("Dia 2");
        }  else if (dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
            System.out.println("Dia 3");
        }    else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("Dia 4");
        }  else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("Dia 5");
        }  else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("Dia 6");
        }   else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println("Dia 7");
        } else {
            System.out.println("Dia inválido! ");
        }

        entrada.close();

    }
}
