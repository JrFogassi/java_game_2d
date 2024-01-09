package main;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;

import javax.swing.JPanel;
import java.awt.Graphics;


//essa classe nos permite desenhar na tela
public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 100, yDelta = 100;

    public GamePanel() {

        mouseInputs = new MouseInputs(this);
        addKeyListener(new KeyBoardInputs(this));
        // mouse imputs: mouseListener(): clicked, pressed, released. mouseMotionListener():moved, dragged
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y){
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g) {
        //serve para "limpar" a tela, fazer um pré work antes que possamos começar a modificar o nosso game panel
        super.paintComponent(g);

        g.fillRect(xDelta, yDelta, 200, 50);
    }
}
