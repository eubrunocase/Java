import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         Func obj = new Func();

       Object rest0 = obj.soma(500, 500 );
        System.out.println(rest0);

        Object rest1 = obj.descricao("Bruno", 21);
         System.out.println(rest1);

        Object rest2 = obj.factory(10);
         System.out.println(rest2);

        Object rest3 = obj.fibonacci(10);
         System.out.println(rest3);

        Object rest4 = obj.primo(7);
        System.out.println(rest4);



    }
}
