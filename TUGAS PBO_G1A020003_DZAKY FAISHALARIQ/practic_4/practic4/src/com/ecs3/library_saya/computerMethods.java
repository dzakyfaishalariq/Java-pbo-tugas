package com.ecs3.library_saya;

public class computerMethods {
    public double fToC(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double hypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public int rolldadu() {
        int nilai = (int) (Math.random() * 6) + 1;
        int nilai2 = (int) (Math.random() * 6) + 1;
        return nilai + nilai2;
    }
}
