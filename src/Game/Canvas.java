package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Canvas extends JPanel implements ActionListener {
    private Snake snake;
    private Timer timer;
    private final int DELAY = 10;

    public Canvas(){
        initCanvas();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
        Toolkit.getDefaultToolkit().sync();
    }

    public void draw(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(snake.getImage(), snake.getX(), snake.getY(),this);
    }

    public void initCanvas(){
        addKeyListener(new KeyBoardAdapter());
        setFocusable(true);
        setBackground(Color.black);

        snake = new Snake();

        timer = new Timer(DELAY, this);
        timer.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        snake.move();
        repaint();
    }

    private class KeyBoardAdapter extends KeyAdapter{
        @Override
        public void keyReleased(KeyEvent e){
            snake.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e){
            snake.keyPressed(e);
        }
    }
}
