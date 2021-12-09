package com.access_modifier;

public class AccessModifier {
    private double radius;
    private String color;

    public AccessModifier() {
        radius = 1.0;
    }

    public AccessModifier(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
//    protected double getRadius() {
//        return this.radius;
//    }
//
//    protected double getArea(){
//        return Math.PI * Math.pow(this.radius,2);
//    }

//    private double getRadius() {
//        return this.radius;
//    }
//
//    private double getArea(){
//        return Math.PI * Math.pow(this.radius,2);
//    }
}
