package _07_ForLoop;

public class Q15 {

    /*
        A //  2. senaryo baba 1 evlat 0 icteki for bir kere dondu ve harf+evlat yine 65 cunku
        A B// harf 65 iken evlat 0 ayni harfi yazdi. evlat 1 olabilir cunku babaya esit oldu
        A B C//bu sefer evlat 1 baba 1 icteki for bir kere daha calisti 65+1 i yazdi yani B yi
        A B C D//evlat 2 olursa baba 1 ken calismayacak ve evlat dongusunden cikilacak
        A B C D E//yine baba dongusune gelecek baba 2 olacak
        A B C D E F
        şeklini yazdırınız.  65=A'nın ascıı değeri       */
    public static void main(String[] args) {
    	int harf=65;
    	char ch=(char)harf;
    	char ch2=(char)(harf+5);
    	System.out.println(ch);//A
    	System.out.println(ch2);//F
for (int baba = 0; baba <= 6; baba++) {//ilk senaryo baba 0 evlat 0
	for (int evlat =0 ; evlat <=baba; evlat++) {//20.satiri yazdi sonra evlat 1 olursa baba 0 olursa icteki for sarti saglanmiyor  
		System.out.print(     (char)(harf+evlat)+" "    );//ilkte harf 65+evlat 0 harfi yazdi
	}//icteki for evlat 1 baba 0 ken donemedi ve icteki fordan disari cikti
	System.out.println();//burayi yapti ve distaki fora gitti babayi bir artirdi
}
    	
    /*	
    	
    	int harf=65;
      for (int baba = 0; baba < 6; baba++) {
    	    	  
    	  for (int evlat = 0; evlat <=baba; evlat++) {
    		  System.out.print((char)(harf+evlat)+" ");
			
		}
		System.out.println();//
	}
        */
    }
}