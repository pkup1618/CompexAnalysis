package com.company;

public class FractionsMath {


    public static Fraction sum(Fraction fraction1, Fraction fraction2) {

        return new Fraction(
                fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator(),
                fraction1.getDenominator() * fraction2.getDenominator());
    }


    public static Fraction difference(Fraction minuend, Fraction subtrahend) {
        return new Fraction(minuend.getNumerator() * subtrahend.getDenominator() - subtrahend.getNumerator() * minuend.getDenominator(),
                minuend.getDenominator() * subtrahend.getDenominator());
    }


    public static Fraction product(Fraction fraction1, Fraction fraction2) {

        return new Fraction(
                fraction1.getNumerator() * fraction2.getNumerator(),
                fraction1.getDenominator() * fraction2.getDenominator());
    }


    public static Fraction division(Fraction fraction , Fraction fractionDivisor) {
        if (fractionDivisor.getNumerator() == 0)
            throw new IllegalArgumentException("dividing on zero fraction");
        else
            return new Fraction(
                    fraction.getNumerator() * fractionDivisor.getDenominator(),
                    fraction.getDenominator() * fractionDivisor.getNumerator());
    }



    public static Fraction square(Fraction fraction) {
        return product(fraction, fraction);
    }
}
