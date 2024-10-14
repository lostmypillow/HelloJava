package com.lost;

public class Circle {
    // A class field

    public static final double PI = 3.14159;

    // A useful constant
    // A class method: just compute a value based on the arguments

    public static double radiansToDegrees(double radians) {
        return radians * 180 / PI;
    }

    // An instance field

    protected double r;

    // The constructor: initialize the radius field

    public Circle(double r) {
        this.r = r;
    }

    // Two instance methods: operate on an object's instance fields
    // Compute the area of the circle

    public double area() {
        return PI * r * r;
    }

    // Compute the circumference of the circle

    public double circumference() {
        return 2 * PI * r;
    }

    // How many degrees is 2.0 radians?
    double d = Circle.radiansToDegrees(2.0);

    int x = 1;

    private String name;

    public static final int DAYS_PER_WEEK = 7;
    String[] daynames = new String[DAYS_PER_WEEK];

    private int a = 17, b = 37, c = 53;

}
