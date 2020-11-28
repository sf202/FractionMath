
//Santiago Fleiderman
//CSc 2010, Principles of Computer Science
//Spring 2014
//Assignment 5; Programming Objects
// Add, Subtract, Multiply fractions
//03-04-2014

public class Fraction {
    private int numerator; //Numerator of fraction
    private int denominator; //Denominator of fraction

    public Fraction(int num, int denom) {
        numerator = num;
        denominator = denom;
    }

    public Fraction() { 
        new Fraction(0, 1);
    }

    public Fraction(int num) { 
        numerator = num;
        int denom = 1;
    }

    public int getNumerator() { 
        return numerator;
    }

    public int getDenominator() { 
        return denominator;
    }

    public void setNumerator(int num) { 
        numerator = num;
    }

    public void setDenominator(int denom) { 
        denominator = denom;
    }

    public Fraction add(Fraction f) { 
        int num = numerator * f.getDenominator() + f.getNumerator() *
                  denominator;
        int denom = denominator * f.getDenominator();
        Fraction result = new Fraction(num, denom);
        return result;
    }

     public Fraction subtract(Fraction f) { 
        int num = numerator * f.getDenominator() - f.getNumerator() *
                  denominator;
        int denom = denominator * f.getDenominator();
        Fraction result = new Fraction(num, denom);
        return result;
    }

    public Fraction multiply(Fraction f) { 
        int num = numerator * f.getNumerator();
        int denom = denominator * f.getDenominator();
        Fraction result = new Fraction(num, denom);
        return result;
    }

    public Fraction divide(Fraction f) { 
        int num = numerator * f.getDenominator();
        int denom = denominator * f.getNumerator();
        Fraction result = new Fraction(num, denom);
        return result;
        
    }
}