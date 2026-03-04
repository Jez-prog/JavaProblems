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
        // G. subtract METHOD TEST
        // =============================================================
        System.out.println("/n==================multiply Method Test=================\n");
        RationalNumber multiplyFirstExample = new RationalNumber(10, 58);
        RationalNumber multiplySecondExample = new RationalNumber(56, 14);

        System.out.println("First Fraction: "+ multiplyFirstExample);
        System.out.print("Second Part: "+ multiplySecondExample);

        System.out.println("\n================ After using the Method ===============\n");
        RationalNumber multiplyResult = multiplyFirstExample.add(multiplySecondExample);
        System.out.println("add Method Result: "+ multiplyResult);





    }
}