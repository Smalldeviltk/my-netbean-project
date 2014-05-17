/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Small
 */
public class MyCanvas extends Canvas implements KeyListener {

    Point ObjectLocation = new Point(0, 0);	//Tọa độ của hình vuông
    int ObjectWidth = 100;			//Kích thước của hình vuông

    public MyCanvas() {
        setSize(400, 400);
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        //Vẽ hình vuông		
        g.fillRect(ObjectLocation.x, ObjectLocation.y, ObjectWidth, ObjectWidth);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int t = e.getKeyCode();
        switch (t) {
            case KeyEvent.VK_RIGHT:
                if ((ObjectLocation.x + ObjectWidth) < getSize().height) {
                    ObjectLocation.x++;
                }
                break;
            case KeyEvent.VK_LEFT:
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
