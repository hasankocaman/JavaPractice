package methodCreation;

import java.util.Scanner;

public class LongestWordAbdullahHoca {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("cumle gir");
        String sentence=scanner.nextLine();
        System.out.println(LongestWord(sentence));
    }
    private static String LongestWord(String sentence) {
        String kelimeArr[]=sentence.split(" ");
        int kelimeUzunlugu=0;
        String enUzunKelime="";
        for (int i = 0; i < kelimeArr.length; i++) {
            if (kelimeArr[i].length()>kelimeUzunlugu){
                kelimeUzunlugu=kelimeArr[i].length();
                enUzunKelime=kelimeArr[i];
            }
        }
        return enUzunKelime;
    }
}
