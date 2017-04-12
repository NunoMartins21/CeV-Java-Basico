package aula15;

public class Metodos {

    public static void main(String[] args) {
        int sm = soma(5, 2);
        System.out.println("O valor da soma é " + sm);
    }
    
    static int soma(int a, int b) {
        int s = a + b;
        return s;
    }
}
