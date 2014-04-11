/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

import java.awt.Choice;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Calendar;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Small
 */
public class Bai5 {

    public static JButton button;
    public static Choice c;
    public static javax.swing.JLabel lb1;
    public static javax.swing.JLabel lb2;

    public static void main(String[] arg) {
        init();
    }

    public static void init() {

        JFrame jframe = new JFrame("Tuan 4 - Bai 5");
        jframe.setLayout(null);
        jframe.setBounds(300, 100, 400, 200);
        jframe.setVisible(true);

        button = new JButton("Action");
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();

        c = new Choice();
        c.add("Item 1");
        c.add("Item 2");
        c.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent evt) {
                String sItem = (String) c.getSelectedItem();
                lb2.setText("Selected Item: " + sItem);
            }
        });

        jframe.add(button);
        button.setBounds(150, 20, 80, 20);
        button.addActionListener(new mySwingUI());
        jframe.add(lb1);
        lb1.setBounds(20, 60, 150, 20);

        jframe.add(c);
        c.setBounds(20, 20, 100, 20);
        jframe.add(lb2);
        lb2.setBounds(20, 100, 150, 20);
        lb2.setText("Selected Item: " + c.getSelectedItem().toString());

        jframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public static class mySwingUI extends JFrame implements ActionListener {

        //button  = new JButton("Click Me");
        //button.addActionListener (this); // bản thân lớp mySwingUI đã cài đặt giao tiếp
        //ActionListener nên cũng có chức năng như nó
        public void actionPerformed(ActionEvent a) {
            lb1.setText("Selected Item: " + c.getSelectedItem().toString());
        }
    }

}
