package methodCreation;
/*
Java dilini kullanarak, PowersofTwo(num) methodu yaziniz. Kullanicidan gelen integer tipindeki datayi methodda parametre olarak kullanin
  * alinan sayi ikinin kuvveti ise  true döndürün.
  *
  * Değilse,  false döndürün
  *
  * Örneğin, giriş 16 ise, programınız sonucu true olarak döndürmelidir.
  *veya girdi 22 ise sonuc false olmalıdır.
 */

import java.util.Scanner;

public class PowerOfTwo {
    static Scanner scan=new Scanner(System.in);

    String check(int num)
    {
        if( (num & (num - 1)) == 0)
            return "true  ikinin kuvveti";

        else
            return "false  ikinin kuvveti degil";
    }

    public static void main (String[] args)
    {
        PowerOfTwo underTest = new PowerOfTwo();
        System.out.println("integer sayi giriniz");
        int num=scan.nextInt();

       // System.out.println(underTest.check(num));
        poweroftwo(num);
    }

    private static void poweroftwo(int num) {


        boolean sonuc = false;
        for (int i = 0; i < num; i++) {
            if (num == Math.pow(2, i)) {
                sonuc = true;
                break;
            }
        }
        System.out.println("sonuc = " + sonuc);
    }



    }
