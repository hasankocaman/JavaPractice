package _07_ForLoop;

import java.util.Scanner;

public class kacPozitifsayiGirdiveToplami {
    public static void main(String[] args) {
        /*
        Soru2 :Kullanıcıdan toplamak üzere Pozitif sayılar isteyin. İşlemi bitirmek için 0 basmasını söyleyin.
        Kullanıcı 0'a bastığında toplam kaç pozitif girdiğini ve girdiği pozitif sayıların toplamının kaç olduğunu yazdırın
         */

Scanner scan=new Scanner(System.in);

        int sayi;


        int toplam=0;
        int sayac=0;

        do {
            System.out.println("toplamini bulmak uzere pozitif sayi giriniz" +
                    "bitirmek icin sifira basiniz ");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        } while (sayi!=0);

        System.out.println("sayi = " + sayi);
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);












/*





        Scanner scanner=new Scanner(System.in);
        System.out.println("Pozitif sayı giriniz : ");
        int sayi=0;
        int toplam=0;
        int sayac=0;
        do {
            sayi=scanner.nextInt();
            toplam+=sayi;
            sayac++;
        }while (sayi!=0);
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);

 */


    }



    }

