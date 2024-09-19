package preclass;

import java.util.Scanner;

public class CumleOlustur {
    public static void main(String[] args) {

        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner input = new Scanner(System.in);
        System.out.println("4 tane kelime giriniz.");
        System.out.println("1. kelime: ");
        String kelime1 = input.next();
        System.out.println("2. kelime: ");
        String kelime2 = input.next();
        System.out.println("3. kelime: ");
        String kelime3 = input.next();
        System.out.println("4. kelime: ");
        String kelime4 = input.next();

        System.out.println(kelime1.substring(0, 1).toUpperCase() + kelime1.substring(1) +
                " " + kelime2.toLowerCase() + " " + kelime3.toLowerCase() + " " + kelime4.toLowerCase()+".");

    }
}
