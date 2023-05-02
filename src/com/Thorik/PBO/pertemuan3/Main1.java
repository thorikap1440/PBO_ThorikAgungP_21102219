package com.Thorik.PBO.pertemuan3;

public class Main1 {
    public static void main(String[] args) {
        // pembuatan class
        SepedaMotore suzuki = new SepedaMotore("Suzuki", "GSX 150R", 20000000 );
        SepedaMotore yamaha = new SepedaMotore("Yamaha", "YZF R15", 25000000);
        SepedaMotore honda = new SepedaMotore("Honda", "CBR 15OR", 23500000);

//        // mengisi nilai atribut
//        suzuki.merek = "Suzuki";
//        suzuki.tipe = "GSX 150R";
//        suzuki.harga = 20000000;
//
//        yamaha.merek = "Yamaha";
//        yamaha.tipe = "YZF R15";
//        yamaha.harga = 25000000;
//
//        honda.merek = "Honda";
//        honda.tipe = "CBR 15OR";
//        honda.harga = 23500000;

        // menjalankan method showInfo
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();
    }
}
