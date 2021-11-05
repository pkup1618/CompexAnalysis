package com.company;


//Все отрицательные дроби отрицательны только числителем!
public class Fraction {


    private int numerator;
    public int getNumerator() {
        return numerator;
    }


    private int denominator;
    public int getDenominator() {
        return denominator;
    }


    private Fraction() {}


    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0)
            this.denominator = denominator;
        else
            throw new IllegalArgumentException("denominator is zero");
    }


    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }
}