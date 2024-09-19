package preclass;

import java.util.Scanner;

public class StringReturn {
    public static void main(String[] args) {
        /* String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
         Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin (gh  -  g  -  h   : 3 durum var)

        ORNEK:          INPUT     OUTPUT
                        goat        gat
                       photo        hoto
                       ghost        ghost
                       kalem        lem

        */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = input.next();

        // Eğer kelimenin uzunluğu 2'den küçükse, doğrudan kelimeyi döndür
        if (kelime.length() < 2) {
            System.out.println(kelime);
            return;
        }

        // İlk ve ikinci karakterler alınır
        char firstchar = kelime.charAt(0);   // İlk harf (0. index)
        char secondchar = kelime.charAt(1);  // İkinci harf (1. index)

        // Sonucu depolamak için bir değişken
        String sonuc = "";

        // Eğer ilk karakter 'g' ise, sonucu 'g' ile başlat
        if (firstchar == 'g') {
            sonuc += firstchar;
        }

        // Eğer ikinci karakter 'h' ise, sonucu 'h' ile devam ettir
        if (secondchar == 'h') {
            sonuc += secondchar;
        }


        sonuc += kelime.substring(2); // İlk iki karakterden sonraki kısmı ekle


        System.out.println(sonuc); // Sonucu yazdır
    }
}
