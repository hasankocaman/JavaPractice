package _07_ForLoop;

public class Q17 {

    public static void main(String[] args) {



    	
    for (int satir = 1; satir <=6 ; satir++) {//ilk bas sarta bakar artirma yapmaz
		// 1.senaryoda satir 1 bosluk 1 olunca sart saglandi bosluk bir kere calisti bosluk 2 olunca 
    	// sart saglanmadi alta gecti  	
  	  for (int bosluk = 1; bosluk <= satir; bosluk++) {//bir bosluktan basla satir sayisi birer arttikca 
  		  //
			System.out.print("*");
		}
  	  //  sutun=satir ise sutun da 1 oldu yazdirilan sutun o yuzden sutun 1 den basladi 6 ya kadar 
  	// dondu. 
  for (int sutun = satir; sutun <= 6; sutun++) {// sutun satira = oldugu icin 
		// 3. senaryoda satir 3 ise sutun 3 den baslayacak 6 ya kadar 4 defa donecek
	  // yani 3. satirda 4 defa islem yapmis sutun var 
  	System.out.print(sutun+ " ");// yazdirilan 1 artmak zorunda 
  	                              // eger yazdirilan satir olursa satir sabitken icerdeki for 
  	                                // donmeye devam ediyor bu da satirin hep ayni degeri yazmasini 
  	                         // sagliyor   
	}
  System.out.println();	  
	}     
        
    	//2. senaryo: satir 2 iken bosluk dongusu iki doner yani iki bosluk verir
    	// 2.senaryo: yazdirilan sutun bu sefer 2 den baslayacak 6 ya kadar donecek yani
    	// 5 kere donecek her donusunde bir artacak cunku sutun++ dedik = sayilar ardisik
    	//3.senaryo:satir 3 iken bosluk satir degeri kadar donebilir yani 1,2 ve 3 donus= 3 bosluk
    }
}


