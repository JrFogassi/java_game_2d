package main;

// aqui a tela do jogo é chamada para ser reproduzida
public class Game {

    private GameWindow gameWindow;
    private GamePanel gamePanel;
    public Game () {
        gamePanel = new GamePanel();
        gameWindow = new GameWindow(gamePanel);
    }
}
