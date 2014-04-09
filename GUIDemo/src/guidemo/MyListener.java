package guidemo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class MyListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("OK")) {
            JOptionPane.showMessageDialog(null, "OK Button");
        }
        if (e.getActionCommand().equalsIgnoreCase("Cancel")) {
            JOptionPane.showMessageDialog(null, "Cancel Button");
        }
                
    }
    
}
