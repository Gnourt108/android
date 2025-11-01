package com.example.danhsachsinhvien;

public class Group {
    private String groupName;
    private double score;
    private String fandom;
    private int imageResource;

    public Group(String groupName, double score, String fandom, int imageResource) {
        this.groupName = groupName;
        this.score = score;
        this.fandom = fandom;
        this.imageResource = imageResource;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getFandom() {
        return fandom;
    }

    public void setFandom(String fandom) {
        this.fandom = fandom;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
