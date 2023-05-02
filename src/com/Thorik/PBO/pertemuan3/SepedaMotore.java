package com.Thorik.PBO.pertemuan3;

public class SepedaMotore {
    String merek;
    String tipe;
    int harga;

    public SepedaMotore(){}

    public SepedaMotore(String merek, String tipe, int harga) {
        this.merek = merek;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void showInfo() {
        System.out.println("Merek : " + merek);
        System.out.println("Tipe : " + tipe);
        System.out.println("Harga : " + harga);
        System.out.println();
    }
}
