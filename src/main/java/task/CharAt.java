package preclass;

public class CharAt {
    public static void main(String[] args) {


        //charAt() metodu ör:s.charAt(5); 5. indexteki karakteri verir.

        String s = "Deneme yazısı";
        char c = s.charAt(2);
        System.out.println(c);     //n


        //ilk n kaçıncı indexte nasıl bulurum?
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'n') {
                break;

            } else {
                System.out.print(s.charAt(i));
            }
        }


    }
}
