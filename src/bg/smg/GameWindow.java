package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {

    GameWindow(){
        setTitle("PacMan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(464,535);
        GamePanel gamePanel = new GamePanel();

        add(gamePanel);
        setResizable(false);
        setVisible(true);
    }

}
