package com.example.android.quakereport;

public class Earthquake {
    private double mag;
    private String location;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(){

    }

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param mag is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param mTimeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param mUrl is the website URL to find more details about the earthquake
     */
    public Earthquake(double mag, String location, long mTimeInMilliseconds, String mUrl) {
        this.mag = mag;
        this.location = location;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mUrl = mUrl;
    }

    public double getMag() {
        return mag;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getUrl() {
        return mUrl;
    }

    @Override
    public String toString() {
        return "Earthquake{" +
                "mag=" + mag +
                ", location='" + location + '\'' +
                ", mTimeInMilliseconds=" + mTimeInMilliseconds +
                ", mUrl='" + mUrl + '\'' +
                '}';
    }
}
