package com.prt8;

import com.prt8.library_saya.*;

public class mulai {
    public static void main(String[] args) {
        game_class game = new game_class();
        game.deteksi_suhu(90);
        game.Team();
        game.game();
        game.tampil();
    }
}
