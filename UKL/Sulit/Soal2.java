package Sulit;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di pengecek elemen yang duplikat!");
        System.out.println("Masukkan panjang elemen array: ");
        int panjang = in.nextInt();

        int[] array = new int[panjang];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Masukkan nilai ke-" + (i + 1) + ":");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        boolean duplikat = cekDuplikat(array);
        if (!duplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
        in.close();
    }

    static boolean cekDuplikat(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print("Array memiliki elemen duplikat: " + array[i]);
                    return true;
                }
            }
        }
        return false;
    }
}
