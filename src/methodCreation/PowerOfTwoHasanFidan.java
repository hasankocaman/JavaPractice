package methodCreation;

import java.util.Scanner;

public class PowerOfTwoHasanFidan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pozitif tam sayi giriniz");
        int num = scan.nextInt();
        System.out.println(powersOfTwo(num));
    }
    public static boolean powersOfTwo(int num) {
        boolean powerOfTwo=false;
        for (int i = 1; i <= Integer.MAX_VALUE ; i=i*2) {
            if (num==i){
                powerOfTwo=true;
                break;
            }if (num<i){
                break;
            }
        }
        return powerOfTwo;
    }
}




