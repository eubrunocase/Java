package Controle;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a media: ");
        double media = entrada.nextDouble();

        if (media <= 10 && media >= 7.0) {
            System.out.println("APROVADO! ");
            System.out.println("PARABENS! ");
        }

        if (media < 7 && media >= 4.5) {
            System.out.println("RECUPERAÇÃO ");
        }

        boolean criterioReprovacaoAtingindo = media < 4.5 && media >0;
        if (criterioReprovacaoAtingindo) {
            System.out.println("REPROVADO");


        }





        entrada.close();
    }

}
