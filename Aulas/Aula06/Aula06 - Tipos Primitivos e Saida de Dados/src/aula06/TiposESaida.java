package aula06;

import java.util.Scanner;

public class TiposESaida {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine(); // Para ler strings
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat(); // Para ler nrs. reais
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
        
    }
    
}
