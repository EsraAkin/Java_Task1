package preclass;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusunu yazı ile yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
        int sayi = input.nextInt();
        int yuzlerBasmak = sayi / 100;  //yüzler basamagını elde ettim
        int onlarBasamak = (sayi / 10) % 10; //onlar basamağını elde ettim
        int birlerBasamak = sayi % 10; //birler basamağını elde ettim

        switch (yuzlerBasmak) {
            case 0:
                System.out.print("");
                break;
            case 1:
                System.out.print("Yüz ");
                break;
            case 2:
                System.out.print("İkiyüz ");
                break;
            case 3:
                System.out.print("Üçyüz ");
                break;
            case 4:
                System.out.print("Dörtyüz ");
                break;
            case 5:
                System.out.print("Beşyüz ");
                break;
            case 6:
                System.out.print("Altıyüz ");
                break;
            case 7:
                System.out.print("Yediyüz ");
                break;
            case 8:
                System.out.print("Sekizyüz ");
                break;
            case 9:
                System.out.print("Dokuzyüz ");
                break;
        }


        switch (onlarBasamak) {
            case 0:
                System.out.print(" ");
                break;
            case 1:
                System.out.print("On ");
                break;
            case 2:
                System.out.print("Yirmi ");
                break;
            case 3:
                System.out.print("Otuz ");
                break;
            case 4:
                System.out.print("Kırk");
                break;
            case 5:
                System.out.print("Elli ");
                break;
            case 6:
                System.out.print("Altmış ");
                break;
            case 7:
                System.out.print("Yetmiş ");
                break;
            case 8:
                System.out.print("Seksen ");
                break;
            case 9:
                System.out.print("Doksan ");
                break;

        }
        switch (birlerBasamak) {
            case 1:
                System.out.print("Bir");
                break;
            case 2:
                System.out.print("İki");
                break;
            case 3:
                System.out.print("Üç");
                break;
            case 4:
                System.out.print("Dört");
                break;
            case 5:
                System.out.print("Beş");
                break;
            case 6:
                System.out.print("Altı");
                break;
            case 7:
                System.out.print("Yedi");
                break;
            case 8:
                System.out.print("Sekiz");
                break;
            case 9:
                System.out.print("Dokuz");
                break;
            default:
                System.out.print("");  // birler basamağı sıfır ise
                break;
        }


        }
    }
