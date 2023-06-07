package com.Thorik.PBO.Pertemuan6.Unguided1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static int jumlahBilangan(int bil1, int bil2) throws Exception {
        if (bil2 == 0) {
            throw new Exception("Penambahan dengan nol tidak diperbolehkan");
        }
        return bil1 + bil2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukan bilangan pertama :");
            int bil1 = scanner.nextInt();

            System.out.print("Masukan bilangan kedua :");
            int bil2 = scanner.nextInt();

            int hasil = jumlahBilangan(bil1, bil2);
            System.out.println("Hasil penjumlahan: " + hasil);

        }
        catch (InputMismatchException e) {
            System.out.println("Terjadi kesalahan : Input tidak valid. Harap masukkan bilangan bulat");
        }
        catch (Exception e) {
            System.out.println("Terjadi Kesalahan : " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
