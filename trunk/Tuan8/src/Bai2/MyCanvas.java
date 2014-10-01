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
public class MyCanvas extends Canvas implements KeyListener, MouseListener, MouseMotionListener {

    Point ObjectLocation = new Point(0, 0);	//Tọa độ của hình vuông
    int ObjectWidth = 100;			//Kích thước của hình vuông
    boolean ismoving = false;                   //Biến kiểm tra có phải đang di chuyển hình vuông không
    Point prev = new Point(0, 0);               //Tọa độ nhấn chuột

    public MyCanvas() {
        setSize(600, 400);
        setBackground(Color.WHITE);
        addKeyListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.PINK);
        //Vẽ hình vuông		
        g.fillRect(ObjectLocation.x, ObjectLocation.y, ObjectWidth, ObjectWidth);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int t = e.getKeyCode();
        switch (t) {
            case KeyEvent.VK_RIGHT:
                if ((ObjectLocation.x + ObjectWidth) < getSize().height) {
                    ObjectLocation.x += 10;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (ObjectLocation.x != 0) {
                    ObjectLocation.x -= 10;
                }
                break;
            case KeyEvent.VK_DOWN:
                if ((ObjectLocation.y + ObjectWidth) < getSize().height) {
                    ObjectLocation.y += 10;
                }
                break;
            case KeyEvent.VK_UP:
                if (ObjectLocation.y != 0) {
                    ObjectLocation.y -= 10;
                }
                break;
        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point p = e.getPoint();
        Rectangle t = new Rectangle(ObjectLocation.x, ObjectLocation.y, ObjectWidth, ObjectWidth);
        if (t.contains(p) == true) {
            ismoving = true;
            prev = p;
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Point p = e.getPoint();
        if (ismoving == true) {
            int wx = p.x - prev.x;
            int wy = p.y - prev.y;
            ObjectLocation.x += wx;
            ObjectLocation.y += wy;
            prev = p;
            repaint();
            ismoving = false;
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Point p = e.getPoint();
        if (ismoving == true) {
            int wx = p.x - prev.x;
            int wy = p.y - prev.y;
            ObjectLocation.x += wx;
            ObjectLocation.y += wy;
            prev = p;
            repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }

}
