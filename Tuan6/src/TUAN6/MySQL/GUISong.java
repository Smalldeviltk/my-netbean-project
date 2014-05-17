/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TUAN6.MySQL;

import TUAN6.SQL.DAOClub;
import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Small
 */
public class GUISong extends JFrame{
    
    private DAOSong m_daoSong = new DAOSong();
    
    private JScrollPane jScrollPane1;
    private JLabel lbInfoClub;
    private JTable tbClubs;

    public GUISong() throws SQLException {
        
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
            m_daoSong.getClubs(),
            new String [] {
                "ID BÀI HÁT", "TÊN BÀI HÁT", "LỜI BÀI HÁT", "ĐƯỜNG DẪN", "NGÀY CẬP NHẬT"
            }
        ));
        tbClubs.setBounds(10, 10, 600, 400);
        tbClubs.getTableHeader().setForeground(Color.BLUE);
        jScrollPane1.setViewportView(tbClubs);

        lbInfoClub.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lbInfoClub.setText("THÔNG TIN BÀI HÁT");

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
