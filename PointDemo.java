/**
 * PointDemo.java
 *
 * Demonstrates the Point class features:
 * 1. Object creation
 * 2. Getters and setters
 * 3. Distance calculations
 * 5. Quadrant detection
 *
 * @author Jezreel E. Guillermo (Github: Jeshz-Dev)
 */

public class PointDemo {
    public static void main(String[] args) {

        // =============================================================
        // 1. OBJECT CREATION AND GETTERS
        // =============================================================

        Point origin = new Point(0, 0);
        Point p1 = new Point(-5, 6);
        Point p2 = new Point(7, 5);
        Point p6 = new Point(-3, -5);
        Point p7 = new Point(9, -3);

        System.out.println("\n=== Object Creation And Getters ===\n");
        System.out.println("Point 0: " + origin.getX() + ", " + origin.getY());
        System.out.println("Point 1: " + p1.getX() + ", " + p1.getY());
        System.out.println("Point 2: " + p2.getX() + ", " + p2.getY());
        System.out.println("Point 6: " + p6.getX() + ", " + p6.getY());
        System.out.println("Point 7: " + p7.getX() + ", " + p7.getY());
        


         // =============================================================
        // 2. SETTERS
        // =============================================================

        System.out.println("\n===============Before========\n");
        Point p4 = new Point(100, -200);
        System.out.println("Point 4: "+ p4.getX()+ ", "+ p4.getY());

        p4.setX(50);
        p4.setY(-50);

        System.out.println("\n=========After=========\n");
        System.out.println("Point 4: "+ p4.getX()+ ", "+ p4.getY());





          // =============================================================
        // 3. DISTANCE METHODS
        // =============================================================
        System.out.println("\n=== Distance Calculations ===\n");
        double result = p1.distance(p2); 
        System.out.println("The distance from p1 and p2 is: "+ result);

        
         // =============================================================
        // 4. QUADRANT DETECTION
        // =============================================================
        int quad1 = p1.getQuadrant();
        int quad2 = p2.getQuadrant();
        int quad6 = p6.getQuadrant();
        int quad7 = p7.getQuadrant();
        int quad0 = origin.getQuadrant();



        System.out.println("\n=== Quadrants ===\n");
        System.out.println("The quadrant of origin is: "+ quad0+ ", On Axis.");
        System.out.println("The quadrant of p1 is: "+ quad1+ ", Northwest.");
        System.out.println("The quadrant of p2 is: "+ quad2+ ", Northeast.");
        System.out.println("The quadrant of p6 is: "+ quad6+ ", Southwest.");
        System.out.println("The quadrant of p7 is: "+ quad7+ ", Southeast.");








         System.out.println("\nDemo complete.");

    }
}
