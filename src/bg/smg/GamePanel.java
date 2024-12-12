package bg.smg;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
    private Image bgimage;
    PacMan pacman;
    Ghost ghost;
    Timer timer;

    public GamePanel() {
        setBounds(0,0,448,496);
        bgimage = new ImageIcon(this.getClass().getResource("/background.png")).getImage();

        addKeyListener(this);
        setFocusable(true);
        setDoubleBuffered(true);

        pacman = new PacMan();
        ghost = new Ghost();

        timer = new Timer(5, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(bgimage, 0, 0, null);
        Graphics2D g2d = (Graphics2D)g;
        g2d.drawImage(pacman.getImage(), pacman.getX(), pacman.getY(), 20,20,this);
        g2d.drawImage(ghost.getImage(), ghost.getX(), ghost.getY(), 60,40,this);

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }


    public void actionPerformed(ActionEvent e) {
        pacman.move();
        ghost.move();
        repaint();
    }

    public void keyReleased(KeyEvent e) {
        pacman.keyReleased(e);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        pacman.keyPressed(e);
    }

}