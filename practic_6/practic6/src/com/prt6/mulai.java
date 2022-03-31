package com.prt6;

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
    }
}
