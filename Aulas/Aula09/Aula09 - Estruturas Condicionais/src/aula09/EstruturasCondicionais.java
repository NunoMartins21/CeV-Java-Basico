package aula09;

import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        // Condição Simples
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a sua primeira nota: ");
        float n1 = entrada.nextFloat();
        System.out.print("Digite a sua segunda nota: ");
        float n2 = entrada.nextFloat();
        float m = (n1 + n2) / 2;
        System.out.println("Sua média foi " + m);
        if (m > 9) {
            System.out.println("Parabéns, pequeno gafanhoto!");
        }
    }
    
}
