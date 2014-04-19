/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tuan5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalIconFactory;

/**
 *
 * @author Small
 */
public class Bai3 extends JFrame {

    private static Bai3 frm = new Bai3();
    private JTabbedPane tabbedPane;
    private JPanel helloWorld;
    private JPanel feel;
    private JLabel label2 = new JLabel();

    public Bai3() {

        init();
    }

    private void init() {

        JMenuBar menubar = new JMenuBar();
        //ImageIcon icon = new ImageIcon("exit.png");

        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem eMenuItem = new JMenuItem("Exit");
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });

        JMenu options = new JMenu("L&F");
        options.setMnemonic(KeyEvent.VK_L);
        ButtonGroup group = new ButtonGroup();

        //Windows Style Look and Feel
        JMenuItem miWin = options.add(new JRadioButtonMenuItem("Windows Style Look and Feel"));
        miWin.setMnemonic(KeyEvent.VK_W);
        miWin.setActionCommand("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        miWin.setSelected(UIManager.getLookAndFeel().getName().equals("Windows"));
        group.add(miWin);
        miWin.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JRadioButtonMenuItem button = (JRadioButtonMenuItem) e.getSource();
                try {
                    if (button.isSelected()) {
                        UIManager.setLookAndFeel(button.getActionCommand());
                        button.setEnabled(true);
                        SwingUtilities.updateComponentTreeUI(frm);
                        label2.setText("Windows Style Look and Feel");
                    }
                } catch (UnsupportedLookAndFeelException e1) {
                    button.setEnabled(false);
                    System.err.println("Unsupported LookAndFeel: " + button.getText());
                } catch (Exception e2) {
                    System.err.println("Couldn't load Look and feel" + button.getText());
                }

            }
        });

        //Motif Look and Feel
        JMenuItem miMotif = options.add(new JRadioButtonMenuItem("Motif Look and Feel"));
        miMotif.setMnemonic(KeyEvent.VK_M);
        miMotif.setActionCommand("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
        miMotif.setSelected(UIManager.getLookAndFeel().getName().equals("Motif"));
        group.add(miMotif);
        miMotif.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JRadioButtonMenuItem button = (JRadioButtonMenuItem) e.getSource();
                try {
                    if (button.isSelected()) {
                        UIManager.setLookAndFeel(button.getActionCommand());
                        button.setEnabled(true);
                        SwingUtilities.updateComponentTreeUI(frm);
                        label2.setText("Motif Look and Feel");
                    }
                } catch (UnsupportedLookAndFeelException e1) {
                    button.setEnabled(false);
                    System.err.println("Unsupported LookAndFeel: " + button.getText());
                } catch (Exception e2) {
                    System.err.println("Couldn't load Look and feel" + button.getText());
                }

            }
        });

        //Metal Look and Feel
        JMenuItem miMetal = options.add(new JRadioButtonMenuItem("Metal Look and Feel"));
        miMetal.setMnemonic(KeyEvent.VK_A);
        miMetal.setActionCommand("javax.swing.plaf.metal.MetalLookAndFeel");
        miMetal.setSelected(UIManager.getLookAndFeel().getName().equals("Metal"));
        group.add(miMetal);
        miMetal.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JRadioButtonMenuItem button = (JRadioButtonMenuItem) e.getSource();
                try {
                    if (button.isSelected()) {
                        UIManager.setLookAndFeel(button.getActionCommand());
                        button.setEnabled(true);
                        SwingUtilities.updateComponentTreeUI(frm);
                        label2.setText("Metal Look and Feel");
                    }
                } catch (UnsupportedLookAndFeelException e1) {
                    button.setEnabled(false);
                    System.err.println("Unsupported LookAndFeel: " + button.getText());
                } catch (Exception e2) {
                    System.err.println("Couldn't load Look and feel" + button.getText());
                }

            }
        });

        //add menu
        file.add(eMenuItem);

        menubar.add(file);
        menubar.add(options);

        setJMenuBar(menubar);

        //tabbedPane
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        getContentPane().add(panel);

        createPage1();
        createPage2();

        tabbedPane = new JTabbedPane();
        tabbedPane.setTabPlacement(JTabbedPane.BOTTOM);
        tabbedPane.addTab("Hello World", helloWorld);
        tabbedPane.addTab("Feel", feel);
        panel.add(tabbedPane, BorderLayout.CENTER);

        setTitle("Tuan 5 - Bai 3");
        setSize(500, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createPage1() {
        helloWorld = new JPanel();
        helloWorld.setLayout(null);

        JLabel label1 = new JLabel("Hello World");
        label1.setBounds(10, 15, 150, 20);
        helloWorld.add(label1);
    }

    public void createPage2() {
        feel = new JPanel();
        feel.setLayout(new BorderLayout());

        label2 = new JLabel("Metal Look and Feel");
        label2.setBounds(10, 15, 150, 20);
        feel.add(label2);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                frm.setVisible(true);
            }
        });
    }
}
