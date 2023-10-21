package org.mletkin.java17.rec.distance;

public record Kilometer(double dist) implements Distance {

    public Meter toMeter() {
        return new Meter(dist * 1000);
    }

    public Miles toMiles() {
        return new Miles(dist / 1.60934);
    }

}
