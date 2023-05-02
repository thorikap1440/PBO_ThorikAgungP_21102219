package com.Thorik.PBO.pertemuan3.Unguided2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Buku bk1 = new Buku(1, "Pemrograman Berbasis Objek dengan Java", "Indrajani", 2007, 70000);
        Buku bk2 = new Buku(2, "Dasar Pemrograman Java", "Abdul Kadir", 2004, 30000);

        System.out.println("=== List Buku ===");
        bk1.showInfo();
        bk2.showInfo();

        System.out.println("=== List Buku ===");
        System.out.print("Masukkan No Buku yang ingin dibeli     : ");
        int pilih = scanner.nextInt();
        System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
        int jumlah = scanner.nextInt();

        if (pilih == 1) {
            int totalHarga = bk1.getHarga() * jumlah;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukkan Jumlah uang : ");
            int bayar = scanner.nextInt();

            System.out.println();
            if (bayar <= totalHarga) {
                System.out.println("Mohon maaf uang anda tidak cukup");
            } else {
                System.out.println("=== Rincian pembelian buku ===");
                bk1.showInfo();
                System.out.println("=== Rincian Pembayaran ===");
                System.out.println("Jumlah Bayar : " + bayar);
                System.out.println("Kembalian    : " + (bayar-totalHarga));
            }
        } else if (pilih == 2) {
            int totalHarga = bk2.getHarga() * jumlah;
            System.out.println("Total Harga = " + totalHarga);
            System.out.print("Masukkan Jumlah uang :");
            int bayar = scanner.nextInt();

            System.out.println();
            if (bayar <= totalHarga) {
                System.out.println("Mohon maaf uang anda tidak cukup");
            } else {
                System.out.println("=== Rincian pembelian buku ===");
                bk1.showInfo();
                System.out.println("=== Rincian Pembayaran ===");
                System.out.println("Jumlah Bayar : " + bayar);
                System.out.println("Kembalian    : " + (bayar-totalHarga));
            }
        } else {
            System.out.println("Pilihan Tidak Tersedia");
        }
    }
}
