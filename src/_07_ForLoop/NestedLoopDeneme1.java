package _07_ForLoop;

public class NestedLoopDeneme1 {

	public static void main(String[] args) {
		for (int satir = 1; satir <=5 ; satir++) {

            System.out.println("dis dongu satir = "+ satir);

            for (int bosluk = 0; bosluk < 3 ; bosluk++) {

                System.out.println("satir ="+ satir + " bosluk "+ bosluk);
                for (int yildiz = 0; yildiz < 2; yildiz++) {
                	System.out.println("* ");
					
				}


            }

            System.out.println();
        }
		
		
	}

}
