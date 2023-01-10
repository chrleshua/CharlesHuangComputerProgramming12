package com.charles.module1.two;

public abstract class TwoDShape {
    double width;
    double height;
    public TwoDShape(double width, double height){
        this.width = width;
        this.height = height;
    }
    public TwoDShape() {
        width = 0;
        height = 0;
    }
    public abstract double getArea();
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public double getWidth(){
        return this.width;
    }

}
