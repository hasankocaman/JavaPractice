package _07_ForLoop;

public class Q09 {

    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yukarıdaki çarpım tablosunu 10 a kadar ekrana yazdırınız.
    	for (int satir = 1; satir <=1; satir++) {
    		for (int sutun = 1; sutun <= 10; sutun++) {
    			System.out.print(satir+ " * " + sutun +" = " + (satir*sutun));
				System.out.println();
			}
			
		}
    	//hocanin cozumu
    	/*
    	
    	for (int satir = 1; satir <= 10; satir++) {
    		for (int sutun = 1; sutun < satir; sutun++) {
    			System.out.println(sutun+"*"+satir+"="+(satir*sutun)   );
    			break;
    			
				
			}
			
		}


       */

    }
}
