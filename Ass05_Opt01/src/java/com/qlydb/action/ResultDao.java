package com.qlydb.action;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ResultDao {

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

    public static List<Result> getListResult() {
        List<Result> ds = new ArrayList<Result>();
        Connection con = getconnection();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM result");
            while (rs.next()) {
                Result a = new Result();
                a.setResultId(Integer.parseInt(rs.getString("ResultID")));
                a.setScore1(Integer.parseInt(rs.getString("score1")));
                a.setScore2(Integer.parseInt(rs.getString("score2")));
                a.setTeam1(TeamDao.listTeamById(Integer.parseInt(rs.getString("IDTeam1"))));
                a.setTeam2(TeamDao.listTeamById(Integer.parseInt(rs.getString("IDTeam2"))));
                ds.add(a);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return ds;
    }

    public static void main(String[] args) {
        createCalen();
        List<Result> list = getListResult();
        System.out.println(list);

    }

    public static void createCalen() {
        Connection con = getconnection();
        List<Team> listTeam = TeamDao.getListTeam();
        for (int i = 0; i < (listTeam.size() - 1); i++) {
            for (int j = i + 1; j < listTeam.size(); j++) {
                try {
                    ResultSet rs;
                    System.out.println(listTeam.get(i).getIdteam());
                    System.out.println(listTeam.get(j).getIdteam());
                    Statement stsm = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    rs = stsm.executeQuery("SELECT * FROM result");
                    rs.moveToInsertRow();
                    rs.updateInt("IDTeam1", listTeam.get(i).getIdteam());
                    rs.updateInt("IDTeam2", listTeam.get(j).getIdteam());
                    rs.updateInt("score1", 0);
                    rs.updateInt("score2", 0);
                    rs.insertRow();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void update(Result result) {
        Connection con = getconnection();

        try {
            PreparedStatement ps = con.prepareStatement("update result set score1=?,score2=? where ResultID=?");
            ps.setInt(1, result.getScore1());
            ps.setInt(2, result.getScore2());
            ps.setInt(3, result.getResultId());
            ps.executeUpdate();
            con.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static Result getResultById(int idResult) {
        List<Result> list = getListResult();
        for (Result te : list) {
            if (te.getResultId() == idResult) {
                return te;
            }
        }
        return null;
    }
}
