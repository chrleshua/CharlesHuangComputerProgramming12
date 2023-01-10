package com.charles.module1.four;


public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;
    Colour colour;
    public Circle(double radius, Colour colour){
        this.radius = radius;
        this.colour = colour;
    }
    public double getArea(){
        return PI * Math.pow(radius,2);
    }//returns the area

    public String toString(){
        return "Shape: Circle, Radius: " + String.valueOf(radius) + ", Colour: " + String.valueOf(colour);
    }
}//returns a string containing the shape, radius, and colour of this shape
