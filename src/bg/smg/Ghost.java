package bg.smg;

import javax.swing.*;
import java.awt.*;

public class Ghost {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image sprite;

    public Ghost(String ghostImg, int x, int y) {
        sprite = new ImageIcon(this.getClass().getResource(ghostImg)).getImage();
        this.x = x;
        this.y = y;
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
