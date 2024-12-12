package bg.smg;

import javax.swing.*;

public class GameWindow extends JFrame {
    GameWindow(){
        setTitle("PacMan");
        setSize(464,535);
        GamePanel panel = new GamePanel();
        add(panel);
        setResizable(false);
        setVisible(true);
    }
}
