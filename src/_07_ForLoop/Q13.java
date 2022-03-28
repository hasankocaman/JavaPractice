package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	static int sayac;
	static String cumle;
	static String harf;
	public static void main(String[] args) {

		/*
		 * Kullanicidan bir cumle ve bir harf alin, Cumlede harfin kac kere
		 * kullanildigini bulup, 
		 * ORNEK:		 *
		 * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e		 *
		 * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("cumle gir");
		cumle=scan.nextLine().toLowerCase();
		
		while (true) {
			System.out.println("harf gir");
			harf=scan.next().toLowerCase();
			if (harf.length()==1) {	
				break;//bu donguden cikmanin tek yolu bu break bu sarti sglayamazsan dongude kalirsin
			}
			else {
				System.out.println("agam birden fazla harf girdin bir tane gir");
				
			}	
		}
		
		
		for (int i = 0; i < cumle.length(); i++) {
			if (  cumle.substring(i, i+1).equals(harf)) {
				System.out.println(i + " inci sirada kullanilmis");
				sayac++;  }
				
			}
		System.out.println("girdigin cumle " + cumle+ " " + harf + " karakteri "
				+ sayac + " defa kullanilmis");
			
		
		/*Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("lutfen bir harf giriniz");
		char harf=scan.next().toLowerCase(). charAt(0);
		
		int sayac  = 0;
		
		for (int i = 0; i < cumle.length(); i++) {
			
			if (cumle.charAt(i)==harf) {
				
				sayac++;	
			}
			
		}
		System.out.println("Girdiginiz cumlede " + harf +" karakteri "+ sayac+ " kere kullanilmistir");
		*/
	}
}
