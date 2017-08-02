package Game;

import javax.swing.*;

public class Game extends JFrame {

 public Game(){
     initUI();
 }

    private void initUI() {
     add(new Canvas());
     setSize(900,800);
     setResizable(false);
     setLocationRelativeTo(null);
     setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
