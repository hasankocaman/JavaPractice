package _07_ForLoop;

import java.util.Scanner;

public class Q20_Baklava {

	public static void main(String[] args) {
		/*
		 * * * * * *
		 */
		Scanner input = new Scanner(System.in);
		int satir, bosluk, j, l, m;
		System.out.println("Sayi giriniz");
		int sayi = input.nextInt();
		for (satir = 1; satir <= sayi; satir++) {// Bu döngümüzde baklava dilimimizin üst kısmını yapıyoruz.

			for (bosluk = sayi; bosluk > satir; bosluk--)// bu for döngümüz ekran çıktısının sol tarafındaki boşlukları ayarlıyor.
			{
				System.out.print("b");
			}
			for (j = 1; j <= satir; j++)// bu for döngümüzde ise yıldız şeklimizi çıkartıyor ve yıldızların arasındaki
									// boşluğu ayarlıyor
			{
				System.out.print("*" + "a");
			}
			System.out.println();
		}
//bu döngümüz ile baklava diliminin alt kısımını yapıyoruz
		for (bosluk = 1; bosluk <= sayi; bosluk++) {
			for (l = 1; l <= bosluk; l++)// döngümüz ile baklava diliminin alt kısımının sol tarafındaki boşlukları
									// belirtiyoruz.
			{
				System.out.print("b");
			}
			for (m = sayi; m > bosluk; m--)// bu döngümüz ile baklava diliminin alt kısımındaki yıldızları ve arasındaki
									// boşlukları belirtiyoruz.
			{
				System.out.print("*" + "a");
			}
			System.out.println();
		}

	}

}
