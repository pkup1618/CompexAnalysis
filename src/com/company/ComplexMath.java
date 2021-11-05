package com.company;

public class ComplexMath {


    public static ComplexNumber sum(ComplexNumber elem1, ComplexNumber elem2) {
        return new ComplexNumber(FractionsMath.sum(elem1.getReal(), elem2.getReal()),
                                 FractionsMath.sum(elem1.getImaginary(), elem2.getImaginary()));
    }


    public static ComplexNumber difference(ComplexNumber minuend, ComplexNumber subtrahend) {
        return new ComplexNumber(FractionsMath.difference(minuend.getReal(), subtrahend.getReal()),
                FractionsMath.difference(minuend.getImaginary(), subtrahend.getImaginary()));
    }

    public static ComplexNumber product(ComplexNumber elem1, ComplexNumber elem2) {
        return new ComplexNumber(FractionsMath.difference(FractionsMath.product(elem1.getReal(), elem2.getReal()), FractionsMath.product(elem1.getImaginary(), elem2.getImaginary())),
                FractionsMath.sum(FractionsMath.product(elem1.getReal(), elem2.getImaginary()), FractionsMath.product(elem2.getReal(), elem1.getImaginary())));
    }

    //todo Division
}
