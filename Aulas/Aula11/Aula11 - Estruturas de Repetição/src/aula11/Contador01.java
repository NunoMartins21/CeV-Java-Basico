package aula11;
public class Contador01 {

    public static void main(String[] args) {
        int cc = 0;
        while (cc < 10) {
            cc++;
            if ((cc == 2) || (cc == 3) || (cc == 4)) {
                continue; // Ir para o início do laço
            }
            if (cc == 7) {
                break; // Sai do laço
            }
            System.out.println("Cambalhota nº " + cc);
        }
    }
    
}
