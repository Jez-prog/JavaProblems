/**
 * RationalNumberDemo.java
 *
 * Demonstrates the RationalNumber class features:
 * 1. Object creation (proper and improper fractions)
 * 2. Constructor validation (zero denominator handling)
 * 3. Getters and setters
 * 4. Conversion methods (toString, toDouble)
 * 5. Simplification using GCD
 * 6. Comparison operations
 * 7. Arithmetic operations (add, subtract, multiply, divide)
 * 8. Division edge cases (by 1, by 0, by itself)
 * 9. Static validation method
 *
 * @author Jezreel E. Guillermo (Github: Jeshz-Dev)
 */
public class RationalNumberDemo{
    public static void main(String[] args) {

        // =============================================================
        // 1. OBJECT CREATION AND GETTERS
        // =============================================================

        //Proper and Improper Rational Number Test
        System.out.println("\n*********Rational Number Created***************\n");
        RationalNumber improperFractionTest = new RationalNumber(25, 36);
        RationalNumber properFrcationTest = new RationalNumber(36, 18);
        
        System.out.println("Improper Fraction Test: "+ improperFractionTest);
        System.out.println("Proper Fraction Test:" + properFrcationTest);

        //0 Denominator Test with Safe "1" Default
        RationalNumber zeroEdgeCaseTest = new RationalNumber(6, 0);
        System.out.println("Zero Edge Case Test: "+ zeroEdgeCaseTest);


         // =============================================================
        // 2. MODIFYING POINTS (SETTERS)
        // =============================================================
        System.out.println("\n==============Before==============\n");
        System.out.println("Testing the Setter.");
        RationalNumber setterTest = new RationalNumber(58, 60);
        System.out.println("Before Using Setter: "+ setterTest);


        //Using the Setter here
        setterTest.setNumerator(6);
        setterTest.setDenominator(7);

        System.out.println("\n===================After===================\n");
        System.out.println("After Using the Setter: "+ setterTest+ "\n");

        //Special Edge Case "0 denominator" Test
        setterTest.setNumerator(6);
        setterTest.setDenominator(0);
        System.out.println("Denominator edge case: "+ setterTest);


        // =============================================================
        // 3. METHODS TESTS
        // =============================================================

        // =============================================================
        // A. toSTRING METHOD TEST
        // =============================================================
        System.out.println("\n=============toString Method Test==================\n");
        RationalNumber makeString = new RationalNumber(3, 4);
        System.out.println("Before Using toString Method: "+ makeString);

        String fracToString = makeString.toString();
        System.out.println("After using the toString Method: "+ fracToString);

        // =============================================================
        // B. toDouble METHOD TEST
        // =============================================================
        System.out.println("\n+++++++++++++toDouble Method Test++++++++++++++++\n");
        RationalNumber makeDouble = new RationalNumber(1, 2);
        System.out.println("Before using toDouble Method: "+ makeDouble);

        double fracToDouble = makeDouble.toDouble();
        System.out.println("After using the toDouble Method:  "+ fracToDouble);


        // =============================================================
        // C. toSimplestForm METHOD TEST
        // =============================================================
        System.out.println("\n+++++++++++++toSimplestForm Test++++++++++++++++\n");
        RationalNumber makeToSimplestform = new RationalNumber(600, 998);
        System.out.println("Before using toSimplestForm: "+ makeToSimplestform);

        RationalNumber fracToSimplestForm = makeToSimplestform.toSimplestForm();
        System.out.println("After using the toSimplestForm Method: "+ fracToSimplestForm);

        // =============================================================
        // D. compareTo METHOD TEST
        // =============================================================
        System.out.println("\n<<<<<<<<<<<<<<<<<compareTo Method Test>>>>>>>>>>>>>>>>>>>>\n");
        // x>0 test 3/4 , 1/2
        System.out.println("\nTesting the GreaterThan edge case:\n");
        RationalNumber greaterThanFirstPart = new RationalNumber(3, 4);
        RationalNumber greaterThanSecondPart = new RationalNumber(1, 2);

        System.out.println("================Before using the method===========");
        System.out.println("First Fraction: "+ greaterThanFirstPart);
        System.out.println("Second Fraction: "+ greaterThanSecondPart);

        System.out.println("################ After using the method ###############");
        int greaterThanResult = greaterThanFirstPart.compareTo(greaterThanSecondPart);
        System.out.println("Greater than method test result: "+ greaterThanResult);



        // x<0 test 1/3 , 1/2
        System.out.println("\nTesting the LessThan edge case:\n");
        RationalNumber lessThanFirstPart = new RationalNumber(1, 3);
        RationalNumber lessThanSecondPart = new RationalNumber (1, 2);

        System.out.println("================Before using the method===========");
        System.out.println("First Fraction: "+ lessThanFirstPart);
        System.out.print("Second Fraction: "+ lessThanSecondPart);

        System.out.println("$$$$$$$$$$$$$$$ After using the method $$$$$$$$$$$$$$$$$");
        int lessThanResult = lessThanFirstPart.compareTo(lessThanSecondPart);
        System.out.println("Less Than method test result: "+ lessThanResult);
        

        // equal test 1/2 , 2/4
        System.out.println("\nTesting Equal edge case test:\n");
        RationalNumber equalFirstPart = new RationalNumber(1, 2);
        RationalNumber equalSecondPart = new RationalNumber(2, 4);

        System.out.println("!!!!!!!!!!! Before using the method !!!!!!!!!!!!!");
        System.out.println("First Fraction: "+ equalFirstPart);
        System.out.println("Second Fraction: "+ equalSecondPart);

        System.out.println("@@@@@@@@@ After Using the method  @@@@@@@@@@@@@");
        int equalResult = equalFirstPart.compareTo(equalSecondPart);
        System.out.println("Equal Method Test Result: "+ equalResult);




         // =============================================================
        // E. add METHOD TEST
        // =============================================================
        System.out.println("/n==================add Method Test=================\n");
        RationalNumber addFirstExample = new RationalNumber(1, 2);
        RationalNumber addSecondExample = new RationalNumber(1, 2);

        System.out.println("First Fraction: "+ addFirstExample);
        System.out.print("Second Part: "+ addSecondExample);

        System.out.println("\n%%%%%%%%%%% After using the Method%%%%%%%%%%%%%%%\n");
        RationalNumber addResult = addFirstExample.add(addSecondExample);
        System.out.println("add Method Result: "+ addResult);

        // =============================================================
        // F. subtract METHOD TEST
        // =============================================================
        System.out.println("/n==================subtract Method Test=================\n");
        RationalNumber subtractFirstExample = new RationalNumber(45, 7);
        RationalNumber subtractSecondExample = new RationalNumber(10, 14);

        System.out.println("First Fraction: "+ subtractFirstExample);
        System.out.print("Second Part: "+ subtractSecondExample);

        System.out.println("\n================ After using the Method ===============\n");
        RationalNumber subtractResult = subtractFirstExample.subtract(subtractSecondExample);
        System.out.println("add Method Result: "+ subtractResult);

        // =============================================================
        // G. multiply METHOD TEST
        // =============================================================
        System.out.println("/n==================multiply Method Test=================\n");
        RationalNumber multiplyFirstPart = new RationalNumber(10, 58);
        RationalNumber multiplySecondPart = new RationalNumber(56, 14);

        System.out.println("First Fraction: "+ multiplyFirstPart);
        System.out.print("Second Part: "+ multiplySecondPart);

        System.out.println("\n================ After using the Method ===============\n");
        RationalNumber multiplyResult = multiplyFirstPart.multiply(multiplySecondPart);
        System.out.println("add Method Result: "+ multiplyResult);

         // =============================================================
        // H. divides METHOD TEST
        // =============================================================
        System.out.println("/n===============divides Method Test===================");
        RationalNumber dividesFirstPart = new RationalNumber(67, 76);
        RationalNumber dividesSeccondPart = new RationalNumber(57, 54);

        System.out.println("First Fraction: "+ dividesFirstPart);
        System.out.println("Second Fraction: "+  dividesSeccondPart);

        System.out.println("\n------------------After using the method----------------");
        RationalNumber devidesResult = dividesFirstPart.divides(dividesSeccondPart);
        System.out.println("divides method result: "+devidesResult);

        // =============================================================
        // I. divides EDGE CASES    
        // =============================================================

        //Division by 1/1
        System.out.println("\n===============division by 1/1 Method Test===================\n");
        RationalNumber divideByOneFirstPart = new RationalNumber(67, 76);
        RationalNumber divideByOneSeccondPart = new RationalNumber(1, 1);

        System.out.println("First Fraction: "+ divideByOneFirstPart);
        System.out.println("Second Fraction: "+  divideByOneSeccondPart);

        System.out.println("\n------------------After using the method----------------");
        RationalNumber divideByOneResult = divideByOneFirstPart.divides(divideByOneSeccondPart);
        System.out.println("divides method result: "+divideByOneResult);

        //Division by 0
        System.out.println("\n===============division by 0 Method Test===================\n");
        RationalNumber divideByZeroFirstPart = new RationalNumber(67, 76);
        RationalNumber divideByZeroSeccondPart = new RationalNumber(0, 5);

        System.out.println("First Fraction: "+ divideByZeroFirstPart);
        System.out.println("Second Fraction: "+  divideByZeroSeccondPart);

        System.out.println("\n------------------After using the method----------------");
        RationalNumber devideByZeroResult = divideByZeroFirstPart.divides(divideByZeroSeccondPart);
        System.out.println("divides method result: "+devideByZeroResult);

        //Division by itself
        System.out.println("\n===============division by itself Method Test===================\n");
        RationalNumber divideByItselfFirstPart = new RationalNumber(67, 76);
        RationalNumber divideByItselfSecondPart = new RationalNumber(67, 76);
        System.out.println("First Fraction: "+ divideByItselfFirstPart);
        System.out.println("Second Fraction: "+  divideByItselfSecondPart);

        System.out.println("\n------------------After using the method----------------");
        RationalNumber divideByItselfResult = divideByItselfFirstPart.divides(divideByItselfSecondPart);
        System.out.println("divides method result: "+divideByItselfResult);

        // =============================================================
        // J. isValid METHOD TEST      
        // =============================================================
        System.out.println("\n<<<<<<<<<<<<<<<<< isValid Method Test >>>>>>>>>>>>>>>>>>>>");
        
        //Valid Fraction Test
        System.out.println("==========Good Fraction Test=============\n");
        RationalNumber rGood = new RationalNumber(3, 4);
        System.out.println("Good fraction test sample: "+rGood);
        boolean checkGood = RationalNumber.isValid(rGood);
        System.out.println("Is this a Good fraction? "+checkGood);

        System.out.println("\n======================Bad Fraction Test==============\n");
        System.out.println("The original fraction is 5/6, then setting the denominator 0, then if its 0, making it 1 due to constructor.");
        RationalNumber rBad = new RationalNumber(6, 5);
        System.out.println("Bad fraction test sample: " + rBad);
        rBad.setDenominator(0);  
        boolean checkBad = RationalNumber.isValid(rBad);
        System.out.println("If the denominator is 0, making the denominator 1.");
        System.out.println("Is fraction this good? " + checkBad);

        //null Test
         System.out.println("\n======================Null Test==============\n");
        RationalNumber rNull = null;
        System.out.println("Testing null object (Expect false): " + RationalNumber.isValid(rNull));



    }
}