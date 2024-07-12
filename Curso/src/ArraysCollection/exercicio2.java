package ArraysCollection;

import java.util.Arrays;

public class exercicio2 {

    public static void main(String[] args) {

        double [] lista = new double [10];

         lista[0] = 5.7;
         lista[1] = 9.1;
         lista[2] = 6.5;


        System.out.println(Arrays.toString(lista));

       double total =+ lista.length;

         for (int i = 0; i < lista.length; i++) {
             System.out.println(lista[i]);
         }

        System.out.println(total / 3);
    }
}
