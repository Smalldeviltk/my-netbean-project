/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN3;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Small
 */
public class Tuan3Bai4 {

    public static void main(String[] args) {
        MyTime time = new MyTime();
    }
}

class MyTime extends JFrame {

    JFrame jframe = new JFrame("Nguyen Van Chien - 10520112");

    JLabel jlabelTime = new JLabel("Nguyen Van Chien");

    Date now = new Date();

    public MyTime() {

        jlabelTime.setBounds(0, 0, 100, 50);
        jframe.setBounds(10, 10, 640, 480);
        jframe.setVisible(true);
        jframe.add(jlabelTime);

        int h = now.getHours();
        int m = now.getMinutes();
        int s = now.getSeconds();

        jlabelTime.setText(h + ":" + m + ":" + s);

        now.clone();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
