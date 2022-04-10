package com.prt7.arcad_libray;

import java.util.Scanner;

public class arcad {
    private int totalNilaiKartu;
    private int totalNilaiKartu2;
    private String kartuUser;
    private String kartuUser2;
    private int totalUangUser;
    private int[] hargaKart = new int[5];

    public arcad(String kartuUser, String kartuUser2, int totalUangUser) {
        this.kartuUser = kartuUser;
        this.kartuUser2 = kartuUser2;
        this.totalNilaiKartu = 0;
        this.totalNilaiKartu2 = 0;
        this.totalUangUser = totalUangUser;
        this.hargaKart[0] = 100;
        this.hargaKart[1] = 200;
        this.hargaKart[2] = 300;
        this.hargaKart[3] = 400;
        this.hargaKart[4] = 500;
    }

    public void pilihNilaiKartu() {
        System.out.println("================================================================");
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
        System.out.println("================================================================");
        if (this.totalUangUser <= 0) {
            System.out.println("Saldo anda bernilai 0");
            this.totalUangUser = 0;
        } else {
            System.out.println("Tampilan hasil transaksi");
            System.out.println("->Saldo anda bernilai     : " + this.totalUangUser);
            System.out.println("->Nilai kartu anda iyalah : " + this.totalNilaiKartu);
        }
    }

    public void memainkan_permainan() {
        System.out.println("================================================================");
        char p = 'y';
        while (p == 'y') {
            Scanner input = new Scanner(System.in);
            System.out.println("Selamat datang di menu pilihan permainan");
            System.out.println("Silahkan pilih beberapa permainan : ");
            System.out.println("[1]. Permainan bola 20 koin");
            System.out.println("[2]. Permainan pesawat 10 koin");
            System.out.println("[3]. Permainan kartu 5 koin");
            System.out.println("[4]. Permainan menari 5 koin");
            if (this.totalNilaiKartu > 0) {
                System.out.print("Masukkan pilihan anda: ");
                int pilihan = input.nextInt();
                switch (pilihan) {
                    case 1:
                        System.out.println("Anda memilih permainan bola 20 koin");
                        System.out.println("Silahkan masukkan jumlah koin yang ingin anda gunakan ! ");
                        System.out.print("status transaksi -> ");
                        this.totalNilaiKartu -= 20;
                        System.out.println("transaksi berhasil");
                        break;
                    case 2:
                        System.out.println("Anda memilih permainan pesawat 10 koin");
                        System.out.println("Silahkan masukkan jumlah koin yang ingin anda gunakan ! ");
                        System.out.print("status transaksi -> ");
                        this.totalNilaiKartu -= 10;
                        System.out.println("transaksi berhasil");
                        break;
                    case 3:
                        System.out.println("Anda memilih permainan kartu 5 koin");
                        System.out.println("Silahkan masukkan jumlah koin yang ingin anda gunakan ! ");
                        System.out.print("status transaksi -> ");
                        this.totalNilaiKartu -= 5;
                        System.out.println("transaksi berhasil");
                        break;
                    case 4:
                        System.out.println("Anda memilih permainan menari 5 koin");
                        System.out.println("Silahkan masukkan jumlah koin yang ingin anda gunakan ! ");
                        System.out.print("status transaksi -> ");
                        this.totalNilaiKartu -= 5;
                        System.out.println("transaksi berhasil");
                        break;
                    default:
                        System.out.println("Pilihan tidak ada!");
                        break;
                }
                System.out.println("total koin anda adalah : " + this.totalNilaiKartu);
            } else {
                System.out.println("Anda tidak memiliki koin yang cukup untuk memainkan permainan");
                System.out.println("Silahkan isi ulang koin anda");
            }
            System.out.print("Apakah anda ingin memainkan permainan lagi ? (y/n) : ");
            p = input.next().charAt(0);
        }
    }

    public void transfer_saldo() {
        System.out.println("================================================================");
        Scanner a = new Scanner(System.in);
        System.out.println("Silahkan masukkan jumlah saldo yang ingin anda transfer di koin kartu anda");
        System.out.print("Masukkan jumlah saldo yang ingin anda transfer : ");
        int saldo = a.nextInt();
        this.totalNilaiKartu -= saldo;
        if (this.totalNilaiKartu > 0) {
            this.totalNilaiKartu2 += saldo;
            System.out.println("Transaksi berhasil");
            System.out.println("Saldo anda bernilai               : " + this.totalNilaiKartu);
            System.out.println("Saldo anda di kartu lain bernilai : " + this.totalNilaiKartu2);
        } else {
            System.out.println("Anda tidak memiliki koin yang cukup untuk melakukan transfer");
        }
    }

    public void mintak_hadia1() {
        System.out.println("================================================================");
        System.out.println("Anda memiliki hadiah 1 dengan penambahan saldo koin 200");
        this.totalNilaiKartu2 += this.hargaKart[1];
        System.out.println("Saldo kartu 2  anda bernilai :  " + this.totalNilaiKartu2);
    }

    public void mintak_hadia2() {
        System.out.println("================================================================");
        System.out.println("Anda memiliki hadiah 2 dengan penambahan saldo koin 100");
        this.totalNilaiKartu += this.hargaKart[0];
        System.out.println("Saldo kartu 1  anda bernilai :  " + this.totalNilaiKartu);
    }

    public void tampilkan_semua_nilaiKartu_anda() {
        System.out.println("================================================================");
        System.out.println("Nama kartu pertama anda     : " + this.kartuUser);
        System.out.println("Nama kartu kedua anda       : " + this.kartuUser2);
        System.out.println("Saldo kartu 1 anda bernilai : " + this.totalNilaiKartu);
        System.out.println("Saldo kartu 2 anda bernilai : " + this.totalNilaiKartu2);
        System.out.println("Saldo uang anda bernilai    : " + this.totalUangUser);
    }
}
