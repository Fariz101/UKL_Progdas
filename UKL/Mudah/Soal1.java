package Mudah;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        int jarakTempuh, berat, volume, tinggi, lebar, panjang;
        double totalBiaya = 0, hargaPerKg = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di kalkulator biaya pengantaran barang!");
        System.out.print("Masukkan jarak tempuh (km): ");
        jarakTempuh = in.nextInt();
        System.out.print("Masukkan berat barang (kg): ");
        berat = in.nextInt();
        System.out.print("Masukkan tinggi barang (cm): ");
        tinggi = in.nextInt();
        System.out.print("Masukkan lebar barang (cm): ");
        lebar = in.nextInt();
        System.out.print("Masukkan panjang barang (cm): ");
        panjang = in.nextInt();

        if (jarakTempuh <= 10) {
            hargaPerKg = 4250;
        } else if (jarakTempuh > 10 && jarakTempuh <= 20) {
            hargaPerKg = 6000;
        } else if (jarakTempuh > 20) {
            hargaPerKg = 8000;
        }
        totalBiaya = hargaPerKg * berat;
        volume = tinggi * lebar * panjang;
        if (volume > 100) {
            totalBiaya += 50000;
        }
        System.out.println("Total biaya pengiriman: Rp " + totalBiaya);
        in.close();

    }
    
}
