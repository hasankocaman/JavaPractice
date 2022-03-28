package _07_ForLoop;

import java.util.Scanner;

public class whiledeneme {
	static Scanner sc=new Scanner(System.in);
	static int sayi;
	public static void main(String[] args) {
		System.out.println("giris yap");
		while (true) { // Some condition
		    if (sc.hasNextInt()) {
		        int i = sc.nextInt();
		        System.out.println("int: " + i);
		    }
		    else if (sc.hasNextDouble()) {
		        double d = sc.nextDouble();
		        System.out.println("double: " + d);
		    }
		    else {
		        String s = sc.next();
		        System.out.println("string: " + s);
		    }
		}
	}

}
