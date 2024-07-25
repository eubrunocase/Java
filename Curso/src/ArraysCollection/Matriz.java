package ArraysCollection;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos alunos? ");
        int aluno = sc.nextInt();
        System.out.println("Notas por aluno: ");
        int nota = sc.nextInt();

        double [] [] notasTurma = new double[aluno][nota];

        double total = 0;
        for (int a = 0; a < aluno; a++) {
            for (int n = 0; n < nota; n++) {
                System.out.println("Informe a nota do aluno " + (a+1) + ": ");
                notasTurma[a][n] = sc.nextDouble();
                total += notasTurma[a][n];
            }
        }

        System.out.println("Media da turma: " +  total / aluno);

        for (double [] notas : notasTurma) {
        System.out.println(Arrays.toString(notas));

        }

    }
}
