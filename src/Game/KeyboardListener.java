package Game;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by Blaalid on 01.08.2017.
 */
public class KeyboardListener implements KeyListener {
    private KeyEvent key;


    @Override
    public void keyTyped(KeyEvent e) {
        displayInfo(e, "TYPED!!!!!!!!!!!");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        displayInfo(e, "PRESSED!!!!!!!!!!!");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        displayInfo(e, "RELEASED!!!!!!!!!!!");
    }

    public void displayInfo(KeyEvent e, String keyStatus) {
        int id = e.getID();
        if (id == KeyEvent.KEY_TYPED) {
            char c = e.getKeyChar();
            String keyString = "KEY: " + c;
            System.out.println(keyString);
        } else {
            int keyCode = e.getKeyCode();
            String keyString = "key code = " + keyCode
                    + " ("
                    + KeyEvent.getKeyText(keyCode)
                    + ")";
            System.out.println(keyString);
        }
    }
}
