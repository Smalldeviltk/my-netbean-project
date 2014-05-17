package com.qlydb.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TeamDao {

    public static Connection getconnection() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/soccer";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        }
        return conn;
    }

    public static List<Team> getListTeam() {
        List<Team> ds = new ArrayList<Team>();
        Connection con = getconnection();
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM team");
            while (rs.next()) {
                Team a = new Team();
                a.setIdteam(rs.getInt("IDTeam"));
                a.setNameTeam(rs.getString("NameTeam"));
                a.setDiem(rs.getInt("diem"));
                a.setHieuso(rs.getInt("hieuso"));
                ds.add(a);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ds;
    }

    public void delete() {
        Connection con = getconnection();
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM result");
            ps.executeUpdate();
            ps = con.prepareStatement("DELETE FROM team");
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void add(Team team) {
        Connection con = getconnection();
        ResultSet rs;
        try {
            Statement stsm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = stsm.executeQuery("SELECT * FROM team");
            rs.moveToInsertRow();
            rs.updateString("NameTeam", team.getNameTeam());
            rs.updateInt("diem", team.getDiem());
            rs.updateInt("hieuso", team.getHieuso());
            rs.insertRow();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<Team> list = getListTeam();
        System.out.println(list.toString());
    }

    public static Team listTeamById(int idteam) {
        List<Team> list = getListTeam();
        for (Team te : list) {
            if (te.getIdteam() == idteam) {
                return te;
            }
        }
        return null;
    }

    public static void update(Team team) {
        Connection con = getconnection();

        try {
            PreparedStatement ps = con.prepareStatement("update team set diem=?,hieuso=? where IDTeam=?");
            ps.setInt(1, team.getDiem());
            ps.setInt(2, team.getHieuso());
            ps.setInt(3, team.getIdteam());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static List<Team> sort() {
        List<Team> ds = new ArrayList<Team>();
        Connection con = getconnection();
        try {

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * "
                    + "FROM team "
                    + "order by team.diem desc, "
                    + "team.hieuso desc,"
                    + "team.IDTeam desc");
            while (rs.next()) {
                Team a = new Team();
                a.setIdteam(rs.getInt("IDTeam"));
                a.setNameTeam(rs.getString("NameTeam"));
                a.setDiem(rs.getInt("diem"));
                a.setHieuso(rs.getInt("hieuso"));
                ds.add(a);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ds;
    }

}
