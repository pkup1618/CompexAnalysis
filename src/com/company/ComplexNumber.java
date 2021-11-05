package com.company;

public class ComplexNumber {

    private Fraction real;
    public Fraction getReal() {
        return real;
    }


    private Fraction imaginary;
    public Fraction getImaginary() {
        return imaginary;
    }


    private ComplexNumber() {}

    public ComplexNumber(Fraction real, Fraction imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
}
