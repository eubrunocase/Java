
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor booleano:");
        boolean a = sc.nextBoolean();
        System.out.println("Digite o segundo valor booleano:");
        boolean b = sc.nextBoolean();
        System.out.println("Digite o terceiro valor booleano:");
        boolean c = sc.nextBoolean();

        System.out.println("a AND b: " + (a && b));
        System.out.println("a OR b: " + (a || b));
        System.out.println("NOT a: " + (!a));





    }
}
