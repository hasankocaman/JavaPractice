package _07_ForLoop;

import java.util.Scanner;

public class ucgenOmerOzdemirForLoop {
	/*****************                              
		**********
		 *******
		  ******
		
		*
		*                                                      *
		*                                                     **
		*                                                    ***
		*                                                   ****
		*                                                   ******/
	public static void main(String[] args) {
// ters ucgen
		
//baklava yapmaya calisiyoruzdur
        

        //funda hanim
        Scanner scan=new Scanner(System.in);
        System.out.println(" 10'dan kucuk pozitif bir tam sayi giriniz");
        int sayi=scan.nextInt();
        System.out.println("funda hanimin");        		
		for (int satir = 0; satir<=sayi; satir++) {							
			for (int bosluk =1; bosluk<= satir; bosluk++) {				        
				System.out.print(" ");                          			}
			for (int yıldız = sayi; yıldız>=satir; yıldız--) {						
				System.out.print("*"+" ");				}
			System.out.println();		}
            System.out.println("********************");
            //samed
            System.out.println("samed baslangic");
            for (int satirsamed = 0; satirsamed <= sayi; satirsamed++) {
                
                for (int bosluksamed = satirsamed; bosluksamed<sayi; bosluksamed++) {
                    System.out.print(" ");
                }
                System.out.print(" ");
                for (int sutun = 0; sutun <= satirsamed; sutun++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
            System.out.println("samed bitis");
           
        




















      /*for (int satir = 0; satir <= sayi; satir++) {//satir satir            
                for (int bosluk = 0; bosluk <= satir; bosluk++) {
                    System.out.print(" ");                                                   }                
                 for (int yildiz = 10; yildiz >2*satir-1 ; yildiz--) {
                if (yildiz>=satir) {//yildiz satirdan buyukse bir yildiz bas
                    System.out.print("*");// yildiz 10 dan basliyo ve hep satirdan buyuk
                    //on yildiz basacak
                } else {
                    System.out.print("  ");           }                                      }
            System.out.println();   
            }*/
      
      
      
scan.close();
	

}
}
