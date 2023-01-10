package com.charles.module1.two;



public class Main {
    public static void main(String[] args) {
        TwoDShape circle1 = new Circle(2);
        TwoDShape circle2 = new Circle(3);
        TwoDShape triangle1 = new Triangle(2,3,4);
        TwoDShape triangle2 = new Triangle(9,10,11);
        TwoDShape[] shapes = {circle1,circle2,triangle1,triangle2};
        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());

        }

    }
}
