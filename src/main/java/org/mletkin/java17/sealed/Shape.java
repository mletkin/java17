package org.mletkin.java17.sealed;

public sealed class Shape permits Shape.Quadrangle, Shape.Ellipse {

    public static non-sealed class Quadrangle extends Shape {

    }

    public static class Trapezoid extends Quadrangle {

    }

    public static sealed class Rectangle extends Quadrangle permits Square {

    }

    public static non-sealed class Square extends Rectangle {

    }

    public static sealed class Ellipse extends Shape permits Circle {

    }

    public static final class Circle extends Ellipse {

    }

}
