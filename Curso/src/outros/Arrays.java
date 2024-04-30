package outros;

public class Arrays {
    public static void main(String[] args) {

        String[]nomes = new String[5];

        nomes[0] = "Bruno";
        nomes[1] = "Zaira";
        nomes[2] = "Guilherme";
        nomes[3] = "Matheus";
        nomes[4] = "Duda";


        System.out.println("Nomes da tropinha");
        for (int i =0; i < nomes.length; i++) {

            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }

    }
}

