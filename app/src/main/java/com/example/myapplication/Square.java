package com.example.myapplication;

public class Square extends Shape{
    private int size_side;

    // Constructor
    public Square(int size_side) {
        this.size_side = size_side;
    }

    public double area() {
        return size_side * size_side; // Area of a square = side^2
    }

}
