package com.access_modifier;

public class Main {
    public static void main(String[] args) {
        AccessModifier circle1 = new AccessModifier();
        AccessModifier circle2 = new AccessModifier(5,"blue");
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle2.getRadius());
        System.out.println(circle2.getArea());

    }
}
