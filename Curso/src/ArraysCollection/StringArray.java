package ArraysCollection;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de itens: ");
        int produtos = sc.nextInt();

        String [] itens = new String[produtos];

        for (int i = 0; i < produtos; i++) {
            System.out.println("Informe o nome do produto " + (i + 1) + ": ");
            itens[i] = sc.next();
        }

    String view = Arrays.toString(itens);

        System.out.println(view);

    }
}