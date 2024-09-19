package preclass;

import java.util.Scanner;

public class TerstenYazdir {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin
        // ve girilen kelimeyi tersten yazdirin
        Scanner input = new Scanner(System.in);
        System.out.println("4 harfli bir kelime giriniz: ");
        String kelime = input.nextLine();

        if (kelime.length() == 4) {

            String tersKelime = new StringBuilder(kelime).reverse().toString();// StringBuilder kullanarak kelimeyi tersten yazdırırız.

            System.out.println("Kelimenin tersi: " + tersKelime);
        } else {
            System.out.println("4 harfli kelime giriniz lütfen!");
        }

    }
}
