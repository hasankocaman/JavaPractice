package _07_ForLoop;

import java.util.Scanner;

public class Q11 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
	static Scanner sc=new Scanner(System.in);
	static int sayi;
    public static void main(String[] args) {
    	sayiGirdirme();
    	
    	
    
    }

	private static void sayiGirdirme() {
		System.out.println(" agam integer giris yap");
		while (true) { // Some condition
		    if (sc.hasNextInt()) {
		        int i = sc.nextInt();
		        System.out.println("int: " + i);
		        mukemmel(i);
		    }
		    else if (sc.hasNextDouble()) {
		        double d = sc.nextDouble();
		        System.out.println("double girdin: " + d);
		        sayiGirdirme();
		    }
		    else {
		        String s = sc.next();
		        System.out.println("string: " + s);
		        sayiGirdirme();
		    }
		}
	}

	private static void mukemmel(int sayi) {
		
		int toplam=0;
    	int bolenler=0;
    	System.out.println("agam mukemmel method icindesin");
    	 for (int bolen = 1; bolen < sayi; bolen++) {
    		 if (sayi%bolen==0) {
    			 bolenler+=bolen;				
			}
    					
		}
    	 if (sayi==bolenler) {
    		 System.out.println("sayi mukemmel");			
		}
    	 else {
			System.out.println("sayi mukemmel degil");
		}
		}
	}
    	

    



