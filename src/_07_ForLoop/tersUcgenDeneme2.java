package _07_ForLoop;

public class tersUcgenDeneme2 {

	public static void main(String[] args) {
//      1 2 3 4 5 6   // sutunu  arttirirsak  bu sekilde  yazacak
//      2 3 4 5 6    //satiri artirirsak 2 2 2 2 2 yazacakti cunku satir sabitken sutun donmeye
//       3 4 5 6 // devam ediyor
//        4 5 6
//         5 6
//          6       seklini konsola yazdiriniz.
   	
   	
   	for (int satir = 1; satir <= 6; satir++) {
   		for (int bosluk = 1; bosluk <=satir ; bosluk++) {
			System.out.print(" ");
			}
   		for (int yazdirilan = satir; yazdirilan <=6; yazdirilan++) {
   			System.out.print(yazdirilan+" ");
				
			}
			System.out.println();
		} 

	}

}
