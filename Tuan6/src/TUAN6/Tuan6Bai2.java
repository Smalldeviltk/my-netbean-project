/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUAN6;

import TUAN6.MySQL.GUISong;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Small
 */
public class Tuan6Bai2 {

    public static void main(String[] args) {
        try {
            GUISong song = new GUISong();
            song.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Tuan6Bai2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
