package Desafios;

public class DesafioLogicos {
    public static void main(String[] args) {
        // Trabalho na terça (V OU F)
        // Trabalho na quinta (V OU F)

         boolean trabalho1 = false;
         boolean trabalho2 = false;

         boolean comprouTV50 = trabalho1 && trabalho2;
         boolean comprouTV32 = trabalho1 ^ trabalho2;
         boolean comprouSorvete = trabalho1 || trabalho2;

        System.out.println("Comprou TV de 50\"?" + comprouTV50);
        System.out.println("Comprou TV de 32\"?" + comprouTV32);
        System.out.println("Comprou TV de 32\"Sorvete?" + comprouSorvete);

        //operador unário!
        System.out.println("Mais saudável?" + !comprouSorvete);
    }
}
