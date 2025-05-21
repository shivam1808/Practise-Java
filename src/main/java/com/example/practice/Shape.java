package com.example.practice;

sealed class Shape permits Circle, Square {
    void area() {
        System.out.println("Area");
    }
}

/*
    the final keyword will not allow Circle class to be inherited
*/
final class Circle extends Shape {
    void area() {
        System.out.println("Rectangle Area");
    }
}

/*
    non-sealed keyword will allow Square class to be inherited
*/
non-sealed class Square extends Shape {
    void area() {
        System.out.println("Square Area");
    }
}

/*
    Rectangle is not allowed in the sealed hierarchy
*/
/*class Rectangle extends Shape {
    void area() {
        System.out.println("Rectangle Area");
    }
}*/

/*
    non-sealed classes are allowed to be inherited
*/
class SquareChild extends Square {
    void area() {
        System.out.println("Square Child Area");
        super.area();
    }
}