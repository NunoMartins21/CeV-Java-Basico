package exercicio11;

import javax.swing.JOptionPane;

public class Repita {
    
    public static void main(String[] args) {
        int n, q = 0, tot = 0, p = 0, im = 0, acem = 0;
        float m;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número:<br/><em>(valor 0 interrompe)</em></html>"));
            if (n != 0) {
                q += 1;
                if (n % 2 == 0) {
                    p += 1;
                }
                else {
                    im += 1;
                }

                if (n > 100) {
                    acem += 1;
                }
            }
            tot += n;
        } while (n != 0);
        m = tot / q;
        JOptionPane.showMessageDialog(null, "<html>Resultados:<hr/>"
                                            + "<br/>Total de Valores: " + tot
                                            + "<br/>Quantidade de Valores: " + q
                                            + "<br/>Total de Pares: " + p
                                            + "<br/>Total de Ímpares: " + im
                                            + "<br/>Acima de 100: " + acem
                                            + "<br/>Média dos valores: " + String.format("%.2f", m));
    }
    
}
