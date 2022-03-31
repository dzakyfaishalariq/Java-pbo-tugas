package com.exrs4.library_saya;

import java.util.Scanner;

public class colorRange {
    public void color() {
        char a = 'y';
        while (a == 'y') {
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Enter a color code : ");
                int col = input.nextInt();
                if (col >= 380 && col <= 450) {
                    System.out.println("The color is violet");
                } else if (col >= 450 && col <= 495) {
                    System.out.println("The color is blue");
                } else if (col >= 495 && col <= 570) {
                    System.out.println("The color is green");
                } else if (col >= 570 && col <= 590) {
                    System.out.println("The color is yellow");
                } else if (col >= 590 && col <= 620) {
                    System.out.println("The color is orange");
                } else if (col >= 620 && col <= 750) {
                    System.out.println("The color is red");
                } else {
                    System.out.println("The color is not in the range");
                }
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("The entered wavelength is not a part of the visible spectrum");
                continue;
            }
            System.out.print("Do you want to continue? (y/n) : ");
            a = input.next().charAt(0);
        }
    }

    public void LampuLalulintas() {
        char a = 'y';
        while (a == 'y') {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a color code : ");
            int col = input.nextInt();
            if (col == 1) {
                System.out.println("Next Traffic Light is green");
            } else if (col == 2) {
                System.out.println("Next Traffic Light is yellow");
            } else if (col == 3) {
                System.out.println("Next Traffic Light is red");
            } else {
                System.out.println("invalid color");
            }
            System.out.print("Do you want to continue? (y/n) : ");
            a = input.next().charAt(0);
        }
    }

    public void LampuLalulintas_switch() {
        char a = 'y';
        while (a == 'y') {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a color code : ");
            int col = input.nextInt();
            switch (col) {
                case 1:
                    System.out.println("Next Traffic Light is green");
                    break;
                case 2:
                    System.out.println("Next Traffic Light is yellow");
                    break;
                case 3:
                    System.out.println("Next Traffic Light is red");
                    break;
                default:
                    System.out.println("invalid color");
                    break;
            }
            System.out.print("Do you want to continue? (y/n) : ");
            a = input.next().charAt(0);
        }
    }
}
