package main;

import javax.swing.JPanel;
import java.awt.Graphics;

//essa classe nos permite desenhar na tela
public class GamePanel extends JPanel {

    public GamePanel() {
    }

    public void paintComponent(Graphics g) {
        //serve para "limpar" a tela, fazer um pré work antes que possamos começar a modificar o nosso game panel
        super.paintComponent(g);

        g.fillRect(100, 100, 200, 50);
    }
}
