/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan4;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Calendar;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Small
 */
public class Bai1 {

    public static javax.swing.JLabel lbTittle;
    public static javax.swing.JLabel lbReader;
    public static javax.swing.JLabel lbTime;

    public static void main(String[] arg) {
        JFrame jframe = new JFrame("Tuan 4 - Bai 1");
        jframe.setLayout(null);
        jframe.setBounds(10, 10, 580, 300);
        jframe.setVisible(true);

        lbTittle = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbReader = new javax.swing.JLabel();

        jframe.add(lbTittle);
        lbTittle.setText("Thời gian hiện tại:");
        lbTittle.setBounds(0, 100, 100, 50);

        jframe.add(lbTime);
        lbTime.setBounds(120, 100, 100, 50);

        jframe.add(lbReader);
        lbReader.setBounds(220, 100, 400, 50);

        getTime();
        Timer t = new Timer(1000, new XulyTimer());
        t.start();

        jframe.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public static void getTime() {
        Calendar now = Calendar.getInstance();
        int h = now.get(Calendar.HOUR_OF_DAY);
        int m = now.get(Calendar.MINUTE);
        int s = now.get(Calendar.SECOND);

        lbTime.setText(h + " : " + m + " : " + s);
        lbReader.setText(readNumbers(h) + " giờ, " + readNumbers(m) + " phút, " + readNumbers(s) + " giây.");
    }

    public static String readNumbers(int n) {
        String result = null;
        if (n < 10) {
            result = readNumber(n);
        } else if (n >= 20) {
            if (n % 10 == 0) {
                result = readNumber(n / 10) + " mươi";
            } else {
                result = readNumber(n / 10) + " mươi " + readNumber(n % 10);
            }
            if (n % 10 == 1) {
                result = readNumber(n / 10) + " mươi mốt";
            }
            if (n % 10 == 5) {
                result = readNumber(n / 10) + " mươi lăm";
            }
        } else {
            if (n == 10) {
                result = "mười";
            } else {
                result = "mười " + readNumber(n % 10);
            }
            if (n == 15) {
                result = "mười lăm";
            }
        }
        return result;
    }

    public static String readNumber(int n) {
        switch (n) {
            case 0:
                return "không";
            case 1:
                return "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return "bốn";
            case 5:
                return "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "";
        }
    }

    public static class XulyTimer implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent evt) {
            getTime();
        }

    }
}
