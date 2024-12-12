package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Ghost {
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image sprite;

    public Ghost() {
        sprite = new ImageIcon(this.getClass().getResource("/ghost.gif")).getImage();
        x = 100;
        y = 200;
    }

    public void move() {
        x += dx;
        y += dy;
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


}
