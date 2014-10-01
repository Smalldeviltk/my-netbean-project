/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN7;

import javax.swing.JOptionPane;

/**
 *
 * @author Small
 */
public class DemoUnicode {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Ch\u00E0o b\u1EA1n!!!", "Ch\u00E0o b\u1EA1n!!!",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Thử nghiệm tiếng Việt", "Tiếng Việt", JOptionPane.INFORMATION_MESSAGE);
    }
}
