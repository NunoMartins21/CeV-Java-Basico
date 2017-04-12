package exercicio04;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("As dimensões da sua tela são " + screenSize.width + " X " + screenSize.height);
    }  
}
