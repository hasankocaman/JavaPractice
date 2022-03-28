package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
	static Scanner scan=new Scanner(System.in);
	static int sayi;
	static int boskovic;
    public static void main(String[] args) {
    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.
         algoritma kuralim once:
         1.kullanicidan sayi al
         2.kare toplami icin bos kova olustur
         3.girilen sayida duran for olustur
         4.for icine kare hesaplayan formul yaz         
         5.her hesaplanan kareyi kovaya at

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
    	System.out.println("birden buyuk bir sayi gir");
    	sayi=scan.nextInt();
    	for (int i = 1; i < sayi; i++) {
    		boskovic+=Math.pow(i, 2);			
		}
    	System.out.println("girdigin sayiya kadarki"
    			+ " sayilarin kareleri toplami : " + boskovic );
    	
    	
    	
        
    }
}
