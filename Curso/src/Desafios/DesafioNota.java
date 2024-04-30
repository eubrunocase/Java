package Desafios;

import java.util.Scanner;

public class DesafioNota {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double parcial1 = 0;
        double parcial2 = 0;



        System.out.println("informe a primeira nota: ");
        parcial1 = entrada.nextDouble();

        System.out.println("Informe a segunda nota: ");
        parcial2 = entrada.nextDouble();

        double media = (parcial1 + parcial2 / 2);

        System.out.println("Sua média é: " + media);

         if (media >= 7) {
             System.out.println("Aprovado! ");
         } else if (media < 7 & media >= 4)
             System.out.println("Recuperação! "); {
        }   if  (media < 4) {
            System.out.println("Reprovado! ");
        }
        
        System.out.println("Fim!");
entrada.close();

    }
}
