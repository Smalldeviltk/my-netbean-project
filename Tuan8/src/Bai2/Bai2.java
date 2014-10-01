/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import javax.swing.JFrame;

/**
 *
 * @author Small
 */
public class Bai2 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Bai 2 - Drawing Object");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCanvas mc = new MyCanvas();
        f.add(mc);
    }

}
