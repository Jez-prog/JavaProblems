/**
 * RationalNumber.java
 *
 * Represents a rational number (fraction) with numerator and denominator.
 * Demonstrates:
 *  - Instance variables (numerator, denominator)
 *  - Constructor with validation
 *  - Getters and Setters
 *  - Arithmetic operations (add, subtract, multiply, divide)
 *  - Fraction simplification using GCD
 *  - Comparison and reciprocal operations
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
     * Parameterized constructor with validation
     * If denominator is 0, sets rational number to 0/1
     */
    public RationalNumber(int numerator, int denominator){
        if(denominator == 0){
            System.out.println("The denominator cannot be 0");
            this.numerator = 0;
            this.denominator = 1;
        }else{
            this.numerator = numerator;
        this.denominator = denominator;
        }
        
    }

    // =========================================================
    // GETTERS
    // =========================================================

    public int getDenom(){
        return denominator;
    }

    public int getNume(){
        return  numerator;
    }

    // =========================================================
    // SETTERS
    // =========================================================

    public void setNume(int numerator){
        this.numerator = numerator;
    }

    public void setDenom(int denominator){
        if(denominator == 0){
            System.out.print("Denominator cannot be 0!");
            return;
        }
        this.denominator = denominator;
    }

    // =========================================================
    // CONVERSION METHODS
    // =========================================================

    /** Returns the decimal representation of this rational number */
    public double toDouble(){
        return (double) numerator / denominator;
    }

    /** Returns string representation in format "numerator / denominator" */
    public String toString(){
        return numerator + " / " + denominator;
    }

    // =========================================================
    // SIMPLIFICATION METHODS
    // =========================================================

    /** Helper method: Calculates greatest common divisor using Euclidean algorithm */
    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /** Returns a new RationalNumber in simplest form */
    public RationalNumber toSimplestForm(){
        int divisor = gcd(numerator, denominator);
        int newNume = numerator / divisor;
        int newDenom = denominator / divisor;

        return new RationalNumber(newNume, newDenom);
    }

    // =========================================================
    // ARITHMETIC OPERATIONS
    // =========================================================

    /** Returns the sum of this rational number and another */
    public RationalNumber add(RationalNumber other){
        int newNum = (this.numerator * other.denominator) + (this.denominator * other.numerator);
        int newDenom = (this.denominator * other.denominator);
        RationalNumber result = new RationalNumber(newNum, newDenom);

        return result.toSimplestForm();
    }

    /** Returns the difference of this rational number and another */
    public RationalNumber subtract(RationalNumber that){
        int newNum = (this.numerator * that.denominator) - (this.denominator * that.numerator);
        int newDenom = (this.denominator * that.denominator);
        RationalNumber result = new RationalNumber(newNum, newDenom);

        return result.toSimplestForm();
    }

    /** Returns the product of this rational number and another */
    public RationalNumber multiply(RationalNumber katoNa){
    int newNum = (this.numerator * katoNa.numerator);
    int newDenom = (this.denominator * katoNa.denominator);
    RationalNumber result = new RationalNumber(newNum, newDenom);

    return result.toSimplestForm();
    }
    
    /** Returns the reciprocal of this rational number */
    public RationalNumber reciprocal(){
        return new RationalNumber(denominator, numerator);
    }

    /** Returns the quotient of this rational number divided by another */
    public RationalNumber divides(RationalNumber other){
        int newNum =   this.numerator * other.denominator;
        int newDenom = this.denominator * other.numerator;
        RationalNumber result = new RationalNumber(newNum, newDenom);
        return result.toSimplestForm();
    }

    // =========================================================
    // COMPARISON METHOD
    // =========================================================

    /** 
     * Compares this rational number with another
     * Returns: 0 if equal, +1 if greater, -1 if less
     */
    public int compareTo(RationalNumber katoNa){
        int right = this.denominator * katoNa.numerator;
        int left = this.numerator * katoNa.denominator;

        if(left>right){
            return 1;
        }else if(right>left){
            return -1;
        }else{
            return 0;
        }
    }

    // =========================================================
    // STATIC VALIDATION METHOD
    // =========================================================

    /** Static method: Returns true if the denominator is not zero */
    public static boolean isValid(RationalNumber that){
        return that.denominator != 0;
    }

}