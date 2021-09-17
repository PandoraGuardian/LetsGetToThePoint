package org.example;

public class Point {

    //Points
    double x;
    double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // calculate distance
    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getY() - this.getY(), 2) + Math.pow(p.getX() - this.getX(), 2));

    }

    //X point info
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    //Y point info
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    //set points
    public void setPoint(double x, double y) {
        this.setX(x);
        this.setY(y);
    }


    public void shiftX(double n) {
        this.setX(this.getX() + n);

    }

    public void shiftY(double n) {
        this.setY(this.getY() + n);
    }

    //The math
    public void rotate(double rotation) {
        this.setX(this.getX() * Math.cos(rotation) - this.getY() * Math.sin(rotation));
        this.setY(this.getX() * Math.sin(rotation) + this.getY() * Math.cos(rotation));
    }

    //Print out
    public String toString() {
        return "Point {x = " + this.getX() + ", y = " + this.getY() + "}";
    }
}
