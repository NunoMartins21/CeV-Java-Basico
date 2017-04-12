package aula;
public class ClasseMath {
    public static void main(String[] args) {
        // Pi
        System.out.println(Math.PI);
        
        // Exponenciação
        System.out.println(Math.pow(5, 2)); // 5 ^ 2 = 25
        
        // Raíz Quadrada
        System.out.println(Math.sqrt(25)); // sqrt(25) = 5
        
        // Raíz Cúbica
        System.out.println(Math.cbrt(27)); // cbrt(27) = 3
        
        // Valor Absoluto
        System.out.println(Math.abs(-10)); // -10
        
        // Arredondamento para cima
        System.out.println(Math.ceil(4.2)); // 5
        
        // Arredondamento para baixo
        System.out.println(Math.floor(3.9)); // 3
        
        // Arredondamento normal
        System.out.println(Math.round(5.6)); // 6
        
        // Número Aleatório (entre 0 e 1)
        double rand = Math.random();
        System.out.println(rand);
        
        // Número Aleatório (entre n1 e n2)
        int n1 = 0;
        int n2 = 10;
        int randn = (int) (n1 + rand * (n2 - n1));
        System.out.println(randn);
    }
}
