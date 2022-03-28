package _07_ForLoop;

import java.util.Scanner;

public class Q14 {

	/*
	 * Problem Tanımı Girilen bir sayı kadar satır ve sütünu olan ve sağ kenara
	 * dayalı üçgeni basan kodu yazınız. Ekran Çıktısı Bir sayi giriniz: 5
	 * ilk senaryo:satir 1 sayi 5 olsun 21. satir tamam 22. satira girdi bosluk sayi-satir
	 *  ise 5-1= 4 adet bosluk basacak yani 1. satirda 4 bosluk 2. satirda 3 bosluk
	 **
	 ***
	 ****
	 *****
	 */
static	Scanner scan=new Scanner(System.in);
static int sayi;
	public static void main(String[] args) {
		/*KENDIN YAZ HERSEYI*/
		System.out.println("pozitif tam sayi giriniz");
		sayi=scan.nextInt();
		while (true) {
			if (sayi>0) {
				System.out.println("tebrikler pozitif tamsayi girdiniz");
				break;				
			}
			else {
				System.out.println("pozitif tamsayi giriniz lutfen");
				sayi=scan.nextInt();	
			} }
			
		for (int satir = 1; satir <= sayi; satir++) {// satır kontrolu
			for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {// bosluk kontrolu
				System.out.print(" ");
			}
			for (int yildiz = 1; yildiz <= satir; yildiz++) {// yıldız kontrolu
				System.out.print("*");
			}
			
			System.out.println();
		}
		/*
		 *
		 * * * * * * * * * * * şeklini yazdırınız
		 */

		/*
		 * for (int satir = 1; satir <= sayi; satir++) {//satır kontrolu
		 * 
		 * for (int yildiz = 1; yildiz <= satir; yildiz++) {//yıldız kontrolu
		 * System.out.print("*");
		 * 
		 * } System.out.println(); }
		 */
	
	}}
