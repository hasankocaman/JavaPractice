package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
    	
    	Scanner scan=new Scanner (System.in);
    	System.out.println("lutfen bir kelime giriniz");
    	String kelime=scan.next();
    	String tersKelime="";
    	for (int i = kelime.length()-1; i >=0; i--) {
    		tersKelime+=kelime.charAt(i);			
		}
    	if (kelime.contains(tersKelime)) {
    		System.out.println("kelime palindrom");
			
		}
    	else {
    		System.out.println("kelime palindrom degil");
		}
    	
    	

    }

}

