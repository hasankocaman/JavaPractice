package _07_ForLoop;

import java.util.Scanner;

public class Baklavadeneme {
	/*
	 * * * * * *
	 */
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	int satir,bosluk,yildiz,boslukAlt,yildizAlt;
	System.out.println("sayi giriniz ");
	int sayi=scan.nextInt();
	//baklava ust kisim
	for (satir = 1; satir <=sayi ; satir++) {//kac satir olacak sayi kadar
		for (bosluk = sayi; bosluk >satir ; bosluk--) {//sayi 5 ise mesela 5 bosluktan baslayacak
			System.out.print(" ");
		}
		
		//bir yildizla baslayacaz
		for ( yildiz = 1; yildiz <=satir; yildiz++) {//satir 5 ise tabanda 5 yildiz olacak
			System.out.print("*"+ " "); //her yildizin  yanina bir bosluk koyacak
		}
		
		System.out.println();//satir her degistigindebir alt satira atacak 
	}
	for (bosluk = 1; bosluk <=sayi; bosluk++) {//burayi da satir gibi dusunelim
		
	
	for (boslukAlt = 1; boslukAlt <=bosluk; boslukAlt++) {//alt bosluk once bir tane sonra satira dogru artiyor
		System.out.print(" ");
		
	}                        //burda = koysaydik en ust satira satir sayisi kadar yildiz koyardi
	for (yildizAlt = sayi; yildizAlt >bosluk; yildizAlt--) {//alt ucgendeki yildiz sayisi sayidan baslayip azalacak
	System.out.print("*" + " ");//her yildizin yanina bir bosluk koyacaz yildizlarin arasindaki bosluklar icin	
	}
	
	System.out.println();//yine bir alt satira gecmek icin
	//dikkat et hala for'un icindeyiz
	}

}

}


