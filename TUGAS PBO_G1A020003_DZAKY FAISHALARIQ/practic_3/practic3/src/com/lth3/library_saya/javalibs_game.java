package com.lth3.library_saya;

import javax.swing.JOptionPane;

public class javalibs_game {
    private String nama;

    public void inputnama() {
        this.nama = JOptionPane.showInputDialog("Masukkan nama anda : ");
        JOptionPane.showMessageDialog(null,
                "Computer : Hallo " + nama + " nama anda sudah masuk kedalam pemikiran saya");
    }

    public void kalkulator(double x, double ybil1, char opr) {
        double hasil = 0;
        switch (opr) {
            case '+':
                hasil = x + ybil1;
                break;
            case '-':
                hasil = x - ybil1;
                break;
            case '*':
                hasil = x * ybil1;
                break;
            case '/':
                hasil = x / ybil1;
                break;
            case '%':
                hasil = x % ybil1;
                break;
            default:
                System.out.println("Operator tidak dikenali");
                break;
        }
        JOptionPane.showMessageDialog(null, "Hasil dari " + x + " " + opr + " " + ybil1 + " adalah " + hasil);
    }

    public void bangun_ruang(double a, double b) {
        double luas = a * b;
        double keliling = 2 * (a + b);
        JOptionPane.showMessageDialog(null, "Luas persegi panjang adalah " + luas + " dan kelilingnya adalah "
                + keliling);
    }

    public void penentu_bilangan_ganjil_genab() {
        int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan : "));
        if (bilangan % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Bilangan " + bilangan + " adalah bilangan genap");
        } else {
            JOptionPane.showMessageDialog(null, "Bilangan " + bilangan + " adalah bilangan ganjil");
        }
    }

    public void penentu_bilangan_prima() {
        int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan : "));
        int i, j;
        for (i = 2; i < bilangan; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (i == j) {
                JOptionPane.showMessageDialog(null, "Bilangan prima");
            }
        }
    }

    public void penentu_bilangan_polindrome() {
        int bilangan = Integer.parseInt(JOptionPane.showInputDialog("Masukkan bilangan : "));
        int i, j, k;
        i = 0;
        j = 1;
        k = bilangan;
        while (bilangan != 0) {
            i = bilangan % 10;
            bilangan = bilangan / 10;
            j = j * 10 + i;
        }
        if (k == j) {
            JOptionPane.showMessageDialog(null, "Bilangan polindrome");
        } else {
            JOptionPane.showMessageDialog(null, "Bilangan bukan polindrome");
        }
    }

    public void mengeluarkan_jumlah_digit_bilangan(int bilangan) {
        int array[] = new int[10];
        int k = 0;
        int i = 0;
        while (bilangan != 0) {
            k = bilangan % 10;
            bilangan = bilangan / 10;
            array[i] = k;
            i++;
        }
        int jumlah = 0;
        for (int j = 0; j < array.length; j++) {
            jumlah = jumlah + array[j];
        }
        JOptionPane.showMessageDialog(null, "Jumlah bilangan adalah : " + jumlah);
    }

    public void kebenaran_bilangan_doubel(double bilangan) {
        if (bilangan == 0) {
            JOptionPane.showMessageDialog(null, "Bilangan 0 adalah bilangan kebenaran");
        } else if (bilangan > 0) {
            JOptionPane.showMessageDialog(null, "Bilangan " + bilangan + " adalah bilangan kebenaran");
        } else {
            JOptionPane.showMessageDialog(null, "Bilangan " + bilangan + " adalah bilangan negatif");
        }
    }

    public void tebak_angka(int angka) {
        // bilangan random
        int bilangan = (int) (Math.random() * 10);
        if (bilangan == angka) {
            JOptionPane.showMessageDialog(null, "Tebakan anda benar");
        } else {
            JOptionPane.showMessageDialog(null, "Tebakan anda salah");
        }
    }

    public void bilangan_acak() {
        int bilangan = (int) (Math.random() * 10);
        JOptionPane.showMessageDialog(null, "Bilangan acak adalah : " + bilangan);
    }

    public void conversi_nilai(int nilai) {
        if (nilai <= 100 && nilai >= 90) {
            JOptionPane.showMessageDialog(null, "Nilai anda A");
        } else if (nilai < 90 && nilai >= 80) {
            JOptionPane.showMessageDialog(null, "Nilai anda B");
        } else if (nilai < 80 && nilai >= 70) {
            JOptionPane.showMessageDialog(null, "Nilai anda C");
        } else if (nilai < 70 && nilai >= 60) {
            JOptionPane.showMessageDialog(null, "Nilai anda D");
        } else if (nilai < 60 && nilai >= 50) {
            JOptionPane.showMessageDialog(null, "Nilai anda E");
        } else {
            JOptionPane.showMessageDialog(null, "Nilai anda E");
        }
    }

    // main mulai
    public void interaksi() {
        JOptionPane.showMessageDialog(null,
                "Computer : Silahkan pilih beberapa menu dibawah ini\n1. Kalkulator\n2. Rumus hitung bangun ruang persegi panjang\n3. penentu bilangan ganjil-genab\n4. penentu bilangan prima\n5. penentu bilangan polindrom\n6. mengeluarakan dijit bilangan\n7. mengeluarkan kebenaran bilangan doubel\n8. permainan tebak angka\n9. mengeluarkan bilangan acak\n10. conversi nilai");
        int pilih = Integer.parseInt(JOptionPane.showInputDialog("Masukkan pilihan anda : "));
        if (pilih == 1) {
            String bil1 = JOptionPane.showInputDialog("Masukkan bilangan pertama : ");
            String bil2 = JOptionPane.showInputDialog("Masukkan bilangan kedua : ");
            String opr = JOptionPane
                    .showInputDialog("Pilih operasi\n1. +\n2. -\n3. /\n4. *\n5. %\nMasukkan operator : ");
            double x = Double.parseDouble(bil1);
            double ybil1 = Double.parseDouble(bil2);
            char opr1 = opr.charAt(0);
            kalkulator(x, ybil1, opr1);
        } else if (pilih == 2) {
            String panjang = JOptionPane.showInputDialog("Masukkan panjang : ");
            String lebar = JOptionPane.showInputDialog("Masukkan lebar : ");
            double x = Double.parseDouble(panjang);
            double y = Double.parseDouble(lebar);
            bangun_ruang(x, y);
        } else if (pilih == 3) {
            penentu_bilangan_ganjil_genab();
        } else if (pilih == 4) {
            penentu_bilangan_prima();
        } else if (pilih == 5) {
            penentu_bilangan_polindrome();
        } else if (pilih == 6) {
            String bilangan = JOptionPane.showInputDialog("Masukkan bilangan : ");
            int i = Integer.parseInt(bilangan);
            mengeluarkan_jumlah_digit_bilangan(i);
        } else if (pilih == 7) {
            String bilangan = JOptionPane.showInputDialog("Masukkan bilangan : ");
            double i = Double.parseDouble(bilangan);
            kebenaran_bilangan_doubel(i);
        } else if (pilih == 8) {
            String bilangan = JOptionPane.showInputDialog("Masukkan bilangan : ");
            int i = Integer.parseInt(bilangan);
            tebak_angka(i);
        } else if (pilih == 9) {
            bilangan_acak();
        } else if (pilih == 10) {
            String bilangan = JOptionPane.showInputDialog("Masukkan bilangan : ");
            int i = Integer.parseInt(bilangan);
            conversi_nilai(i);
        } else {
            JOptionPane.showMessageDialog(null, "Maaf pilihan anda salah");
        }
    }
}
