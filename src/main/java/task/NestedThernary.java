package preclass;



import java.util.Scanner;

public class NestedThernary {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */

        //result (a) ? (t) : (f)

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Notunuzu harf olarak giriniz.");
        char finalNotu = input.next().charAt(0);


        String sonuc = (finalNotu == 'A') ? ("Gayet Başarılı") :
                ((finalNotu == 'B') ? ("Başarılı") :
                        (finalNotu=='C')?("Ha Gayret"):("Diğerleri"));
        System.out.println(sonuc);

    }
}
