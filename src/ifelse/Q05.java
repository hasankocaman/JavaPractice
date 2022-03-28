package ifelse;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        //Kullanıcıdan bir şifre girmesini isteyin. Aşağıdaki şartları sağlıyorsa
        // "şifre başarılı ile tanımlandı", şartları sağlamazsa
        // "işlem başarısız lütfen yeni bir şifre giriniz" yazıdırın.
        //- ilk Harf Büyük harf olmalı
        //- Son harf küçük harf olmalı
        //- Şifre boşluk içermemeli
        //- Şifre uzunluğu en az 8 karakter olmalı.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen en az 8 karakterli bir sifre giriniz");
        String sifre= scan.next();

        boolean ilkHarf= false;
        if (sifre.charAt(0)>= 'A' && sifre.charAt(0)<='Z'){
            ilkHarf=true;
        }else {
            System.out.println("Sifrenizin ilk harfi Buyuk Harf olmali");
        }
        boolean sonHarf=false;
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
            sonHarf=true;
        }else {
            System.out.println("Sifrenizin son harfi kucuk harf olmali");
        }
        boolean bosluk= false;
        if (!sifre.contains(" ")){
            bosluk=true;
        } else {
            System.out.println("sifre bosluk icermemeli");
        }
        boolean uzunluk=false;
        if (sifre.length()>=8){
            uzunluk=true;
        } else {
            System.out.println("Sifre en az 8 karakter olmali");
        }
        if (ilkHarf && sonHarf && bosluk && uzunluk){
            System.out.println("sifreniz basarili bir sekilde kaydedildi");
        }

    }
}
