package Sulit;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di penghitung frekuensi elemen!");
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

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }

            boolean printed = false;
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    printed = true;
                    break;
                }
            }
            

            if (!printed) {
                System.out.println(array[i] + " muncul " + count + " kali");
            }
        }
        in.close();
    }
}
