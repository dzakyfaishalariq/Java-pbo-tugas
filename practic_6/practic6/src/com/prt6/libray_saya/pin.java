package com.prt6.libray_saya;

import java.util.Scanner;

public class pin {
    private int pin;

    public pin(int pin) {
        this.pin = pin;
    }

    public void cek_pin() {
        // perulangan yang mengecek pin dengan while
        int i = 'y';
        while (i == 'y') {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan pin anda : ");
            int pin_user = input.nextInt();
            if (pin_user == pin) {
                System.out.println("Pin anda benar");
                break;
            } else {
                System.out.println("Pin anda salah");
                System.out.print("mau mengulang ? [y/t] : ");
                char y = input.next().charAt(0);
            }
        }

    }
}
