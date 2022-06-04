package com.prt8.library_saya;

import java.util.Random;

public class game_class {

    private int[] team = new int[8];
    private int[] suhu = new int[4];

    public game_class() {
        this.team[0] = 1;
        this.team[1] = 2;
        this.team[2] = 3;
        this.team[3] = 4;
        this.team[4] = 5;
        this.team[5] = 6;
        this.team[6] = 7;
        this.team[7] = 8;
        // ============ Suhu =====================
        this.suhu[0] = 90;
        this.suhu[1] = 90;
        this.suhu[2] = 35;
        this.suhu[3] = 35;
    }

    public void deteksi_suhu(int suhu) {
        if (suhu > 30) {
            System.out.println("Season is over");
        } else {
            System.out.println("Too cold to play");
        }
    }

    public void Team() {
        Random rand = new Random();
        for (int i = 1; i <= 4; i++) {
            int wins = rand.nextInt(2);
            int losses = rand.nextInt(2);
            int ties = rand.nextInt(2);
            int points_Scored = rand.nextInt(10);
            int points_Allowed = rand.nextInt(10);
            System.out.println("Wins: " + wins + " Losses: " + losses + " Ties: " + ties + "\nPoints Scored: "
                    + points_Scored + " Points Allowed: " + points_Allowed);
        }
    }

    public void game() {
        Random rand = new Random();
        for (int i = 1; i <= 4; i++) {
            System.out.println("Game #" + i);
            System.out.println("Temperature: " + this.suhu[i - 1]);
            int team1 = rand.nextInt(4);
            int team2 = rand.nextInt(4);
            if (team1 == team2) {
                continue;
            } else {
                System.out.println("Away Team: " + this.team[rand.nextInt(8)] + ", "
                        + rand.nextInt(8));
                System.out.println("Home Team: " + this.team[rand.nextInt(8)] + ", "
                        + rand.nextInt(8));
            }
        }
    }

    public void tampil() {
        // mencari nilai tertingi di array Suhu
        int max = suhu[0];
        for (int i = 1; i < this.suhu.length; i++) {
            if (this.suhu[i] > max) {
                max = suhu[i];
            }
        }
        // mencari rata rata array suhu
        int sum = 0;
        for (int i = 0; i < this.suhu.length; i++) {
            sum += this.suhu[i];
        }
        double avg = sum / this.suhu.length;
        System.out.println("Suhu tertinggi pertandingan : " + max);
        System.out.println("Suhu rata-rata pertandingan: " + avg);
    }
}
