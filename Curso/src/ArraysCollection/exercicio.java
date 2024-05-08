package ArraysCollection;

import java.util.Arrays;

public class exercicio {

    public static void main(String[] args) {

        String[] nomes = new String[5];

        System.out.println(Arrays.toString(nomes));


        nomes[0] = "Bruno";
        nomes[1] = "Zaira";
        nomes[2] = "Jhon";
        nomes[3] = "AAAA";


        System.out.println(Arrays.toString(nomes));


    for (int i = 0; i < nomes.length; i++) {
        System.out.println(nomes[i]);
    }


   }
}
