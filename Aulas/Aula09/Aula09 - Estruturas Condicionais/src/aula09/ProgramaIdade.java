package aula09;

import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Escreva o seu ano de nascimento: ");
        int nasc = ler.nextInt();
        int i = 2017 - nasc;
        System.out.println("Sua idade é " + i);
        if (i >= 18) {
            System.out.println("Maior!");
        }
        else {
            System.out.println("Menor!");
        }
    }
}
