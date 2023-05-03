 package com.Thorik.PBO.Pertemuan5;

public class Main {
    public static void main(String[] args) {
        Barang[] keranjang = new Barang[10];

        Barang[] etalase = {
                new Barang("Indomie", 2000),
                new Barang("Mie Sedap", 2000),
                new Barang("Beras", 12000),
                new Barang("Gula", 15000),
        };

        // Melihat panjang array
        System.out.println(
                "Banyak Barang di Etalase : " + etalase.length
        );

        etalase[0].showInfo();

        // Menampilkan daftar barang dalam array
        System.out.println("Daftar Barang di etalase : ");


        for (int i = 0; i<etalase.length; i++) {
            System.out.println("Barang ke-" + (i+1));
            etalase[i].showInfo();
        }
//        int j = 1;
//        for (Barang barang : etalase) {
//            System.out.println("Barang ke-" + j);
//            barang.showInfo();
//            j++;
//        }

        // Memasukan barang ke keranjang
        keranjang[0] = etalase[0];
        System.out.println("Barang di keranjang : ");
        keranjang[0].showInfo();
    }
}
