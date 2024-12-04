package Mudah;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di penentu bilangan Ganjil atau Genap!");
        System.out.println("Masukkan Bilangan: ");
        int bilangan = in.nextInt();
        if (bilangan % 2 == 1) {
            System.out.println(bilangan + " Bilangan Ganjil");
        } else {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " Bilangan Genap");
            } else {
                System.out.println("Error");
            }
        }
        in.close();
    }
}
