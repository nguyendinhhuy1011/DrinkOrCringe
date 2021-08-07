package com.example.drinkorcringe;

import java.util.ArrayList;

public class Player {
    private String name;
    int point =0;

    public Player() {
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    public void addpoint(){
        point = point +1;
    }
    public void losepoint(){
        point = point -1;
    }
    public void add2point(){
        point = point +2;
    }
}


