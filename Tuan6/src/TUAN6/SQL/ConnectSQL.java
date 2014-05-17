/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TUAN6.SQL;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Small
 */

public class ConnectSQL{
    
    private Connection m_conManagerSoccer;
    private Statement m_statManagerSocce;
    
    public ConnectSQL(){
        
        try{
            
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            m_conManagerSoccer = DriverManager.getConnection("jdbc:odbc:odbcManagerSoccer");
            m_statManagerSocce = m_conManagerSoccer.createStatement();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
            
        }
    }
    
    public void disconectDatabase() throws SQLException{
        m_conManagerSoccer.close();
        m_statManagerSocce.close();
    }
    
    public Connection getConnection(){
        return m_conManagerSoccer;
    }
    
    public Statement getStatement(){
        return m_statManagerSocce;
    }
}
