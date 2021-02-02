package com.jinmati.runkeepertest;

public class Sports {

    String sportsName;
    int sportsImage;
    String sportsTime;

    public Sports(int sportsImage, String sportsName, String sportsTime)
    {
        this.sportsName = sportsName;
        this.sportsImage = sportsImage;
        this.sportsTime = sportsTime;
    }

    public String getSportsName() {
        return sportsName;
    }

    public void setSportsName(String sportsName) {
        this.sportsName = sportsName;
    }

    public int getSportsImage() {
        return sportsImage;
    }

    public void setSportsImage(int sportsImage) {
        this.sportsImage = sportsImage;
    }

    public String getSportsTime() {
        return sportsTime;
    }

    public void setSportsTime(String sportsTime) {
        this.sportsTime = sportsTime;
    }
}
