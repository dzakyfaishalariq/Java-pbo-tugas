package com.prt6.libray_saya;

public class kelipatan {
    private int bilangan;

    public kelipatan(int bilangan) {
        this.bilangan = bilangan;
    }

    public void cetak_kelipatan_bilangan() {
        // perulangan
        int bantu;
        System.out.println("Kelipatan : " + this.bilangan);
        System.out.println("===========");
        for (int i = 0; i < 12; i++) {
            bantu = (i + 1) * this.bilangan;
            System.out.println("Kelipatan " + (i + 1) + " : " + bantu);
        }
    }
}
