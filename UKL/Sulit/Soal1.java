package Sulit;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        System.out.println("Selamat datang di penghitung rata-rata nilai Siswa!");
        System.out.println("Rata-Rata: " + hitungNilai(0));
    }

    static double hitungNilai (double rataRata){
        Scanner in = new Scanner(System.in);
        int siswa, jumlahSiswa;
        double nilai = 0, rataNilai = 0, temp = 0;
        System.out.println("Masukkan Jumlah Siswa: ");
        jumlahSiswa = in.nextInt();
        for (siswa = 1; siswa <= jumlahSiswa; siswa++) {
            System.out.println("Masukkan Nilai Siswa " + siswa);
            nilai = in.nextDouble();
            temp += nilai;
        }
        rataNilai = temp / jumlahSiswa;
        return rataNilai;
        
    }
}
