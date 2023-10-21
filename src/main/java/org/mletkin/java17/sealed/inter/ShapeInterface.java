package org.mletkin.java17.sealed.inter;

public sealed interface ShapeInterface permits ShapeInterface.Quadrangle, ShapeInterface.Ellipse {

    public static non-sealed interface Quadrangle extends ShapeInterface {

    }

    public static interface Trapezoid extends Quadrangle {

    }

    public static sealed interface Rectangle extends Quadrangle permits Square {

    }

    public static non-sealed interface Square extends Rectangle {

    }

    public static sealed class Ellipse implements ShapeInterface permits Circle {

    }

    public static non-sealed class Circle extends Ellipse {

    }

}
