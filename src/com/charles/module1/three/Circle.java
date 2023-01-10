package com.charles.module1.three;


public class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public String toString() {
        return "Shape: Circle, Radius: " + String.valueOf(radius);
    }
}