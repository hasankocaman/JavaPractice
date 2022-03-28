package ifelse;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz\nErkek icin E, Kadin icin K giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("cinsiyet = " + cinsiyet);
        System.out.println("yasinizi giriniz");
        int yas=scan.nextInt();
        System.out.println("yas = " + yas);

        if (cinsiyet=='E') {
            System.out.println("bravo cinsiyeti erkek girmeyi basardin");

            if (yas >= 60) {
                System.out.println("emekli olabilirsin");
            } else {
                System.out.println("emekli olamazsin");
            }

        }
        else if (cinsiyet == 'K') {
            System.out.println("bravo cinsiyeti kadin girmeyi basardin");

            //yasi incele
            if (yas >= 55 ) {
                System.out.println("emekli olabilirsin ve 75 yas altisin");

            } else {
                System.out.println("emekli olamazsin");
            }


        }


        else {
            System.out.println("lutfen e veya k giriniz");
        }



    }//main method sonu
}//class sonu
