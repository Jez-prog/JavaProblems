public class RationalNumber{

    private int numerator;
    private int denominator;

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


    public int getDenom(){
        return denominator;
    }

    public int getNume(){
        return  numerator;
    }

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

    public double toDouble(){
        return (double) numerator / denominator;
    }

    public String toString(){
        return numerator + " / " + denominator;
    }

    private int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        //gcd(b, a % b);
    }
    public RationalNumber toSimplestForm(){
        int divisor = gcd(numerator, denominator);
        int newNume = numerator / divisor;
        int newDenom = denominator / divisor;

        return new RationalNumber(newNume, newDenom);
    }

    public RationalNumber add(RationalNumber other){
        int newNum = (this.numerator * other.denominator) + (this.denominator * other.numerator);
        int newDenom = (this.denominator * other.denominator);
        RationalNumber result = new RationalNumber(newNum, newDenom);

        return result.toSimplestForm();
    }
    public RationalNumber subtract(RationalNumber that){
        int newNum = (this.numerator * that.denominator) - (this.denominator * that.numerator);
        int newDenom = (this.denominator * that.denominator);
        RationalNumber result = new RationalNumber(newNum, newDenom);

        return result.toSimplestForm();
    }

    public RationalNumber multiply(RationalNumber katoNa){
    int newNum = (this.numerator * katoNa.numerator);
    int newDenom = (this.denominator * katoNa.denominator);
    RationalNumber result = new RationalNumber(newNum, newDenom);

    return result.toSimplestForm();
    }
    
    public RationalNumber reciprocal(){
        return new RationalNumber(denominator, numerator);
    }

    public RationalNumber divides(RationalNumber other){
        int newNum =   this.numerator * other.denominator;
        int newDenom = this.denominator * other.numerator;
        RationalNumber result = new RationalNumber(newNum, newDenom);
        return result.toSimplestForm();
    }

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
    public static boolean isValid(RationalNumber that){
        return that.denominator != 0;
    }















}