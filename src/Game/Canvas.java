package Game;

import sun.java2d.loops.DrawRect;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Blaalid on 30.07.2017.
 */
public class Canvas extends JPanel {
    private static final int RECT_X = 20;
    private static final int RECT_Y = RECT_X;
    private static final int RECT_WIDTH =400;
    private static final int RECT_HEIGHT = RECT_WIDTH;

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(RECT_X, RECT_Y, RECT_WIDTH, RECT_HEIGHT);
    }

    @Override
    public Dimension getPreferredSize(){
        return new Dimension(RECT_WIDTH + 2 * RECT_X, RECT_HEIGHT + 2* RECT_Y);
    }

    public void draw(){
        JFrame frame = new JFrame("DrawRect");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Canvas());
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }

    public static int getRectX() {
        return RECT_X;
    }

    public static int getRectY() {
        return RECT_Y;
    }

    public static int getRectWidth() {
        return RECT_WIDTH;
    }

    public static int getRectHeight() {
        return RECT_HEIGHT;
    }
}
