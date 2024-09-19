package preclass;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {

        /*  //Kullanicidan ismini ve soyisimi girmesini isteyin, sonrasinda konsola tam ismini buyuk harfler ile yazdirin
        // 2 Strings olusturun -> string1 = "01234" and string2 = "56789"
        // 1.yol: concat() function ile concatenate string1 and string2
        // 2.yol: operator kullanarak concatenate string1 and string2
        // konsolda yazdiriniz*/

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Adınızı ve Soyadınızı Giriniz: ");
        System.out.println("Adınız: ");
        String ad = input.nextLine();
        System.out.println("Soyadınız: ");
        String soyad = input.nextLine();

        System.out.println(ad.toUpperCase() + " " + soyad.toUpperCase());

        System.out.println("//------------------------------------------------------------------------------------");


        /* String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
         String  str 1= "$13.99"
         String str 2= "$10.55"
         ipucu: Double parseDouble() methodunu kullanabilirsiniz.*/

        String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replace("$", "");  //$ işaretinden kurtardık
        str2 = str2.replace("$", "");

        double toplamFiyat = Double.parseDouble(str1) + Double.parseDouble(str2);//stringi double çevirip topladık

        System.out.println("toplamFiyat = " + toplamFiyat);

        System.out.println("//------------------------------------------------------------------------------------");

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
     \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z      a->z         0->9    _
     \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
     \\S   ==> space disindaki hersey  */
        /*
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */


        Scanner input2 = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = input2.next();

        int kelimeUzunlugu = kelime.length();

        if (kelimeUzunlugu >= 3) {

            String sonIkiHarf = kelime.substring(kelimeUzunlugu - 2); //substring(kelimeUzunlugu - 2)
            // son 2 karakteri alır.

            System.out.println(sonIkiHarf + sonIkiHarf + sonIkiHarf);
        } else {
            System.out.println(kelime);
        }
    }
}


