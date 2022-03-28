package _07_ForLoop;

import java.util.Scanner;

public class whileHasnext {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi gir");
		while (true) {
			if (scan.hasNextInt()) {
				System.out.println("while icindesin");	
				int sayi=scan.nextInt();
				break;
			}
			
		}
		System.out.println("while dan ciktin");
	}
}