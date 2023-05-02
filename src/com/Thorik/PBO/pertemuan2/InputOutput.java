package com.Thorik.PBO.pertemuan2;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Umur Anda : ");
        int umur = scanner.nextInt();

        System.out.println("Selamat Pagi " + nama);
        System.out.println("Umur kamu sekarang adalah " + umur);
    }
}
