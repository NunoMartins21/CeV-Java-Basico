package aula12;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        int n, s = 0;
        Scanner ler = new Scanner(System.in);
        String resp = null;
        do {
            System.out.print("Digite um número: ");
            n = ler.nextInt();
            s += n;
            System.out.print("Quer continuar? (S/N) - ");
            resp = ler.next();
        } while (resp.equals("S"));
        System.out.println("A soma de todos os valores é " + s);
    }
}
