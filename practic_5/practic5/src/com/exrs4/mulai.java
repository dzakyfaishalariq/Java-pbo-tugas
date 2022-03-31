package com.exrs4;

import com.exrs4.library_saya.colorRange;

public class mulai {
    public static void main(String[] args) {
        colorRange c = new colorRange();
        System.out.println("penentu warna : ");
        c.color();
        System.out.println("==========================================================");
        System.out.println("lampu lalulintas : ");
        c.LampuLalulintas();
        System.out.println("==========================================================");
        System.out.println("lampu lalulintas versi switch: ");
        c.LampuLalulintas_switch();
    }
}
