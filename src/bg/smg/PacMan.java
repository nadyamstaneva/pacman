package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class PacMan {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image sprite;

    public PacMan() {
        sprite = new ImageIcon(this.getClass().getResource("/pacman.gif")).getImage();
        x = 218;
        y = 265;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return sprite;
    }

    public void move() {
        x += dx;
        y += dy;
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP || key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
