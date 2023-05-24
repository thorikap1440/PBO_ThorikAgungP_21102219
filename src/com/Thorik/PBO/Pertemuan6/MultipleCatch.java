package com.Thorik.PBO.Pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan Angka :");
            int angka1 = input.nextInt();

            System.out.print("Masukkan Pembagi :");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil + "(dibulatkan)");
        }

//        // multi exception (lebih ringkas)
//        catch (ArithmeticException | InputMismatchException e) {
//            System.out.println("Error : " + e);
//        }

        // multi catch (lebih detail)
        catch (ArithmeticException e) {
            System.out.println("Error: Kesalahan dalam perhitungan!");
        }
        catch (InputMismatchException e){
            System.out.println("Error : Kesalahan dalam input!");
        }
        finally {
            System.out.println("Finally akan selalu dijalankan");
        }

        System.out.println("Akhir dari program");
    }
}
