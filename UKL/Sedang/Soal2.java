package Sedang;

import java.util.Scanner;

public class Soal2 {
    static double volumeTabung(double r, double tinggi) {
        double phi = 3.14;
        double volume = phi * r * r * tinggi;
        return volume;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di kalkulator volume tabung!");
        System.out.print("Masukkan jari-jari tabung: ");
        double r = in.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        double tinggi = in.nextDouble();
        System.out.println("Volume tabung: " + volumeTabung(r, tinggi));
        in.close();
    }
}