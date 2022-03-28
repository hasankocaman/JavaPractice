package _07_ForLoop;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Q10 {
	/*
	 * Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
	 * olduğunu, değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf
	 * değilse yada 1 karakterden fazla ise hata mesajı göstersin. (Test girilen
	 * harfi büyük yada küçüklüğüne duyarlıdır.)
	 * 
	 * Sesli harfler: a,e,i,o,u
	 * 
	 * Test Data: a
	 * 
	 * Beklenen Çıktı: a harfi sesli harfdir.
	 * 
	 * Test Data: d
	 * 
	 * Beklenen Çıktı: d harfi sesiz harftir.
	 * 
	 * Test Data: we yada %
	 * 
	 * Beklenen Çıktı: Yanlis karakter girdiniz!
	 * 
	 */
	static Scanner scan = new Scanner(System.in);
	static String sesliHarfler = "aeiuo";
	static String sessizHarfler = "bcdfghjklmnprstvyzwq";

	public static void main(String[] args) {
		String girilenharf=""; 

		harfGirisi(girilenharf);

	}

	private static void harfGirisi(String girilenharf) {
		System.out.println("harf giriniz");
		girilenharf = scan.next();
		while (girilenharf.length() > 1) {
			System.out.println("birden fazla giris yaptiniz sadece bir harf giriniz");
			girilenharf = scan.next();
		}

		if (sessizHarfler.contains(girilenharf)) {

			System.out.println("girilen harf sessizdir.");

		} else if (sesliHarfler.contains(girilenharf)) {
			System.out.println("sesli harf girildi.");

		} else {
			System.out.println("yanlış karakter girildi.");

			harfGirisi(girilenharf);

		}

	}
}
