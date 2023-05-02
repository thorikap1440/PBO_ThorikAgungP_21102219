package com.Thorik.PBO.pertemuan2;

import java.util.Scanner;

public class unguided2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Program Form Pendaftaran Mahasiswa Baru ==");

        System.out.print("Masukan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukan Umur : ");
        int umur = input.nextInt();

        System.out.println();

        if (nama == "") {
            System.out.println("Nama tidak boleh kosong");
        } else if (umur <= 17) {
            System.out.println("Umur anda belum cukup");
        } else {
            int pilih;
            do {
                System.out.println("Pilih Jurusan :");
                System.out.println("1. Teknik Informatika");
                System.out.println("2. Sistem Informasi");
                System.out.println("3. Rekayasa Perangkat Lunak");
                System.out.println("4. Keluar");

                System.out.println();
                System.out.print("Masukkan Pilihan : ");
                pilih = input.nextInt();
                System.out.println();

                switch(pilih) {
                    case 1:
                        System.out.println("== Data Pendaftaran ==");
                        System.out.println("Nama    : " + nama);
                        System.out.println("Umur    : " + umur);
                        System.out.println("Jurusan : Teknik Informatika");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("== Data Pendaftaran ==");
                        System.out.println("Nama    : " + nama);
                        System.out.println("Umur    : " + umur);
                        System.out.println("Jurusan : Sistem Informasi");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("== Data Pendaftaran ==");
                        System.out.println("Nama    : " + nama);
                        System.out.println("Umur    : " + umur);
                        System.out.println("Jurusan : Rekasaya Perangkat Lunak");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Program selesai");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                }
            } while (pilih != 4);
        }
    }
}
