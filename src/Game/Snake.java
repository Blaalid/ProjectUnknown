package Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Blaalid on 30.07.2017.
 */
public class Snake {
    private int x;
    private int y;
    private int dx;
    private int dy;
    private Image image;

    public Snake(){
        initSnake();
    }

    private void initSnake(){
        ImageIcon i = new ImageIcon("serpent.png");
        image = i.getImage();
        y = 450;
        x = 450;
    }

    public void move(){
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImage(){
        return image;
    }

    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx = -1;
        }else if(key == KeyEvent.VK_RIGHT){
            dx = 1;
        }else if(key == KeyEvent.VK_UP){
            dy = 1;
        }else if(key == KeyEvent.VK_DOWN){
            dy = -1;
        }
    }

    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();

        if(key == KeyEvent.VK_LEFT){
            dx = 0;
        }else if(key == KeyEvent.VK_RIGHT){
            dx = 0;
        }else if(key == KeyEvent.VK_UP){
            dy = 0;
        }else if(key == KeyEvent.VK_DOWN){
            dy = 0;
        }
    }
}
