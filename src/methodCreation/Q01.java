package methodCreation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //// Kullanıcıdan bir sayı alın . Bu sayının tek mi çift mi olduğunu ,
        //        // sıfırdan büyükmü küçük mü olduğunu, ayrıca 100 den büyükse birler, onlar ve yüzler basamağındaki
        //        // rakamların toplamını, 100 den küçükse sadece 1'ler basamağını yazdıran bir method oluşturun

        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi=scan.nextInt();

        tekMiCiftMi(sayi);
        pozitifMi(sayi);
        yuzdenBuyukse(sayi);


    }

    private static void yuzdenBuyukse(int sayi) {
        if (sayi > 100) {
            int rakamlarToplami = 0;
            int birlerBasamagi = sayi % 10;
            System.out.println("birlerBasamagi = " + birlerBasamagi);
            int onlarBasamagi = (sayi / 10) % 10;
            System.out.println("onlarBasamagi = " + onlarBasamagi);
            int yuzlerBasamagi = sayi / 100;
            System.out.println("yuzlerBasamagi = " + yuzlerBasamagi);

        } else {
            int birlerBasamagi = sayi % 10;
            System.out.println("birlerBasamagi = " + birlerBasamagi);
        }
    }

    private static void pozitifMi(int sayi) {
        if (sayi > 0) {
            System.out.println("sayi pozitiftir");
        } else {
            System.out.println("sayi sifir veya negatiftir");
        }
    }

    private static void tekMiCiftMi(int sayi) {
        if (sayi % 2 == 0) {
            System.out.println("sayi cifttir");
        } else {
            System.out.println("sayi tektir");
        }
    }


    public static class methodcreation {
        public static void main(String[] args) {

            Scanner scan=new Scanner(System.in);
            System.out.println("sayi gir");
            int sayi= scan.nextInt();
            System.out.println("sayi = " + sayi);

            System.out.println("13. satir karesi(sayi) = " + karesi(sayi));

        }

        private static int karesi(int sayi) {


            int urun=sayi*sayi;

            return urun;
        }


    }
}
