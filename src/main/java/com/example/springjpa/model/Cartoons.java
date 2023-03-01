package com.example.springjpa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cartoons {
    @Id
    private String Name;
    @Column(name="channel")
    private String channelname;
    private int timing;
    private String favchar;

    public Cartoons(String name, String channelname, int timing, String favchar) {
        Name = name;
        this.channelname = channelname;
        this.timing = timing;
        this.favchar = favchar;
    }

    public Cartoons() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public int getTiming() {
        return timing;
    }

    public void setTiming(int timing) {
        this.timing = timing;
    }

    public String getFavchar() {
        return favchar;
    }

    public void setFavchar(String favchar) {
        this.favchar = favchar;
    }
}
