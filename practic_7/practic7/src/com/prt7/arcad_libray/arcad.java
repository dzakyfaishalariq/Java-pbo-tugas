package com.prt7.arcad_libray;

import java.util.Scanner;

public class arcad {
    private int totalNilaiKartu;
    private String kartuUser;
    private int totalUangUser;
    private int[] hargaKart = new int[5];

    public arcad(String kartuUser, int totalUangUser) {
        this.kartuUser = kartuUser;
        this.totalNilaiKartu = 0;
        this.totalUangUser = totalUangUser;
        this.hargaKart[0] = 100;
        this.hargaKart[1] = 200;
        this.hargaKart[2] = 300;
        this.hargaKart[3] = 400;
        this.hargaKart[4] = 500;
    }

    public void pilihNilaiKartu() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih menu nilai kartu permainan yang di butuhkan!");
        System.out.println("1. poin = 100 harga = Rp. 10.000");
        System.out.println("2. poin = 200 harga = Rp. 15.000");
        System.out.println("3. poin = 300 harga = Rp. 20.000");
        System.out.println("4. poin = 400 harga = Rp. 25.000");
        System.out.println("5. poin = 500 harga = Rp. 30.000");
        System.out.print("Masukkan pilihan anda: ");
        int pilihan = input.nextInt();
        if (pilihan == 1) {
            this.totalUangUser -= 10000;
            this.totalNilaiKartu += this.hargaKart[0];
        } else if (pilihan == 2) {
            this.totalUangUser -= 15000;
            this.totalNilaiKartu += this.hargaKart[1];
        } else if (pilihan == 3) {
            this.totalUangUser -= 20000;
            this.totalNilaiKartu += this.hargaKart[2];
        } else if (pilihan == 4) {
            this.totalUangUser -= 25000;
            this.totalNilaiKartu += this.hargaKart[3];
        } else if (pilihan == 5) {
            this.totalUangUser -= 30000;
            this.totalNilaiKartu += this.hargaKart[4];
        } else {
            System.out.println("Pilihan tidak ada!");
        }
    }

    public void tampilkanKembalian() {
        if (this.totalUangUser <= 0) {
            System.out.println("Saldo anda bernilai 0");
            this.totalUangUser = 0;
        } else {
            System.out.println("Tampilan hasil transaksi");
            System.out.println("->Saldo anda bernilai     : " + this.totalUangUser);
            System.out.println("->Nilai kartu anda iyalah : " + this.totalNilaiKartu);
        }
    }

    public void memainkan_permainan(int pilih) {
        char p = 'y';
        while (p == 'y') {
            Scanner input = new Scanner(System.in);
            System.out.println("Selamat datang di menu pilihan permainan");
            System.out.println("Silahkan pilih beberapa permainan : ");
            System.out.println("[1]. Permainan bola 20 koin");
            System.out.println("[2]. Permainan pesawat 10 koin");
            System.out.println("[3]. Permainan kartu 5 koin");
            System.out.println("[4]. Permainan menari 5 koin");
            System.out.print("Masukkan pilihan anda: ");
            int pilihan = input.nextInt();
            switch (pilihan) {
                case 1:

                    break;
                case 2:

                    break;
                default:
                    System.out.println("Pilihan tidak ada!");
                    break;
            }
        }
    }
}
