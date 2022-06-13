package com.ecs3.library_saya;

public class process_a_name {
    // membuat inisial nama
    public static String inisial(String nama) {
        String[] nama_split = nama.split(" ");
        String inisial = "";
        for (int i = nama_split.length - 1; i >= 0; i--) {
            if (i == nama_split.length - 1) {
                inisial += nama_split[i] + ", ";
            } else if (i == 0) {
                inisial += nama_split[i].charAt(0) + ".";
            }
        }
        return inisial;
    }
}
