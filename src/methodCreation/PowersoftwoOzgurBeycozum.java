package methodCreation;

import java.util.Scanner;

public class PowersoftwoOzgurBeycozum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("integer giriniz");
        int num=scan.nextInt();
        PowersofTwo(num);
    }
    private static void PowersofTwo(int num) {

        if (num%2==0) {
            num /=2;
            if (num == 1) {
                System.out.println("Girilen sayi 2'nin kuvvetidir");
            }else{
                PowersofTwo(num);
            }
        }else{
            System.out.println("Girilen sayi 2'nin kuvveti degildir");
        }
    }
}



