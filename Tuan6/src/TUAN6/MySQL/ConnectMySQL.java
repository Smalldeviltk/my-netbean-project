/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN6.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Small
 */
public class ConnectMySQL {

    private Connection m_conManagerSoccer;
    private Statement m_statManagerSocce;

    public ConnectMySQL() {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            m_conManagerSoccer = DriverManager.getConnection("jdbc:mysql://localhost:3306/nhaconline", "root", "");
            m_statManagerSocce = m_conManagerSoccer.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {

        }
    }

    public void disconectDatabase() throws SQLException {
        m_conManagerSoccer.close();
        m_statManagerSocce.close();
    }

    public Connection getConnection() {
        return m_conManagerSoccer;
    }

    public Statement getStatement() {
        return m_statManagerSocce;
    }
}
