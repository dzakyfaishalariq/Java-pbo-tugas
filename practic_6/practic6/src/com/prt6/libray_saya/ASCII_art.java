package com.prt6.libray_saya;

public class ASCII_art {
    private int panjang;
    private int lebar;
    private int alas;
    private int tinggi;

    public ASCII_art(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public void rectangle() {
        for (int i = 0; i < this.panjang; i++) {
            if (i == 0 || i == this.panjang - 1) {
                for (int j = 0; j < this.lebar; j++) {
                    System.out.print("#");
                }
            } else {
                for (int j = 0; j < this.lebar; j++) {
                    if (j == 0 || j == this.lebar - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public void triangel() {
        for (int i = 0; i < this.tinggi; i++) {
            if (i == 0 || i == 1 || i == this.tinggi - 1) {
                for (int j = 0; j < i; j++) {
                    System.out.print("#");
                }
            } else {
                for (int j = 0; j < i; j++) {
                    if (j == 0 || j == i - 1) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
