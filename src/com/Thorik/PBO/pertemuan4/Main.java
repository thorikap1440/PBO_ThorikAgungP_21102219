package com.Thorik.PBO.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();
        Pegawai pegawai = new Pegawai();

        manajer.nip = 181910024;
        manajer.nama = "Basuki";

        pegawai.nip = 181910024;
        pegawai.nama = "Ahmad";

        manajer.showInfo();
        manajer.extraInfo();
        manajer.bonus(10000000);
        manajer.bonus();

        pegawai.showInfo();
        pegawai.extraInfo();
    }
}
