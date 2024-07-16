
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o numero: ");
        int num = sc.nextInt();

        num += 10;
        System.out.println("Apos += 10: " + num);

        num -= 10;
        System.out.println("Apos -= 10: " + num);

        num *= 10;
        System.out.println("Apos *= 10: " + num);

        num /= 10;
        System.out.println("Apos /= 10: " + num);

        num %= 10;
        System.out.println("Apos %= 10: " + num);
    }
}
