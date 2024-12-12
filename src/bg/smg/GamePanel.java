package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    Image bgimage;
    PacMan pacman;
    Ghost[] ghosts;
    Crunch crunch;
    Timer timer;

    GamePanel(){
        setBounds(0,0,448, 496);
        bgimage = new ImageIcon(this.getClass().getResource("/background.png")).getImage();

        addKeyListener(this);
        setFocusable(true);
        setDoubleBuffered(true);

        pacman = new PacMan();
        ghosts = new Ghost[3];
        ghosts[0] = new Ghost("/ghost_cyan.gif", 180, 230);
        ghosts[1] = new Ghost("/ghost_pink.gif", 210, 230);
        ghosts[2] = new Ghost("/ghost_red.gif", 240, 232);
        crunch = new Crunch();

        timer = new Timer(5, this);
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bgimage,0,0, null);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(pacman.getImage(), pacman.getX(), pacman.getY(), 25, 25, this);
        g2d.drawImage(ghosts[0].getImage(), ghosts[0].getX(), ghosts[0].getY(), 25, 25, this);
        g2d.drawImage(ghosts[1].getImage(), ghosts[1].getX(), ghosts[1].getY(), 25, 25, this);
        g2d.drawImage(ghosts[2].getImage(), ghosts[2].getX(), ghosts[2].getY(), 22, 22, this);
        g2d.drawImage(crunch.getImage(), crunch.getX(), crunch.getY(), 25, 25, this);
    }

    public void actionPerformed(ActionEvent e) {
        pacman.move();
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        pacman.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        pacman.keyReleased(e);
    }
}
