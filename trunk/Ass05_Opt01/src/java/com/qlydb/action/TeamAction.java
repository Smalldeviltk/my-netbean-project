package com.qlydb.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class TeamAction extends ActionSupport implements ModelDriven<Team> {

    private static final long serialVersionUID = 1L;

    private Team team = new Team();
    private List<Team> teamList = new ArrayList<Team>();
    private TeamDao teamDAO = new TeamDao();
    private int soluong;
    private ResultDao resultDAO = new ResultDao();

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static void main(String[] args) {

    }

    @Override
    public Team getModel() {
        // TODO Auto-generated method stub
        return team;
    }

    public String saveOrUpdate() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        String[] list = request.getParameterValues("db");
        teamDAO.delete();
        for (String l : list) {
            Team t = new Team();
            t.setNameTeam(l);
            teamDAO.add(t);
        }
        teamList = teamDAO.getListTeam();
        resultDAO.createCalen();
        request.setAttribute("teamList", teamList);
        return SUCCESS;
    }

    public String save() {
        teamDAO.add(team);
        return SUCCESS;
    }

    @SuppressWarnings("static-access")
    public String list() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        teamList = teamDAO.getListTeam();
        request.setAttribute("teamList", teamList);
        return SUCCESS;
    }

    public String count() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        soluong = Integer.parseInt(request.getParameter("soluong"));
        return SUCCESS;
    }

    @SuppressWarnings("static-access")
    public String edit() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        team = teamDAO.listTeamById(Integer.parseInt(request.getParameter("idteam")));
        System.out.println(team.getIdteam());
        System.out.println(team.getNameTeam());
        return SUCCESS;
    }

    public List<Team> sort() {

        return teamList;
    }

    public String ketqua() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        teamList = teamDAO.sort();
        request.setAttribute("teamList", teamList);
        return SUCCESS;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public List<Team> getTeamList() {
        return teamList;
    }

    public void setTeamList(List<Team> teamList) {
        this.teamList = teamList;
    }

}
