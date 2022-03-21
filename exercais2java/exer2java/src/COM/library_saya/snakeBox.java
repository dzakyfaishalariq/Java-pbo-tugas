package COM.library_saya;

import java.util.Scanner;
import java.util.LinkedList;

public class snakeBox {
    private LinkedList<String> Barangpenjual = new LinkedList<String>();
    private LinkedList<String> BarangPembeli = new LinkedList<String>();
    private LinkedList<Integer> HargaBarang = new LinkedList<Integer>();
    private LinkedList<String> BarangKurir = new LinkedList<String>();
    private int jumlahBukuTulis;
    private int jumlahMejaBelajar;
    private int jumlahkomputer;
    private int jumlahtasSekolah;
    private int jumlahHarga;
    private int jumlahBarang;
    private int jumlahBarangTerjual;

    public snakeBox() {
        this.jumlahBukuTulis = 10;
        this.jumlahMejaBelajar = 10;
        this.jumlahkomputer = 10;
        this.jumlahtasSekolah = 10;
        this.jumlahHarga = 0;
        this.jumlahBarang = 40;
        this.jumlahBarangTerjual = 0;
    }

    public void pembeli() {
        int a = 0;
        char pilihan = 'y';
        while (pilihan == 'y') {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan nama barang ke-" + (a + 1) + " : ");
            String barang = input.nextLine();
            if (barang.equals("Buku Tulis")) {
                this.jumlahHarga += this.HargaBarang.get(0);
                this.jumlahBarangTerjual++;
                this.jumlahBukuTulis--;
            } else if (barang.equals("Meja Belajar")) {
                this.jumlahHarga += this.HargaBarang.get(1);
                this.jumlahBarangTerjual++;
                this.jumlahMejaBelajar--;
            } else if (barang.equals("Komputer")) {
                this.jumlahHarga += this.HargaBarang.get(2);
                this.jumlahBarangTerjual++;
                this.jumlahkomputer--;
            } else if (barang.equals("Tas Sekolah")) {
                this.jumlahHarga += this.HargaBarang.get(3);
                this.jumlahBarangTerjual++;
                this.jumlahtasSekolah--;
            } else {
                System.out.println("Barang tidak tersedia");
            }
            this.BarangPembeli.add(barang);
            System.out.print("Apakah anda ingin membeli lagi? (y/n)");
            pilihan = input.next().charAt(0);
            a++;
        }
        System.out.println("Sisa barang yang tersedia : ");
        System.out.println("Buku Tulis : " + this.jumlahBukuTulis);
        System.out.println("Meja Belajar : " + this.jumlahMejaBelajar);
        System.out.println("Komputer : " + this.jumlahkomputer);
        System.out.println("Tas Sekolah : " + this.jumlahtasSekolah);
    }

    public void pedagang() {
        // barang yang ada di dalam pedagang
        this.Barangpenjual.add("Buku tulis");
        this.Barangpenjual.add("Meja belajar");
        this.Barangpenjual.add("komputer");
        this.Barangpenjual.add("Tas sekolah");
        // harga barang yang ada di dalam pedagang
        this.HargaBarang.add(10000);
        this.HargaBarang.add(2000000);
        this.HargaBarang.add(6500000);
        this.HargaBarang.add(80000);
        // jumlah barang yang ada di dalam pedagang

        System.out.println("Silahkan memilih barang yang dibutuhkan!");
        System.out.println("[1] Buku Tulis            [2] Komputer");
        System.out.println("[3] Meja Belajar          [4] Tas Sekolah");
        System.out.println("Masukan pilihan anda : ");
    }

    public void kurir() {
        System.out.println("Barang anda yang akan dikirim : ");
        for (int i = 0; i < this.BarangPembeli.size(); i++) {
            System.out.println(this.BarangPembeli.get(i));
        }
        System.out.println("Jumlah barang yang dikirim : " + this.jumlahBarangTerjual);
        System.out.println("Total harga yang harus dibayar : " + this.jumlahHarga);
    }
}
