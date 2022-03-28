package _07_ForLoop;

import java.util.Scanner;

public class ucgenDenemem1 {

	public static void main(String[] args) {
		// ucgen
		/*
		 * 
    *
   * *
  * * *
 * * * * 
 
		 * 
		 * 
		 * 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi gir");
		System.out.println("normal ucgen piramit seklinde");
		int sayi=scan.nextInt();
		for (int satir = 1; satir <=sayi ; satir++) {
			for (int bosluk = sayi-2; bosluk >=satir-1 ; bosluk--) {
				System.out.print(" ");			}
			for (int yildiz = 0; yildiz < satir; yildiz++) {
				System.out.print("* ");			}
			System.out.println();
			for (int bosluk2 = sayi; bosluk2 <= satir; bosluk2++) {
				System.out.print(" ");
				for (int yildiz2 = sayi; yildiz2 >= satir; yildiz2--) {
					System.out.print("*"+ " ");			}
				System.out.println();			}		}		
		System.out.println("piramit bitis");
		System.out.println("==============================");
		
		for (int satir2 = 1; satir2 <= sayi; satir2++) {
			for (int bosluk2 = 1; bosluk2 <= satir2; bosluk2++) {
				System.out.print(" ");			}
			for (int yildiz2 = sayi; yildiz2 >= satir2; yildiz2--) {
				System.out.print("*" + " ");			}
			System.out.println();
		
		
	}
		scan.close();
}
}

