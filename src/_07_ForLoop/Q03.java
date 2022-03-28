package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
	public static void main(String[] args) {

		/*
		 * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
		 * döngüden çıkılsın
		 * 
		 * Bugün hava oldukca güzel.-> 2
			 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("bir string giriniz : ");
		String str = scan.nextLine();
		int aMiktari = 0;//baslangicta bos kovamiz
		for (int i = 0; i < str.length(); i++) {//0.index'ten basla 

			if (str.toLowerCase().charAt(i) == 'a') {//her indexte kontrol et a var mi varsa
				aMiktari++;//varsa bos kovaya at birer birer
			} else if (str.toLowerCase().charAt(i) == 'c') {
				break;			}		}//break donguyu sonlandirmak icin kullanilir
		// mesela sonsuz bir dongu var ve icine if ekleyip break dedik if saglaninca break donguyu kirar
		System.out.println("girdiginiz string'deki a sayisi :" + aMiktari);
	}

}