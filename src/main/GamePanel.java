package main;

import Inputs.KeyBoardInputs;

import javax.swing.JPanel;
import java.awt.Graphics;

public class GamePanel extends JPanel {

    public GamePanel() {
        addKeyListener(new KeyBoardInputs() {

        });
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillRect(100 , 100 , 200 , 50);
    }
}
