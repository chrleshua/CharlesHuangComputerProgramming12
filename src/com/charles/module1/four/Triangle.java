package com.charles.module1.four;


public class Triangle extends TwoDShape implements Rotate {
    double side1;
    double side2;
    double side3;
    Colour colour;
    double rotation;
//    public Triangle(double width, double height, Colour colour){
//    }
    public Triangle(double side1, double side2, double side3, Colour colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.colour = colour;
    }

    public double heronsHeight() {
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return 2*area/side2;
    } //returns the height of a triangle using herons formula
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    } //returns the area of the triangle
    public String toString() {
        return "Shape: Triangle, Side Lengths: " + String.valueOf(side1) + ", " +String.valueOf(side2) + ", " + String.valueOf(side1) + ", Colour: " + String.valueOf(colour) + ", Rotation: " + String.valueOf(rotation);
    } //returns a string containing the shape, side lengths, colour, and rotation of this shape

    @Override
    public void rotate90() {
        rotation += 90;
    }

    @Override
    public void rotate180() {
        rotation += 180;
    }

    @Override
    public void rotate(double degree) {
        rotation += degree;
    }
}
