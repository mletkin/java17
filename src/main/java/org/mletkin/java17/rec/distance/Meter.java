package org.mletkin.java17.rec.distance;

public record Meter(double dist) {

    public Kilometer toKilometer() {
        return new Kilometer(dist / 1000);
    }

    public Miles toMile() {
        return new Miles(dist / 1609.34);
    }

}
