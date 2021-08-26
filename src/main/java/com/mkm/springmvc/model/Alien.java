package com.mkm.springmvc.model;

public class Alien {

    private int aid;
    private String aname;

    public Alien() {
        System.out.println("Alien Object is created");
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return this.aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname=" + aname +
                '}';
    }
}
