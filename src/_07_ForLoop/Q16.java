package _07_ForLoop;

public class Q16 {
    public static void main(String[] args) {
        /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli yazdırınız
        */
    	int harf=65;
    	char ch=(char)65;
    	System.out.println("char karakter nasil yazildi : " + ch);
    	System.out.println();
    	for (int baba = 0; baba <= 5; baba++) {
    	for (int evlat = 0; evlat <=baba; evlat++) {
    		System.out.print(  (char) (baba+harf) + " " );	
		}	
    	
    	System.out.println();
			
		}
    	
    	
    //2.senaryoda satir 1 oldu sutun gene 0. bu ne demek sutun 0 ve 1 olabilir demek
    	//yani satir 1 ken sutun iki deger aliyorsa o zaman ikinci satirda iki islem olabilir
    	//3.senaryoda satir 2 oldu sutun gene 0. bu ne demek sutun 0, 1 ve 2 olabilir demek
    	//yani satir 1 ken sutun uc deger aliyorsa o zaman ucuncu satirda uc islem olabilir
    /*	
    	int harf=65;
    	for (int satir = 0; satir <= 6; satir++) {//ilk senaryoda satir 0
    		//sutun 0 sutun satira esit kucuk bir kere don 19.satiri yazdir
    		
    	// sutun 1 ken satir 0 olursa icteki for donemiyor 
    		for (int sutun = 0; sutun <=satir; sutun++) {//
    			System.out.print(((char)(harf + satir))+ " ");//A ilk dongu
			}//icteki for donemezse burda cikiyor 23. satir calisiyor
			System.out.println();// burdan yine 16.satira gidiyor
		}
    	
    	
    	*/
    	
    	
    	
   /* 	int harf=65;
        for (int baba = 0; baba < 6; baba++) {
      	  for (int evlat = 0; evlat <=baba; evlat++) {
      		  System.out.print(((char)harf+1+"")+"* ");
  			
  		}
  		System.out.println();
  	}*/
    	

       
    }

}
