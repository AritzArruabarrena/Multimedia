package com.example.multimediakolana;

import java.util.ArrayList;
import java.util.List;

public class Ekipoak {

    private String course_name;
    private  String description;
    private int imgid;
    private List<Jokalariak> players;

    public Ekipoak(String course_name, int  imgid , String description) {
        this.course_name = course_name;
        this.description = description;
        this.imgid = imgid;
        this.players = new ArrayList<>();
    }
    public void addPlayer(Jokalariak player) {
        players.add(player);
    }

    public List<Jokalariak> getPlayers() {
        return players;
    }

    public String getCourse_name() {
        return course_name;
    }

    public  String getDescription(){
        return description;
    }
    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getImgid() {
        return imgid;
    }

    public void setImgid(int imgid) {
        this.imgid = imgid;
    }
    
}