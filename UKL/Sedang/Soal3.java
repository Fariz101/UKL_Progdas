package Sedang;

import java.util.Random;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Selamat Datang di Kuis Matematika!");

        boolean lanjut = true;

        while (lanjut) {

            int bilanganPertama = ran.nextInt(10);
            int bilanganKedua = ran.nextInt(10);
            int operator;
            double jawabanBenar = 0;
            String operatorString = "";

            System.out.println("Pilih jenis kuis! (berupa angka)\n1. Perkalian\n2. Pembagian\n3. Modulus");
            operator = in.nextInt();

            if (operator == 1) {
                operatorString = "*";
                jawabanBenar = bilanganPertama * bilanganKedua;
            } else if (operator == 2) {
                if (bilanganKedua == 0 || bilanganPertama == 0) {
                    bilanganKedua = 1;
                    bilanganPertama = 1;
                }

                operatorString = "/";
                jawabanBenar = (double) bilanganPertama / bilanganKedua;
            } else if (operator == 3) {
                operatorString = "%";
                jawabanBenar = bilanganPertama % bilanganKedua;
            }
            System.out.println("" + bilanganPertama + " " + operatorString + " " + bilanganKedua + " = ?");
            double jawabanPengguna = in.nextDouble();
            if (jawabanPengguna == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah! Jawaban yang benar adalah " + jawabanBenar);
            }
            System.out.print("Apakah Anda ingin melanjutkan kuis? (ya/tidak): ");
            String input = in.next();
            if (input.equalsIgnoreCase("tidak")) {
                lanjut = false;
            }
        }
        in.close();
    }
}