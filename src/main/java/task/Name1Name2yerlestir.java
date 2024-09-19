package preclass;

import java.util.Scanner;

public class Name1Name2yerlestir {
    public static void main(String[] args) {
        /*
        name1 ve name2 degiskenlerini olusturun.
        name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
        name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
*/

        String name1 = "Mehrmet";
        String name2 = "Ahmet";
        int name1leng = name1.length();

        if (name1leng % 2 == 0) {
            int orta = name1leng / 2;  // Orta nokta
            String ilkyari = name1.substring(0, orta);  // kelimenin ilk yarısı
            String ikinciyari = name1.substring(orta);  // kelimenin 2. yarısı
            System.out.println(ilkyari + name2 + ikinciyari);
        } else {
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
        }
    }
}
