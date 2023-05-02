package com.Thorik.PBO.pertemuan4.Unguided1;

public class WarungMakan {
    String no_telp;
    String nama_warung;
    String alamat;
    public void detailWarung() {
        System.out.println("<< WARUNG MAKAN SEDERHANA >>");
        System.out.println("Nama Warung : " + nama_warung);
        System.out.println("ALamat      : " + alamat);
        System.out.println("No Telpon   : " + no_telp);
        System.out.println();
    }
    public void cekStok(Makanan m) {
        if (m.no_makanan == 1) {

            System.out.println("Stok Nasi Goreng : " + m.stok);
        } else if (m.no_makanan == 2) {
            System.out.println("Stok Nasi Goreng Spesial : " + m.stok);
        } else if (m.no_makanan == 3) {
            System.out.println("Stok Nasi Goreng SPesial + Telur : " + m.stok);
        }
        System.out.println();
    }

    public void beliMakanan(Makanan m, int jumlah) {
        if (jumlah >= m.stok) {
            System.out.println("Stok tidak cukup");
            m.harga = 0;
        } else {
            System.out.println("<< Detail Pembelian >>");
            System.out.println("Nama Makanan  : " + m.nama_makanan);
            System.out.println("Harga         : " + m.harga);
            System.out.println("Jumlah        : " + jumlah);
            m.harga = m.harga * jumlah;
            m.stok -= jumlah;
        }
    }
    public String getNo_telp() {
        return no_telp;
    }
    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }
    public String getNama_warung() {
        return nama_warung;
    }
    public void setNama_warung(String nama_warung) {
        this.nama_warung = nama_warung;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
