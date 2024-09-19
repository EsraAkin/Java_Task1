package preclass;

import java.util.Scanner;

public class OrtadakiKarakteriYazdir {
    public static void main(String[] args) {

        /*
        Kullanicidan bir kelime girmesini isteyin.
        * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
        * kelimenin ortasindaki karakteri yazdirin.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = input.next();
        int karaktersayisi = kelime.length();
        int ortaindex = karaktersayisi / 2;
        if (karaktersayisi >= 3 && karaktersayisi % 2 == 1) {

            System.out.println("ortakarakter = " + kelime.charAt(ortaindex));

        } else {
            System.out.println("Kelimede çift sayıda karakter var.");
        }
    }
}
