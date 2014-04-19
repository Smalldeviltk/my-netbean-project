/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Small
 */
public class Bai2 {

    private MyJFrame frm = new MyJFrame();
    public static JPopupMenu pMenu = new JPopupMenu();
    public static String pathIconLoveStruck = "C:\\Users\\Small\\Documents\\NetBeansProjects\\Tuan5\\src\\Img\\LoveStruck.gif";
    public static String pathIconSmiling = "C:\\Users\\Small\\Documents\\NetBeansProjects\\Tuan5\\src\\Img\\Smiling.gif";
    public static String pathIconWinking = "C:\\Users\\Small\\Documents\\NetBeansProjects\\Tuan5\\src\\Img\\Winking.gif";

    public static void main(String[] arg) {
        MyJFrame fra = new MyJFrame();
        fra.setSize(520, 160);
        fra.setVisible(true);
        fra.setTitle("Tuan 5 - Bai 2");
        fra.addButton();
        
        init();

        fra.addMouseListener(new MouseAdapter() {
            public void mouseReleased(MouseEvent evt) {
//                if(evt.isPopupTrigger()){
//                    pMenu.show(evt.getComponent(), evt.getX(), evt.getY());
//                }
                pMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        });
    }

    public static void init() {
        JMenuItem mi1 = new JMenuItem("LoveStruck", new ImageIcon(pathIconLoveStruck));
        JMenuItem mi2 = new JMenuItem("Smiling", new ImageIcon(pathIconSmiling));
        JMenuItem mi3 = new JMenuItem("Winking", new ImageIcon(pathIconWinking));

        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MyJFrame.lbText.setText("Button LoveStruck");
                MyJFrame.lbText.setIcon(new ImageIcon(pathIconLoveStruck));
            }
        });

        mi2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MyJFrame.lbText.setText("Button Smiling");
                MyJFrame.lbText.setIcon(new ImageIcon(pathIconSmiling));
            }
        });

        mi1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                MyJFrame.lbText.setText("Button Winking");
                MyJFrame.lbText.setIcon(new ImageIcon(pathIconWinking));
            }
        });

        pMenu.add(mi1);
        pMenu.add(mi2);
        pMenu.add(mi3);
    }

}
