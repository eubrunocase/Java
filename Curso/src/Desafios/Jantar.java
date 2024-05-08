package Desafios;

public class Jantar {


    public static void main(String[] args) {

        Comida c1 = new Comida("Arroz", 0.223);
        Comida c2 = new Comida("Feijao", 0.300);

        Pessoa p1 = new Pessoa("Bruno", 94.0);

       p1.comer(c1);
       p1.comer(c2);
       System.out.println(p1.exibir());

    }
}