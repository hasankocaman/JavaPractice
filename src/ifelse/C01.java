package ifelse;

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
// Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
        //bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana "5’e bölünen
        //çift sayı" yazdırın. Son rakamı 0 değil ise "5’e bölünen tek sayı" yazdırın.
        //Girdiği password 5’e bölünmüyorsa ekrana "Tekrar deneyin" yazdırın.
        
        Scanner scan=new Scanner(System.in);
        // Kullanıcıdan 4 basamakli bir sayi girmesini isteyin
        System.out.println("bir sayi giriniz");
        int girilenSayi=scan.nextInt();
        int sonRakam=girilenSayi%10;
        System.out.println("sonRakam = " + sonRakam);

        if (girilenSayi%5==0) {
            System.out.println("girdiginiz sayi 5'e bolunuyor");

            if (sonRakam==0) {
                System.out.println("bese bolunen cift sayi");
            }

            else  {
                System.out.println("bese bolunen tek sayi");
            }

        }

        else {
            System.out.println("girdiginiz sayi bese bolunmuyor tekrar deneyiniz");
        }



        
    }//main method sonu

    public static class C02 {


        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);

        }
    }
}//class sonu
