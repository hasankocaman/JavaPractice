package arrays;

import java.util.*;

public class Tumlelemanlarincarpimi {
    public static void main(String[] args) {
        /*Aşağıdaki multi dimensional arry'in iç arraylerindeki son elemanlarının çarpımını
         yazdıran bir program yazın .
{{1,2,3},{4,5},{6}}
{{1,2,3},{4,5,6}} bu array'i kullanarakta tum elemanların çarpımını yazdıran bir method yazınız.

         */
        int[][] arr ={{1,2,3},{4,5},{6}};
//arr[kat][daire]
        //arr[1][1]

        sonElemanlarinCarpimi(arr);//void    veya return type

        sonElemanlarinCarpimiNilgun(arr);


        int arr2[][]={{1,2,3},{4,5,6}};
        butunElemanlarinCarpimi(arr2);
        butunElemanlarinCarpimiNilgun(arr2);

    }

    private static void butunElemanlarinCarpimi(int[][] arr2) {
        int butunElemanlarinCarpimi = 1;
        Set<Integer>butunElemanlar=new HashSet<>();
        for (int kat = 0; kat < arr2.length ; kat++) {
            for (int daire = 0; daire <arr2[kat].length ; daire++) {
                butunElemanlar.add(arr2[kat][daire]);

            }

        }
        System.out.println("butunElemanlar = " + butunElemanlar);
        for (Integer w: butunElemanlar
             ) {
            butunElemanlarinCarpimi*=w;

        }
        System.out.println("butunElemanlarinCarpimi = " + butunElemanlarinCarpimi);
    }

    private static void sonElemanlarinCarpimi(int[][] arr) {
        int sonElemanlarinCarpimi=1;
        Set<Integer> sonElemanlar=new HashSet<>();

        for (int kat = 0; kat <arr.length ; kat++) {
            for (int daire = 0; daire <arr[kat].length ; daire++) {
                sonElemanlar.add(arr[kat]  [arr[kat].length-1]);            }
        }
        System.out.println(sonElemanlar);
        for (Integer w: sonElemanlar
             ) {
            sonElemanlarinCarpimi*=w;

        }
        System.out.println("sonElemanlarinCarpimi = " + sonElemanlarinCarpimi);


    }


    private static void sonElemanlarinCarpimiNilgun(int[][] arr) {

        int carpim = 1;

        for (int kat = 0; kat < arr.length; kat++) {
            carpim*=(arr[kat][arr[kat].length - 1]);
        }
        System.out.println("Nilgunun cozumu = " + carpim);
    }






    private static void butunElemanlarinCarpimiNilgun(int[][] arr) {

        int carpim = 1;

        for (int kat = 0; kat <arr.length ; kat++) {
            for (int daire = 0; daire <arr[kat].length ; daire++) {
                carpim*=arr[kat][daire];

            }

        }

        System.out.println("Nilgunun cozumu butun elemanlarin carpimi = " + carpim);
    }

}

