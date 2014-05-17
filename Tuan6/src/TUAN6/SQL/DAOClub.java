/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TUAN6.SQL;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Small
 */
public class DAOClub {
    
    private final ConnectSQL m_ConDatabase;
    private ResultSet m_rsClub;
    
    public DAOClub(){
        m_ConDatabase = new ConnectSQL();
    }
    public Object[][] getClubs() throws SQLException{
        
        String _sGetCountClubs = "SELECT COUNT(*) FROM [MANAGER_SOCCER].[dbo].[CLB]";
        m_rsClub = m_ConDatabase.getStatement().executeQuery(_sGetCountClubs);
        int _nRow = 0;
        while(m_rsClub.next()){
            _nRow = m_rsClub.getInt(1);
        }
        
        String _sGetClubs = "SELECT TOP 1000 [STT]"
                    + ",[MSCLB], "
                    + "[TENCLB],"
                    + "[TRUSO],"
                    + "[DT],"
                    + "[MSSVD],"
                    + "[NHATAITRO],"
                    + "[NAMTHANHLAP],"
                    + "[MAUAO],"
                    + "[WEBSITE],"
                    + "[DIACHI],"
                    + "[TENHLV],"
                    + "[GHICHU] "
                    + "FROM CLB";
        m_rsClub = m_ConDatabase.getStatement().executeQuery(_sGetClubs);
        ResultSetMetaData _rsmdMetaData = m_rsClub.getMetaData();
        
        int _nCol = _rsmdMetaData.getColumnCount();
        Object[][] _arrClubs = new Object[_nRow][5];
        int i = 0;
        while(m_rsClub.next()){
            
            _arrClubs[i][0] = m_rsClub.getString("TENCLB");
            _arrClubs[i][1] = m_rsClub.getString("TRUSO");
            _arrClubs[i][2] = m_rsClub.getString("NHATAITRO");
            _arrClubs[i][3] = m_rsClub.getInt("NAMTHANHLAP");
            _arrClubs[i][4] = m_rsClub.getString("TENHLV");
            
            i++;
        }
        return _arrClubs;
    }
    
    public void addClub(){
        
    }
    
    public ResultSet getResultClub(){
        return m_rsClub;
    }
    
    public void closeConnect() throws SQLException{
        m_ConDatabase.disconectDatabase();
        m_rsClub.close();
    }
}
