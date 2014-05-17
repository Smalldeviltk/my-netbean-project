/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.awt.*;

/**
 *
 * @author Small
 */
public class MyCanvas extends Canvas {

    public MyCanvas() {
        setSize(400, 400);
        setBackground(Color.white);;
    }

    public void paint(Graphics g) {

        //Hinh tron
        g.setColor(Color.green);
        g.fillOval(10, 20, 80, 80);

        //Hinh chu nhat
        g.setColor(Color.red);
        g.drawRect(100, 20, 60, 80);
        g.fillRect(100, 20, 60, 80);

        //Hinh chu nhat bo goc
        g.setColor(Color.blue);
        g.drawRoundRect(180, 20, 60, 80, 20, 20);
        g.fillRoundRect(180, 20, 60, 80, 20, 20);

        //Hinh chu nhat 3D
        g.setColor(Color.yellow);
        g.draw3DRect(10, 120, 60, 80, true);
        g.fill3DRect(10, 120, 60, 80, true);

        //Duong thang
        g.setColor(Color.black);
        g.drawLine(100, 120, 160, 200);

        //Ve da giac
//        g.setColor(Color.PINK);
//        int xCoords[] = {10, 40, 60, 30, 10};
//        int yCoords[] = {20, 0, 10, 60, 40};
//        Polygon p = new Polygon(xCoords, yCoords, 5);
//        g.drawPolygon(p);
//        g.fillPolygon(p);
        //Ve cung tron
//        g.setColor(Color.lightGray);
//        g.drawArc(30, 30, 400, 300, 50, 60);
//        g.fillArc(30, 30, 400, 300, 50, 60);
        //Ve chuoi
        g.setColor(Color.pink);
        g.setFont(new Font("FS Maksim", Font.BOLD, 30));
        g.drawString("Hello", 180, 150);

        //Hien thi hinh anh
        Image img = getToolkit().getImage("1.png");
        g.drawImage(img, 10, 220, this);

    }

}
