package org.mletkin.java17.rec.distance;

public record Miles(double dist) implements Distance {

    public Kilometer toKilometer() {
        return new Kilometer(dist * 1.60934);
    }

    public Meter toMeter() {
        return new Meter(dist * 1609.34);
    }
}
