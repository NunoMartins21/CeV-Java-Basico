package aula;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 5;
        numero++; // 5 + 1 = 6
        System.out.println(numero); // Imprime 6
        numero--; // 6 - 1 = 5
        System.out.println(numero); // Imprime 5
        
        System.out.println("----------");
        
        // Pré-incremento
        int valor = 5 + numero++; /* 5 + 5 (sem somar 1 à variável numero) = 10
                                    Só depois é que ele vai somar 1 à variável número, ou seja, numero = 6 */
        System.out.println(valor);
        int valor1 = 5 + ++numero; /* 5 + (6 + 1) = 12 -> aqui ele vai incrementar primeiro antes de somar
                                      Aqui, a variável numero é 6, já que antes ele havia incrementado */
        System.out.println(valor1);
        
        System.out.println("----------");
        
        // Pré-decremento
        numero = 5;
        int valormenos = 5 + numero--; /* 5 + 5 (sem subtrair 1 à variável numero) = 10
                                    Só depois é que ele vai subtrair 1 à variável número, ou seja, numero = 4 */
        System.out.println(valormenos);
        int valormenos1 = 5 + --numero; /* 5 + (4 - 1) = 8 -> aqui ele vai decrementar primeiro antes de somar
                                      Aqui, a variável numero é 4, já que antes ele havia decrementado */
        System.out.println(valormenos1);
    }
}
