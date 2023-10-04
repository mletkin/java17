package org.mletkin.java17.rec;

public record Complex(double real, double img) {

    public Complex plus(Complex b) {
        return new Complex(this.real + b.real, this.img + b.img);
    }

    public Complex neg() {
        return new Complex(-this.real, -this.img);
    }

    public Complex minus(Complex b) {
        return plus(b.neg());
    }

    public Complex multiply(Complex b) {
        return new Complex(this.real * b.real - this.img * this.img, this.real * b.img + this.img * b.real);
    }

    public Complex divide(Complex b) {
        var div = b.real * b.real + b.img * b.img;

        return new Complex((this.real * b.real + this.img * b.img) / div, //
                +(this.img * b.real - this.real * b.img) / div);
    }

    @Override
    public String toString() {
        return real + " + " + img + "i";
    }

}
