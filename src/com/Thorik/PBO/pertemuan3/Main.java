package com.Thorik.PBO.pertemuan3;

public class Main {
    public static void main(String[] args) {
        // pembuatan class
        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor honda = new SepedaMotor();

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
//
//        // menjalankan method showInfo
//        suzuki.showInfo();
//        yamaha.showInfo();
//        honda.showInfo();

        SepedaMotor vespa = new SepedaMotor("Vespa", "Vespa Matic", 40000000);
//        vespa.showInfo();

        // Sebelum perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                        "Dengan tipe ( before ) : " + vespa.getTipe()
        );

        // melakukan proses perubahan tipe motor
        vespa.setTipe("Sprint");

        // Lihat hasil perubahan
        System.out.println(
                "Motor Merek : " + vespa.getMerek() +
                        "Dengan tipe ( after ) : " + vespa.getTipe()

        );
    }
}
