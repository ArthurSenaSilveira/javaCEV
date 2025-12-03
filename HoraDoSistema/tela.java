package HoraDoSistema;

import java.awt.Dimension;
import java.awt.Toolkit;

public class tela {
    public  static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int width = screenSize.width;

        int height = screenSize.height;

        System.out.println("Resolução da tela: " + width + " * " + height);
    }
}
