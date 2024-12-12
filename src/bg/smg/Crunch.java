package bg.smg;

import javax.swing.*;
import java.awt.*;

public class Crunch {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image sprite;

    public Crunch() {
        sprite = new ImageIcon(this.getClass().getResource("/crunch-to-eat.png")).getImage();
        this.x = 235;
        this.y = 265;
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
