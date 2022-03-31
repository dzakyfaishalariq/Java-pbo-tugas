package com.ecs3;

import com.ecs3.library_saya.process_a_name;
import java.util.Scanner;

public class mulai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.println("Inisial nama: " + process_a_name.inisial(nama));
    }
}
