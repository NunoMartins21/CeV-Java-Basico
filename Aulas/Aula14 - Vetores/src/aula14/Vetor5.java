package aula14;

import java.util.Arrays;

public class Vetor5 {
    public static void vetor5() {
        int num[] = new int[20];
        Arrays.fill(num, 0);
        System.out.println("O meu vetor tem " + num.length + " posições");
        for (int v: num) {
            System.out.print(v + " ");
        }
    }
}
