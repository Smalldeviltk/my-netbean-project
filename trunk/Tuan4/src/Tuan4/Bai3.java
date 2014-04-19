/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author
 */
public class Bai3 {

    JFrame frMain  = new JFrame("Tính toán");
    JLabel lbNumber1  = new JLabel();
    JLabel lbNumber2  = new JLabel();
    JTextField txtNumber1  = new JTextField();
    JTextField txtNumber2  = new JTextField();
    Choice choCalculator  = new Choice();
    JButton btResult  = new JButton();
    JLabel lbResult  = new JLabel();
    JTextField txtResult  = new JTextField();

    public Bai3() {

        lbNumber1.setText("a =");
        lbNumber2.setText("b =");
        lbResult.setText("Kết quả:");
        txtNumber1.setText("0");
        txtNumber2.setText("0");
        txtResult.setText("0");
        btResult.setText("Thực hiện");
        choCalculator.add("Cộng");
        choCalculator.add("Trừ");
        choCalculator.add("Nhân");
        choCalculator.add("Chia");
        choCalculator.add("UCLN");
        choCalculator.add("BCNN");

        frMain.setBounds(100, 100, 400, 300);
        frMain.setBackground(Color.LIGHT_GRAY);
        frMain.setLayout(null);

        lbNumber1.setBounds(30, 50, 50, 20);    
        lbNumber2.setBounds(30, 70, 50, 20);  
        lbResult.setBounds(30, 140, 50, 20);

        choCalculator.setBounds(300, 70, 60, 20);

        btResult.setBounds(100, 100, 100, 20);
        btResult.setBorderPainted(true);

        txtNumber1.setBounds(100, 50, 150, 20);
        txtNumber2.setBounds(100, 70, 150, 20);
        txtResult.setBounds(100, 140, 150, 20);

        frMain.add(lbNumber1);
        frMain.add(lbNumber2);
        frMain.add(lbResult);
        frMain.add(txtNumber1);
        frMain.add(txtNumber2);
        frMain.add(txtResult);
        frMain.add(btResult);
        frMain.add(choCalculator);

        btResult.addActionListener(new ProcessButton());

        frMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    private int BCNN(int a, int b) {
        return a * b / UCLN(a, b);
    }

    public static void main(String args[]) {
        Bai3 b2 = new Bai3();
        b2.frMain.setVisible(true);
    }

    class ProcessButton implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            int _nNumber1 = Integer.parseInt(txtNumber1.getText().toString().trim());
            int _nNumber2 = Integer.parseInt(txtNumber2.getText().toString().trim());

            switch (choCalculator.getSelectedItem().toString().trim()) {
                case "Cộng":
                    txtResult.setText(String.valueOf(_nNumber1 + _nNumber2));
                    break;
                case "Trừ":
                    txtResult.setText(String.valueOf(_nNumber1 - _nNumber2));
                    break;
                case "Nhân":
                    txtResult.setText(String.valueOf(_nNumber1 * _nNumber2));
                    break;
                case "Chia":
                    if (_nNumber2 == 0) {
                        JOptionPane.showMessageDialog(null, "Không thể chia cho 0.");
                        break;
                    } else {
                        txtResult.setText(String.valueOf((float) _nNumber1 / _nNumber2));
                        break;
                    }
                case "UCLN":
                    txtResult.setText(String.valueOf(UCLN(_nNumber1, _nNumber2)));
                    break;
                case "BCNN":
                    txtResult.setText(String.valueOf(BCNN(_nNumber1, _nNumber2)));
                    break;
            }
        }
    }
}
