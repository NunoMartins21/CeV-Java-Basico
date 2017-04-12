package aula14;

import java.util.Arrays;

public class Vetor4 {
    public static void vetor4() {
        int vet[] = {3, 7, 6, 1, 9, 4, 2};
        int p = Arrays.binarySearch(vet, 1);
        System.out.println("Encontrei o valor na posição " + p);
        for (int valor: vet) {
            System.out.print(valor + " ");
        }
    }
}
