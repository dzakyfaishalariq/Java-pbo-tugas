package com.ecs3;

import java.util.Scanner;
import com.ecs3.library_saya.computerMethods;

public class mulai {
    public static void main(String[] args) {
        computerMethods obj = new computerMethods();
        Scanner input = new Scanner(System.in);
        // pobrelem 1
        System.out.print("Masukkan suhu dalam Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celcius = obj.fToC(fahrenheit);
        System.out.println("Suhu dalam Celcius: " + celcius);
        System.out.println("==========================================");
        System.out.println("Masukkan panjang sisi segitiga: ");
        System.out.print("Sisi Kanan : ");
        double a = input.nextDouble();
        System.out.print("Sisi Kiri : ");
        double b = input.nextDouble();
        double c = obj.hypotenuse(a, b);
        System.out.println("Panjang sisi miring segitiga: " + c);
        System.out.println("==========================================");
        System.out.println("Jumlah dadu : " + obj.rolldadu());
    }
}
