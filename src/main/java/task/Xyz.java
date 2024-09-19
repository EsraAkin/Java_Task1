package preclass;

import java.util.Scanner;

public class Xyz {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Bir metin giriniz:");
        String metin=input.nextLine();

        int indexx = metin.indexOf('x'); //xin kaçıncı indexte olduğunu bulurum.
        int indexy = metin.indexOf('y'); //yin kaçıncı indexte olduğunu bulurum.
        int indexz = metin.indexOf('z'); //zin kaçıncı indexte olduğunu bulurum.

        if((indexx!=-1)&&(indexy==indexx+1)&&(indexz==indexy+1)){

                System.out.println("true");
            }
            else {
                System.out.println("False");
            }

        }

    }

