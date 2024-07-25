package classes;

public class equals {
    public static void main(String[] args) {

        user p1 = new user();
        p1.nome = "bruno";
        p1.email = "bruno@gmail.com";

        user p2 = new user();
        p2.nome = "bruno";
        p2.email = "bruno@gmail.com";


        System.out.println(p1.equals(p2));
    }
}
