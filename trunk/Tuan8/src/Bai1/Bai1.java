/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Small
 */
public class Bai1 {

    public static void main(String arg[]) {

        JFrame f = new JFrame("Bai 1 - Drawing Object");
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCanvas mc = new MyCanvas();
        f.add(mc);

    }

}
