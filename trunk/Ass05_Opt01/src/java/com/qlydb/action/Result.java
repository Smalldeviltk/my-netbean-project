package com.qlydb.action;

@SuppressWarnings("serial")
public class Result implements java.io.Serializable {

    private Integer resultId;
    private Team team1;
    private Integer score1;
    private Team team2;
    private Integer score2;

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Integer getScore1() {
        return score1;
    }

    public void setScore1(Integer score1) {
        this.score1 = score1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Integer getScore2() {
        return score2;
    }

    public void setScore2(Integer score2) {
        this.score2 = score2;
    }

    public Result() {
    }

    public Integer getResultId() {
        return this.resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

}
