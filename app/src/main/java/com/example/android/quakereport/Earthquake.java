package com.example.android.quakereport;

public class Earthquake {
    private String mag;
    private String places;
    private String date;

    public Earthquake(){

    }

    public Earthquake(String mag, String places, String date) {
        this.mag = mag;
        this.places = places;
        this.date = date;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mag=" + mag +
                ", places='" + places + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
