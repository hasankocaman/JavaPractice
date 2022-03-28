package _07_ForLoop;

import java.util.Scanner;

public class Q04 {
	public static void main(String[] args) {
		// Kullanıcıdan 5 adet sayı isteyiniz
		// Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
		// bu soruyu continue kullanarak çözünüz.	
		
		Scanner scan=new Scanner(System.in);
		int toplam=0;
		for (int i = 1; i <=5; i++) {
			System.out.println("sayi " + i + " giriniz : ");
			int sayi=scan.nextInt();
			if (sayi>5 && sayi<10){				
				System.out.println("girdigin sayi 5 ile 10 arasinda old isleme almadik");
				continue;				
			}
			toplam+=sayi;
		}
		System.out.println("girdigin sayilardan 5 ile 10 arasindakiler haric"
			+ " digerlerinin toplami : " + toplam);
				
		
		

}
	
}