package preclass;

import java.util.Scanner;

public class StringdeBosluk {
    public static void main(String[] args) {
        // Kullanicidan alacaginiz bir stringde bosluk karakterinin olup olmadigini kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir metin giriniz: ");
        String string = input.nextLine();
        int num = string.replaceAll("[^\\s]", "").length(); //tüm boşlukları sildim.
        if (num > 0) {
            System.out.println("Metinde boşluk karakteri kullanılmış.");
        } else {
            System.out.println("Metinde boşluk karakteri yok.");
        }

        // Kullanicidan alacaginiz bir stringin bos olup olmadigini kontrol ediniz.

        if (!string.isEmpty()) {    //.lenght() ile de kontrol edebilirdim.
            System.out.println("Yazdığınız metin:  = " + string);

        } else {
            System.out.println("Bu metin boş.");
        }

    }
}
