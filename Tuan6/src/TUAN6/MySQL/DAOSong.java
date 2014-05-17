/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TUAN6.MySQL;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author Small
 */
public class DAOSong {
    
    private final ConnectMySQL m_ConDatabase;
    private ResultSet m_rsClub;
    
    public DAOSong(){
        m_ConDatabase = new ConnectMySQL();
    }
    public Object[][] getClubs() throws SQLException{
        
        String _sGetCountSongs = "SELECT COUNT(*) FROM baihat";
        m_rsClub = m_ConDatabase.getStatement().executeQuery(_sGetCountSongs);
        int _nRow = 0;
        while(m_rsClub.next()){
            _nRow = m_rsClub.getInt(1);
        }
        
        String _sGetSongs = "select * from baihat;";
        m_rsClub = m_ConDatabase.getStatement().executeQuery(_sGetSongs);
        ResultSetMetaData _rsmdMetaData = m_rsClub.getMetaData();
        
        int _nCol = _rsmdMetaData.getColumnCount();
        Object[][] _arrSongs = new Object[_nRow][5];
        int i = 0;
        while(m_rsClub.next()){
            
            _arrSongs[i][0] = m_rsClub.getString("idBH");
            _arrSongs[i][1] = m_rsClub.getString("tenBH");
            _arrSongs[i][2] = m_rsClub.getString("LoiBH");
            _arrSongs[i][3] = m_rsClub.getString("urlBH");
            _arrSongs[i][4] = m_rsClub.getString("NgayCapNhat");
            
            i++;
        }
        return _arrSongs;
    }
    
    public void addSong(){
        
    }
    
    public ResultSet getResultSong(){
        return m_rsClub;
    }
    
    public void closeConnect() throws SQLException{
        m_ConDatabase.disconectDatabase();
        m_rsClub.close();
    }
}
