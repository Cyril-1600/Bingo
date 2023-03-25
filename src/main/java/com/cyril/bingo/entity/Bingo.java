package com.cyril.bingo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Bingo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer Id;
    @Column
    String PlayerA_IP;
    @Column
    String PlayerA_NAME;
    @Column
    String PlayerB_IP;
    @Column
    String PlayerB_NAME;
    @Column
    String gameResults;
    @Column
    Date updateTime;

    public Bingo() {
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getPlayerA_IP() {
        return PlayerA_IP;
    }

    public void setPlayerA_IP(String playerA_IP) {
        PlayerA_IP = playerA_IP;
    }

    public String getPlayerA_NAME() {
        return PlayerA_NAME;
    }

    public void setPlayerA_NAME(String playerA_NAME) {
        PlayerA_NAME = playerA_NAME;
    }

    public String getPlayerB_IP() {
        return PlayerB_IP;
    }

    public void setPlayerB_IP(String playerB_IP) {
        PlayerB_IP = playerB_IP;
    }

    public String getPlayerB_NAME() {
        return PlayerB_NAME;
    }

    public void setPlayerB_NAME(String playerB_NAME) {
        PlayerB_NAME = playerB_NAME;
    }

    public String getGameResults() {
        return gameResults;
    }

    public void setGameResults(String gameResults) {
        this.gameResults = gameResults;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime() {
        this.updateTime = new Date();
    }

    @Override
    public String toString() {
        return "bingo{" +
                "Id=" + Id +
                ", PlayerA_IP='" + PlayerA_IP + '\'' +
                ", PlayerA_NAME='" + PlayerA_NAME + '\'' +
                ", PlayerB_IP='" + PlayerB_IP + '\'' +
                ", PlayerB_NAME='" + PlayerB_NAME + '\'' +
                ", gameResults='" + gameResults + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
