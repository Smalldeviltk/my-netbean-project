/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN6.SQL;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Small
 */
public class GUIClub extends JFrame {

    private DAOClub m_daoClubs = new DAOClub();
    
    private JScrollPane jScrollPane1;
    private JLabel lbInfoClub;
    private JTable tbClubs;

    public GUIClub() throws SQLException {
        
        jScrollPane1 = new JScrollPane();
        tbClubs = new JTable();
        lbInfoClub = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 800, 600);
        this.setLayout(null);
        // Không cho thay đổi kích thước Frame
        this.setResizable(false);

        tbClubs.setFont(new Font("Times New Roman", 0, 12)); // NOI18N
        tbClubs.setModel(new DefaultTableModel(
            m_daoClubs.getClubs(),
            new String [] {
                "TÊN CLB", "TRỤ SỞ", "NHÀ TÀI TRỢ ", "NĂM THÀNH LẬP", "TÊN HLV"
            }
        ));
        tbClubs.setBounds(10, 10, 600, 400);
        tbClubs.getTableHeader().setForeground(Color.BLUE);
        jScrollPane1.setViewportView(tbClubs);

        lbInfoClub.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbInfoClub.setText("THÔNG TIN CÂU LẠC BỘ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbInfoClub)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInfoClub)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

}
