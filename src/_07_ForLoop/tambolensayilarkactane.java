package _07_ForLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tambolensayilarkactane {
        public static void main(String[] args) {
                //Kullanıcıdan bir sayı alın.
                // Bu sayıyı tam bölen sayıları ve
                // toplam kaç tane olduklarını ekranda yazdırın
                Scanner scan = new Scanner(System.in);
                System.out.println("bir sayi giriniz");
                int sayi = scan.nextInt();
                System.out.println("sayi = " + sayi);

                int sayac=0;
                List<Integer> bolenler = new ArrayList<>();
                System.out.println("bolenler = " + bolenler);

                for (int i = 1; i <=sayi ; i++) {
                        if (sayi%i==0) {
                                bolenler.add(i);
                                sayac++;
                        }

                }
                System.out.println("bolenler = " + bolenler);
                System.out.println("sayac = " + sayac);


















        /*
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println("sayi = " + sayi);
        int sayac=0;
        List<Integer> bolenler=new ArrayList<>();
        for (int i = 1; i <sayi ; i++) {
            if ((sayi%i)==0) {
                bolenler.add(i);
                sayac++;
            }

        }
        System.out.println("bolenler = " + bolenler);
        System.out.println("bolenlerin adedi = " + sayac);
    }


         */
        }
}