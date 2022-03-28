package _07_ForLoop;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        /*
        SORU : kullanıcıdan toplamak için sayı isteyin ve toplam 500'e ulaşıncaya kadar devam etmesini isteyin.
        Toplam 500'e ulaştığında veya geçtiğinde toplamı ve kaç sayı girildiğini yazdırın.
         */
        Scanner scan=new Scanner(System.in);
        int sayi;
        int toplam=0;
        int sayac=0;

        do {
            System.out.println("sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;
        } while (toplam<=500);

        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

    }
}
