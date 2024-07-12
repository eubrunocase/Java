package ArraysCollection;

public class Foreach {
    public static void main(String[] args) {


        Double [] notas = {5.5, 10.0, 7.7, 8.8};


        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        for (Double vr : notas) {
            System.out.println(vr);
        }

    }
}
