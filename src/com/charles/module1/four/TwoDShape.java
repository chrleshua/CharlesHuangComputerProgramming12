package com.charles.module1.four;

public abstract class TwoDShape {
    double width;
    double height;
    Colour colour;
    public TwoDShape(double width, double height, Colour colour){
        this.width = width;
        this.height = height;
        this.colour = colour;
    }
    public TwoDShape() {
        width = 0;
        height = 0;
    }
    public abstract double getArea();
    public void setHeight(double height) {
        this.height = height;
    } //sets height
    public void setWidth(double width) {
        this.width = width;
    }//sets width
    public double getHeight(){
        return this.height;
    }//returns height as a double
    public double getWidth(){
        return this.width;
    }//returns the width as a double

}
