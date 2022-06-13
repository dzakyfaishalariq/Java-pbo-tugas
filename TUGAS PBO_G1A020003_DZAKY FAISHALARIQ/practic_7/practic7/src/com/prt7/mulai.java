package com.prt7;

import com.prt7.arcad_libray.*;
import java.util.Scanner;
/*
 * Nama practic : Exersais 7
 * Nama         : Dzaky Faishalariq
 * NPM          : G1A020003
 * Kelas        : Informatika A
 */
public class mulai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("->Masukan nama kartu anda : ");
        String kartuUser = input.nextLine();
        System.out.print("->Masukan nama kartu ke 2 anda : ");
        String kartuUser2 = input.nextLine();
        System.out.print("->Masukan uang anda untuk transaksi : ");
        int uang = input.nextInt();
        arcad obj = new arcad(kartuUser, kartuUser2, uang);
        obj.pilihNilaiKartu();
        obj.tampilkanKembalian();
        obj.memainkan_permainan();
        obj.transfer_saldo();
        obj.mintak_hadia1();
        obj.mintak_hadia2();
        obj.tampilkan_semua_nilaiKartu_anda();
    }
}
