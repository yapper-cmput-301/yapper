package com.example.myapplication;

public class Square extends Shape{
    private int side;

    // Constructor
    public Square(int side) {
        this.side = side;
    }

    public double area() {
        return side * side; // Area of a square = side^2
    }

}
