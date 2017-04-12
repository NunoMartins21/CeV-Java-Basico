package aula10;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Quantas pernas tem o bixo? - ");
        int pernas = ler.nextInt();
        System.out.print("Ele é um(a) ");
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}
