package com.charles.module1.four;


public class Main {
    public static void main(String[] args) {
        TwoDShape circle1 = new Circle(2, Colour.RED);
        TwoDShape circle2 = new Circle(3, Colour.BLUE);
        TwoDShape triangle1 = new Triangle(2, 3, 4, Colour.GREEN);
        TwoDShape triangle2 = new Triangle(9, 10, 11, Colour.NONE);
        if (triangle1 instanceof Triangle){
            ((Triangle) triangle1).rotate90();
        }
        if (triangle2 instanceof  Triangle){
            ((Triangle) triangle2).rotate(12);
        }

        TwoDShape[] shapes = {circle1, circle2, triangle1, triangle2};
        for (TwoDShape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.getArea());
        }
    }
}
