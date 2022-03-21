package COM.exercais2;

import COM.library_saya.asciiArt;
import COM.library_saya.snakeBox;

public class mulai {
    public static void main(String[] args) {
        asciiArt art = new asciiArt();
        System.out.println("Silahkan Pilih Menu : ");
        // poblem 1
        art.gambar1('#');
        // poblem 2
        for (int a = 0; a < 20; a++) {
            System.out.print("=");
        }
        System.out.println();
        art.gambar2();
        // poblem 3
        for (int a = 0; a < 20; a++) {
            System.out.print("=");
        }
        System.out.println();
        System.out.println("Problem 3  ");
        snakeBox box = new snakeBox();
        // objek 1
        box.pedagang();
        // objek 2
        box.pembeli();
        // objek 3
        box.kurir();
    }
}
