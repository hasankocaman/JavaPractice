package _07_ForLoop;

public class Q18 {


    public static void main(String[] args) {


//        1 // ilk senaryo: satir 0 sutun 0 sart saglandi a bir kere yazdi ++ basta o yuzden once artirdi
//        2 3// ikinci senaryo: satir 0 ken sutun bir olursa icteki fordan cikiyor 24.satira gidip
//        4 5 6// bir bosluk veriyor satiri 1 yapiyor. satir 1 sutun 0 ise sutun iki deger alabilir
//        7 8 9 10//satir 1 sutun 0 ken bir kere doner sutun 1 ken bir kere daha doner icteki
//        11 12 13 14 15//yani satir 2 olsa sutun 0,1 ve 2 degerini alacak ve uc kere donecek 
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36    şeklini konsola yazdiriniz.
    	
    	int a=0;
		for (int satir = 0; satir < 8; satir++) {
			for (int sutun = 0; sutun <= satir; sutun++) {
				System.out.print(++a +" ");
				
			}
			System.out.println();
		}	
		
			
		
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	/*
    	int a=1;
    	for (int satir = 1; satir <= 8; satir++) {
    		for (int sutun=1; sutun <= satir; sutun++) {
    			System.out.print(a++ +" ");    			
			}System.out.println("");
		}
    	*/
/*
    	int a =1;
        for (int baba = 1; baba <=8; baba++) {//satır kontrolu
            for (int ogul = 1; ogul <=baba; ogul++) { //sutun kontrolu
                System.out.print(a++ +" ");
            }System.out.println();
        }  */
        
       
    }
}
