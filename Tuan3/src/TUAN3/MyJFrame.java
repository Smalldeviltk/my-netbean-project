/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN3;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Small
 */
public class MyJFrame extends JFrame {

    JMenuBar jmbMain = new JMenuBar();
    JMenu jmnFile = new JMenu("File");
    JMenuItem jmiExit = new JMenuItem("Exit");
    JMenu jmnChangeColor = new JMenu("Change Color");
    JMenuItem jmiRed = new JMenuItem("Red");
    JMenuItem jmiGreen = new JMenuItem("Green");
    JMenuItem jmiBlue = new JMenuItem("Blue");

    public MyJFrame() {

        //Hien thi cua so
        this.setVisible(true);
        //Thiet lap vi tri va do rong cua cua so
        this.setBounds(50, 50, 640, 480);

        jmiExit.addActionListener(new processItem(this));

        jmiRed.addActionListener(new processItem(this));

        jmiGreen.addActionListener(new processItem(this));

        jmiBlue.addActionListener(new processItem(this));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addMenuBar() {

        jmnFile.add(jmiExit);
        jmnChangeColor.add(jmiRed);
        jmnChangeColor.add(jmiGreen);
        jmnChangeColor.add(jmiBlue);
        jmbMain.add(jmnFile);
        jmbMain.add(jmnChangeColor);
        this.setJMenuBar(jmbMain);

    }

    // Thay doi mau nen
    class processItem implements ActionListener {

        Component cmp;

        public processItem(Component c) {
            cmp = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            Object object = e.getSource();
            if (object == jmiRed) {
                ((JFrame) cmp).getContentPane().setBackground(Color.RED);
            } else if (object == jmiGreen) {
                ((JFrame) cmp).getContentPane().setBackground(Color.GREEN);
            } else if (object == jmiBlue) {
                ((JFrame) cmp).getContentPane().setBackground(Color.BLUE);
            } else if (object == jmiExit) {
                System.exit(0);
            }
        }
    }
}
