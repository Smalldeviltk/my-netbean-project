
package guidemo;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GUIDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame demo");
        JButton buttonOK = new JButton("OK");
        JButton buttonCancel = new JButton("Cancel");
        MyListener myListener = new MyListener();
        buttonOK.addActionListener(myListener);
        buttonCancel.addActionListener(myListener);
                
        //frame.add(button);
        frame.setBounds(50, 50, 600, 200);
        frame.getContentPane().setBackground(Color.yellow);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.getContentPane().add(buttonOK);
        frame.getContentPane().add(buttonCancel);
        
        frame.setVisible(true);
    }
    
}
