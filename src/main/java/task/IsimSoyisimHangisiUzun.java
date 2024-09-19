package preclass;

import java.util.Scanner;

public class IsimSoyisimHangisiUzun {
    public static void main(String[] args) {

        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Adınızı ve Soyadınızı Giriniz: ");
        System.out.println("Adınız: ");
        String ad = input.nextLine();
        System.out.println("Soyadınız: ");
        String soyad = input.nextLine();


        int adUzunlugu = ad.length();
        int soyadUzunlugu = soyad.length();

        if (adUzunlugu > soyadUzunlugu) {
            System.out.println("Adınız soyadınızdan daha uzun.");
        } else if (adUzunlugu < soyadUzunlugu) {
            System.out.println("Soyadınız adınızdan daha uzun");

        } else {
            System.out.println("Adınız ve Soyadınız eşit uzunlukta");
        }


    }
}
