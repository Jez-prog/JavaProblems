/**
 * LineDemo.java
 *
 * Demonstrates the functionality of the Line class by:
 *  1. Creating lines using Point objects
 *  2. Accessing points through getters
 *  3. Modifying points using setters
 *  4. Testing slope calculations
 *  5. Checking special cases:
 *     - Horizontal line (slope = 0)
 *     - Vertical line (slope = Infinity)
 *     - Positive and negative slopes
 *
 * This serves as the main testing program for the Line class.
 *
 * @author Jezreel E. Guillermo (Github: Jeshz-Dev)
 */


public class LineDemo{
    public static void main(String[] args) {

         // =============================================================
        // 1. OBJECT CREATION AND GETTERS
        // =============================================================

        Point p1 = new Point(5,-3);
        Point p2 = new Point(-9, 15);
        

        Line line1 = new Line(p1, p2);

        Point firstPoint = line1.getPoint1();
        Point secondPoint = line1.getPoint2();

        System.out.println("\n=== Line Created ===\n");
        System.out.println("Point 1: (" + firstPoint.getX() + ", " + firstPoint.getY() + ")");
        System.out.println("Point 2: (" + secondPoint.getX() + ", " + secondPoint.getY() + ")");



        // =============================================================
        // 2. MODIFYING POINTS (SETTERS)
        // =============================================================


        System.out.println("\n===========Before============\n");
        System.out.println("Point 1: ("+ firstPoint.getX()+ ", "+ firstPoint.getY()+")");
        System.out.println("Point 2: (" + secondPoint.getX() + ", "+ secondPoint.getY()+ ")");
        
        firstPoint.setX(-6);
        firstPoint.setY(7);

        Point newPoint = new Point(6.0, -7.0);
        line1.setPoint2(newPoint);

        System.out.println("\n===========After============\n");
        System.out.println("New Point 1: ("+ firstPoint.getX()+ ", "+ firstPoint.getY()+ ")");
        System.out.println("New Point 2: (" + newPoint.getX() + " to "+ newPoint.getY()+ ")");




        


         // =============================================================
        // 3. HORIZONTAL LINE TEST (slope should be 0)
        // =============================================================
         System.out.println("\n=== Horizontal Line Test ===\n");
         Point h1 = new Point(0, 5);
         Point h2 = new Point(10, 5);
         Line horizontal = new Line(h1, h2);

         System.out.println("Expected Result: 0.0");
         double slopeH = horizontal.slope();
         System.out.println("Calculation Final Result: "+ slopeH);






          // =============================================================
        // 4. VERTICAL LINE TEST (slope should be Infinity)
        // =============================================================
         System.out.println("\n=== Vertical Line Test ===\n");
         Point v1 = new Point(3, 0);
         Point v2 = new Point(3, 6);
         Line vertical = new Line(v1, v2);

         System.out.println("Expected Result: Infinity");
         double slopev = vertical.slope();
         System.out.println("Final Calculation Result: "+ slopev);




         // =============================================================
        // 5. POSITIVE SLOPE TEST
        // =============================================================

        System.out.println("\n=== Positive Slope Test ===\n");
        Point pos1 = new Point(0, 0);
        Point pos2 = new Point(4, 8);
        Line positive = new Line(pos1, pos2);

        double SlopeP = positive.slope();
        System.out.println("Expected Result: 2.0");
        System.out.println("Final Calculation Result: "+ SlopeP);



         // =============================================================
        // 6. NEGATIVE SLOPE TEST
        // =============================================================


        System.out.println("\n=== Negative Slope Test ===\n");
        Point neg1 = new Point(0, 10);
        Point neg2 = new Point(5, 0);
        Line negative = new Line(neg1, neg2);

        double slopeN = negative.slope();
        System.out.println("Expected Result: -2.0");
        System.out.println("Final Test Result: "+ slopeN);

        System.out.println("\nDemo complete!");









    }
}