package aula14;

import java.util.Arrays;

public class Vetor3 {
    public static void vetor3() {
        double v[] = {3.5, 2.75, 9, -4.5};
        Arrays.sort(v);
        for (double valor: v) {
            System.out.print(valor + " ");
        }
    }
}
