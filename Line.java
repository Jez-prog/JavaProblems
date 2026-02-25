/**
 * Line.java
 *
 * Represents a line segment defined by two Point objects
 * in the Cartesian plane.
 *
 * Demonstrates:
 *  - Composition (Line has two Points)
 *  - Encapsulation with private fields
 *  - Getters and Setters
 *  - Slope calculation
 *  - Handling special cases (vertical lines → infinity)
 *
 * @author Jezreel E. Guillermo (Github: Jeshz-Dev)
 */

public class Line {

    // =============================================================
    // INSTANCE VARIABLES
    // =============================================================
    private Point point1;
    private Point point2;



     // =============================================================
    // CONSTRUCTOR
    // =============================================================
    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
    }



     // =============================================================
    // GETTERS 
    // =============================================================
    public Point getPoint1(){
        return point1;
    }
    
    public Point getPoint2(){
        return point2;
    }




    // =============================================================
    // SETTERS 
    // =============================================================
    public void setPoint1(Point point1){
        this.point1 = point1;
    }

    public void setPoint2(Point point2){
        this.point2 = point2;
    }



     // =============================================================
    // SLOPE METHOD
    // formula: slope = (y2 - y1) / (x2 - x1)
    // =============================================================
    public double slope(){
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();

        double denom = (x2 - x1);

        if(denom == 0){
            return Double.POSITIVE_INFINITY;
        }

        return (y2 - y1) / denom;
    }









}