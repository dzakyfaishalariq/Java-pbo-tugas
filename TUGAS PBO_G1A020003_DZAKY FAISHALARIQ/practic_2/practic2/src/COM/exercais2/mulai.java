package COM.exercais2;

/*
 * Nama practic : Exersais 2
 * Nama         : Dzaky Faishalariq
 * NPM          : G1A020003
 * Kelas        : Informatika A
 */
import COM.library_saya.asciiArt;
import COM.library_saya.snakeBox;
import java.util.Scanner;

public class mulai {
    public static void main(String[] args) {
        asciiArt art = new asciiArt();
        snakeBox box = new snakeBox();
        Scanner input = new Scanner(System.in);
        System.out.println("Silahkan Pilih Menu : ");
        System.out.println("1. pobrelm 1");
        System.out.println("2. pobrelm 2");
        System.out.println("3. pobrelm 3");
        System.out.print("masukan pilihan anda : ");
        char pilihan = input.next().charAt(0);
        if (pilihan == '1') {
            // poblem 1
            art.gambar1('#');
        } else if (pilihan == '2') {
            // poblem 2
            art.gambar2();
        } else if (pilihan == '3') {
            // objek 1
            box.pedagang();
            // objek 2
            box.pembeli();
            // objek 3
            box.kurir();
        } else {
            System.out.println("pilihan anda salah");
        }
    }
}
