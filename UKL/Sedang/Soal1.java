package Sedang;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di kalkulator Faktorial!");
        System.out.print("Masukkan bilangan bulat positif: ");
        int angka = in.nextInt();
        System.out.println("Faktorial dari " + angka + " adalah " + faktorial(angka));
        in.close();

    }

    static long faktorial(int angka) {
        long faktorial = 1;
        for (int i = 1; i <= angka; i++) {
            faktorial = faktorial * i;
        }
        return faktorial;
    }
}
