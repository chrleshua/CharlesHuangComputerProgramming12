package com.charles.module1.three;


public class Triangle implements Rotate {
    double side1;
    double side2;
    double side3;
    public Triangle(double width, double height){
    }
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    private double heronsHeight(){
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return 2*area/side2;
    } //returns the height of a triangle using herons formula
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    } //returns the area of the triangle
    public String toString() {
        return "Shape: Triangle, Side Lengths: " + String.valueOf(side1) + ", " +String.valueOf(side2) + ", " + String.valueOf(side1);
    } //returns a string containing the shape and side lengths of this shape

    @Override
    public void rotate90() {

    }

    @Override
    public void rotate180() {

    }

    @Override
    public void rotate(double degree) {

    }
}
