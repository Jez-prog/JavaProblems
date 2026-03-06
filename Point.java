/**
 * Point.java
 *
 * Represents a 2D point in the Cartesian plane.
 * Demonstrates:
 *  - Instance variables
 *  - Constructors (default and parameterized)
 *  - Getters and Setters
 *  - Distance calculation
 *  - Quadrant detection
 *
 * @author Jezreel E. Guillermo (Github: Jeshz-Dev)
 */



public class Point {

     // =========================================================
    // INSTANCE VARIABLES
    // =========================================================

    private double x;
    private double y;



    // =========================================================
    // CONSTRUCTORS
    // =========================================================

    /** Default constructor → point at origin (0,0) */
    public Point() {
        x = 0;
        y = 0;
    }

    /** Parameterized constructor */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

     // =========================================================
    // GETTERS
    // =========================================================

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }







    // =========================================================
    // SETTERS
    // =========================================================

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }








    // =========================================================
    // DISTANCE METHODS
    // =========================================================


    //Point p1 = new Point(-5, 6);
    //Point p2 = new Point(7, 5);
    /** Distance from this point to another point */
    public double distance(Point other){
        double deltaX = other.getX() - this.x;
        double deltaY = other.getY() - this.y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        
    }

    // =========================================================
    // QUADRANT METHOD
    // =========================================================
    public int getQuadrant(){
        if (x == 0.0 || y == 0.0){
            return 0;
        } else if(x > 0 && y > 0){
            return 1;
        }else if(x < 0 && y > 0){
            return 2;
        }else if(x < 0 && y < 0){
            return 3;
        }else{
            return 4;
        }
    }






}
