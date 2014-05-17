package com.qlydb.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ResultAction extends ActionSupport {

    private Result result;
    private List<Result> listResult;
    private ResultDao resultDAO;
    private TeamDao teamDAO;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public List<Result> getListResult() {
        return listResult;
    }

    public void setListResult(List<Result> listResult) {
        this.listResult = listResult;
    }

    @SuppressWarnings("static-access")
    public String edit() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        String resultId = request.getParameter("resultId");
        System.out.println(resultId);
        result = resultDAO.getResultById(Integer.parseInt(resultId));
        request.setAttribute("result", result);
        return SUCCESS;
    }

    public String getList() {
        listResult = resultDAO.getListResult();
        return SUCCESS;
    }

    public String update() {
        HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(
                ServletActionContext.HTTP_REQUEST);
        result = resultDAO.getResultById(Integer.parseInt(request.getParameter("resultID")));
        result.setTeam1(result.getTeam1());
        result.setTeam2(result.getTeam2());
        result.setScore1(Integer.parseInt(request.getParameter("score1")));
        result.setScore2(Integer.parseInt(request.getParameter("score2")));
        resultDAO.update(result);
        Team team1 = result.getTeam1();
        Team team2 = result.getTeam2();

        if (result.getScore1() > result.getScore2()) {
            team1.setDiem(team1.getDiem() + 3);
            team2.setDiem(team2.getDiem() + 0);
            team1.setHieuso(team1.getHieuso() + result.getScore1() - result.getScore2());
            team2.setHieuso(team2.getHieuso() - result.getScore1() + result.getScore2());

        } else if (result.getScore1() == result.getScore2()) {
            team1.setDiem(team1.getDiem() + 1);
            team2.setDiem(team2.getDiem() + 1);

        } else {
            team1.setDiem(team1.getDiem() + 0);
            team2.setDiem(team2.getDiem() + 3);
            team1.setHieuso(team1.getHieuso() + result.getScore1() - result.getScore2());
            team2.setHieuso(team2.getHieuso() - result.getScore1() + result.getScore2());
        }
        teamDAO.update(team1);
        teamDAO.update(team2);
        listResult = resultDAO.getListResult();
        request.setAttribute("listResult", listResult);
        return SUCCESS;
    }
}
