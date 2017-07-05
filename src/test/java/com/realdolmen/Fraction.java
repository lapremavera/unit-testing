package com.realdolmen;
public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }
    public int numerator() {
        return numerator;
    }
    public int denominator() {
        return denominator;
    }
    private void simplify() {
        int factor= Utilities.greatestCommonFactor(numerator, denominator);
        numerator /= factor;
        denominator /= factor;

        if(numerator==0){
            denominator=1;
            return;
        }
        if(denominator==0){
            throw new IllegalArgumentException ("Cannot be zero");
        }
    }
    public Fraction add(Fraction other){
        return new Fraction(this.numerator()*other.denominator()
                +other.numerator()*this.denominator(),
                this.denominator()*other.denominator());
    }
    public Fraction subtract(Fraction other){
        return new Fraction(this.numerator()*other.denominator()
                -other.numerator()*this.denominator(),
                this.denominator()*other.denominator());
    }
    public Fraction muliply(Fraction other){
        return new Fraction(this.numerator()*other.numerator(),
                this.denominator()*other.denominator());
    }
    public Fraction divider(Fraction other){
        return new Fraction(this.numerator()*other.denominator(),
                this.denominator()*other.numerator());
    }

    @Override
    public String toString() {
        return ""+ numerator +"/"+ denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (numerator != fraction.numerator) return false;
        return denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }
}
