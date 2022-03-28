package patikasorular;
import java.util.*;

public class Q01 {
    public static void main(String[] args) {
        //Have the function FirstFactorial(num)
        // take the num parameter being passed and return the factorial of it.
        // For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
        // For the test cases, the range will be between 1 and 18 and the input will always be an integer.


                // keep this function call here


        Scanner s = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int girilenSayi= s.nextInt();
        System.out.println("girilenSayi = " + girilenSayi);

        FirstFactorial(girilenSayi);
               // System.out.print(FirstFactorial(s.nextInt()));
        System.out.println("FirstFactorial(girilenSayi) = " + FirstFactorial(girilenSayi));

    }



    public static int FirstFactorial(int girilenSayi) {
      // System.out.println("sayi giriniz");
      // Scanner scan = new Scanner(System.in);
      //  girilenSayi= scan.nextInt();
            // code goes here
int num=1;
        for (int i = 1; i <=girilenSayi ; i++) {
            num*=i;

        }
            return num;
        }


    }

