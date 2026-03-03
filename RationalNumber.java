//import java.util.*;
//import java.lang.*;

public class RationalNumber{
    private int numerator;
    private int denominator;

    public RationalNumber(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denomitor cannot be 0. Please Change.");
            System.exit(1);
        }else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0){
            System.out.println("Denominator cannot be 0");
            return;
        }else{
            this.denominator = denominator;
        }
    }


    public double toDouble(){
        double makeDouble = (double) numerator / denominator;
        return makeDouble;
    }

    public String toString(){
        String makeString = numerator + "/"+  denominator;
        return makeString;

    }

    


     private int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);
        while(true){
            int c = a % b;
            if(c == 0){
                return b;
            }
            a = b;
            b = c;
        }
    }

    public RationalNumber toSimplestForm(){
        int divisor = gcd(numerator, denominator);
        int newNume = numerator / divisor;
        int newDenom = denominator / divisor;

        return new RationalNumber(newNume, newDenom);
    }


    public int compareTo(RationalNumber other){
        int leftSide = this.numerator * other.denominator;
        int rightSide = this.denominator * other.numerator;
        if(leftSide > rightSide){
            return 1;
        }
        else if( leftSide < rightSide){
            return -1;
        }
        else{
            return 0;
        }
    }
    
    public RationalNumber add(RationalNumber other){
        int numeratorFirstPart = this.numerator * other.denominator;
        int numeratorSecondPart = this.denominator * other.numerator;
        int newNumerator = numeratorFirstPart + numeratorSecondPart;
        int newDenominator = this.denominator * other.denominator;
        RationalNumber result = new RationalNumber(newNumerator, newDenominator);
        return result.toSimplestForm();
    }

    public RationalNumber subtract(RationalNumber that){
        int numeratorFirstPart = this.numerator * that.denominator;
        int numeratorSecondPart = this.denominator * that.numerator;
        int newNumerator = numeratorFirstPart - numeratorSecondPart;
        int newDenominator = this.denominator * that.denominator;
        RationalNumber result = new RationalNumber(newNumerator, newDenominator);
        return result.toSimplestForm();

    }

    public RationalNumber multiply(RationalNumber kanaNa){
        int newNumerator = this.numerator * kanaNa.numerator;
        int newDenominator = this.denominator * kanaNa.denominator;
        RationalNumber result = new RationalNumber(newNumerator, newDenominator);
        return result.toSimplestForm();
    }
    public RationalNumber reciprocal(){
        RationalNumber makeReciprocal = new RationalNumber(denominator, numerator);
        return makeReciprocal;
    }

    public RationalNumber divides(RationalNumber KiniNa){
        RationalNumber reciprocalNumber = KiniNa.reciprocal();
        int newNumerator = this.numerator * reciprocalNumber.numerator;
        int newDenominator = this.denominator * reciprocalNumber.denominator;
        RationalNumber result = new RationalNumber(newNumerator, newDenominator);
        return result.toSimplestForm();
    }
    //CAN ALSO USE THIS FOR DIVISION METHOD
    //
    // public RationalNumber division(RationalNumber kanaNa){
    // int newNumerator = this.numerator * kanaNa.denominar;
    //int newDenominator = this.denominator * kanaNa.numerator;
    //RationalNumber result = new RationalNumber(newNumerator, newDenominator);
    //return result.toSimplestForm();
    // }

    public static boolean isValid(RationalNumber r){
       if(r.getDenominator() != 0){
        return true;
       }else{
        return false;
       }
    }
    
}