package com.prt7;

import com.prt7.arcad_libray.*;
import java.util.Scanner;

public class mulai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("->Masukan nama kartu anda : ");
        String kartuUser = input.nextLine();
        System.out.print("->Masukan uang anda untuk transaksi : ");
        int uang = input.nextInt();
        arcad obj = new arcad(kartuUser, uang);
        obj.pilihNilaiKartu();
        obj.tampilkanKembalian();
    }
}
