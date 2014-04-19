/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author Small
 */
public class MyJFrame extends JFrame {

    public JButton btSmiling = new JButton("Smiling");
    public JButton btLoveStruck = new JButton("Love Struck");
    public JButton btWinking = new JButton("Winking");
    public static JLabel lbText = new JLabel("");
    public String pathIconLoveStruck = "C:\\Users\\Small\\Documents\\NetBeansProjects\\Tuan5\\src\\Img\\LoveStruck.gif";
    public String pathIconSmiling = "C:\\Users\\Small\\Documents\\NetBeansProjects\\Tuan5\\src\\Img\\Smiling.gif";
    public String pathIconWinking = "C:\\Users\\Small\\Documents\\NetBeansProjects\\Tuan5\\src\\Img\\Winking.gif";

    public MyJFrame() {

        this.setVisible(true);
        this.setBounds(50, 50, 480, 200);
        this.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addButton() {

        btSmiling.setBounds(20, 20, 140, 40);
        btLoveStruck.setBounds(180, 20, 140, 40);
        btWinking.setBounds(340, 20, 140, 40);
        lbText.setBounds(180, 80, 140, 30);

        btLoveStruck.setBackground(Color.LIGHT_GRAY);
        btSmiling.setBackground(Color.LIGHT_GRAY);
        btWinking.setBackground(Color.LIGHT_GRAY);

        btSmiling.setMnemonic('S');
        btLoveStruck.setMnemonic('L');
        btWinking.setMnemonic('W');

        btLoveStruck.setToolTipText("Button LoveStruck");
        btSmiling.setToolTipText("Button Smiling");
        btWinking.setToolTipText("Button Winking");

        btLoveStruck.setIcon(new ImageIcon(pathIconLoveStruck));
        btSmiling.setIcon(new ImageIcon(pathIconSmiling));
        btWinking.setIcon(new ImageIcon(pathIconWinking));

        lbText.setBorder(new EtchedBorder());
        lbText.setOpaque(true);
        lbText.setBackground(Color.LIGHT_GRAY);

        this.add(btSmiling);
        this.add(btLoveStruck);
        this.add(btWinking);
        this.add(lbText);

        btLoveStruck.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbText.setText(btLoveStruck.getText());
                lbText.setIcon(new ImageIcon(pathIconLoveStruck));
                btLoveStruck.setBackground(Color.YELLOW);
                btLoveStruck.setForeground(Color.RED);
                btSmiling.setBackground(Color.LIGHT_GRAY);
                btSmiling.setForeground(Color.BLACK);
                btWinking.setBackground(Color.LIGHT_GRAY);
                btWinking.setForeground(Color.BLACK);
            }
        });

        btSmiling.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbText.setText(btSmiling.getText());
                lbText.setIcon(new ImageIcon(pathIconSmiling));
                btSmiling.setBackground(Color.YELLOW);
                btSmiling.setForeground(Color.RED);
                btLoveStruck.setBackground(Color.LIGHT_GRAY);
                btLoveStruck.setForeground(Color.BLACK);
                btWinking.setBackground(Color.LIGHT_GRAY);
                btWinking.setForeground(Color.BLACK);
            }
        });

        btWinking.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbText.setText(btWinking.getText());
                lbText.setIcon(new ImageIcon(pathIconWinking));
                btWinking.setBackground(Color.YELLOW);
                btWinking.setForeground(Color.RED);
                btSmiling.setBackground(Color.LIGHT_GRAY);
                btSmiling.setForeground(Color.BLACK);
                btLoveStruck.setBackground(Color.LIGHT_GRAY);
                btLoveStruck.setForeground(Color.BLACK);
            }
        });
    }

    /**
     * Lop xu li su kien
     */
    class processItem implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
        }
    }
}
