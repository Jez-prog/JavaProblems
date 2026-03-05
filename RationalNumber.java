/**
 * RationalNumber.java
 *
 * Represents a rational number (fraction) with numerator and denominator.
 * Demonstrates:
 *  - Instance variables (numerator, denominator)
 *  - Constructor with validation (auto-corrects invalid denominators)
 *  - Getters and Setters with protection
 *  - Arithmetic operations (add, subtract, multiply, divide)
 *  - Fraction simplification using GCD (Euclidean algorithm)
 *  - Comparison operations
 *  - Reciprocal calculation
 *  - Static validation method
 *
 * @author Jezreel E. Guillermo (Github: Jeshz-Dev)
 */
public class RationalNumber{
     // =========================================================
    // INSTANCE VARIABLES
    // =========================================================

    private int numerator;
    private int denominator;

    // =========================================================
    // CONSTRUCTOR
    // =========================================================
     /**
     * Parameterized constructor with validation.
     * If denominator is 0, auto-corrects to maintain valid state:
     * sets numerator to original value and denominator to 1.
     * 
     * @param numerator The numerator of the fraction
     * @param denominator The denominator of the fraction
     */
    public RationalNumber(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("Denomitor cannot be 0. Will instead change denominator to 1. Please change.");
            this.numerator = numerator;
            this.denominator = 1;
        }else{
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

     // =========================================================
    // GETTERS
    // =========================================================
    public int getNumerator(){
        return numerator;
    }

    public int getDenominator(){
        return denominator;
    }

      // =========================================================
    // SETTERS
    // =========================================================

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public void setDenominator(int denominator){
        if(denominator == 0){
            System.out.println("Denominator cannot be 0");
            this.denominator = 1;
            return;
        }else{
            this.denominator = denominator;
        }
    }

     // =========================================================
    // CONVERSION METHODS
    // =========================================================

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

     // =========================================================
    // COMPARISON METHOD
    // =========================================================

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
    
    // =========================================================
    // ARITHMETIC OPERATIONS
    // =========================================================
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

    // =========================================================
    // STATIC VALIDATION METHOD
    // =========================================================

    public static boolean isValid(RationalNumber r) {
    if (r == null) {
        return false;
    }
    // If we are here, we KNOW r is not null.
    return r.getDenominator() != 0;
}
    
}