/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN3;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Small
 */
public class Tuan3Bai1 {

    public static void main(String[] args) {
        MyFrame fra = new MyFrame();
        // Thiết lập cửa số với kích thước xác định
        fra.setSize(640, 480);
        // Hiển thị cửa sổ
        fra.setVisible(true);
        // Hiển thị tiêu đề
        fra.setTitle("Nguyen Van Sinh - 10520130");
        // Thiết lập màu nền
        fra.setBackground(Color.GREEN);
        // Thiết lập cửa sổ tối đa
//        fra.maxWindow();
    }
}

class MyFrame extends Frame {

    public MyFrame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                System.exit(0);
            }
        });
    }

    public void maxWindow() {
        this.setExtendedState(MAXIMIZED_BOTH);
    }
}
