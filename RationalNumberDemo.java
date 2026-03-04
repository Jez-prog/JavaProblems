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
        System.out.println("<<<<<<<<<<<<<<<<<compareTo Method Test>>>>>>>>>>>>>>>>>>>>");
        // x>0 test 3/4 , 1/2
        System.out.println("\nTesting the GreaterThan edge case.\n");
        RationalNumber greaterThanFirstPart = new RationalNumber(3, 4);
        RationalNumber greaterThanSecondPart = new RationalNumber(1, 2);

        System.out.println("================Before using the method===========");
        System.out.println("First Fraction: "+ greaterThanFirstPart);
        System.out.println("Second Fraction: "+ greaterThanSecondPart);

        System.out.println("66666666666666 After using the method 7777777777777");
        int result = greaterThanFirstPart.compareTo(greaterThanSecondPart);
        System.out.println("Greater than method test result: "+ result);



        // x<0 test 1/3 , 1/2

        // equal test 1/2 , 2/4
        









    }
}