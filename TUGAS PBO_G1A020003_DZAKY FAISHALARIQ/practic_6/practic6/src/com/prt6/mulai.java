package com.prt6;
/*
 * Nama practic : Exersais 6
 * Nama         : Dzaky Faishalariq
 * NPM          : G1A020003
 * Kelas        : Informatika A
 */
import java.util.Scanner;
import com.prt6.libray_saya.*;

public class mulai {
    public static void main(String[] args) {
        pin pin = new pin(12326);
        pin.cek_pin();
        System.out.println("=========================");
        System.out.print("Masukan kelipatan yang di ingginkan : ");
        Scanner input = new Scanner(System.in);
        int bil = input.nextInt();
        kelipatan kl = new kelipatan(bil);
        kl.cetak_kelipatan_bilangan();
        System.out.println("=========================");
        ASCII_art art = new ASCII_art(4, 10, 10);
        art.rectangle();
        art.triangel();
    }
}
