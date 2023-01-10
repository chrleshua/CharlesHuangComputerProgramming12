package com.charles.module1.two;

public class Triangle extends TwoDShape {
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
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public String toString() {
        return "Shape: Triangle, Side Lengths: " + String.valueOf(side1) + ", " +String.valueOf(side2) + ", " + String.valueOf(side1);
    }
}
