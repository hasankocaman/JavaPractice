package arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AyniIndexeSahipOlanlari {

        //Aşağıdaki multi dimensional array'lerin iç array'lerinde
        // aynı indexe sahip elemanların toplamını yazdıran bir program yazın.
        // arr1[]={{1,2},{3,4,5}{6}}
        // arr2[]={{7,8,9},{10,11},{12}}
        public static void main (String[]args){
            int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
            int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};
            int toplam = 0;
            for (int i = 0; i < 3; i++) {
                if (arr1[i].length > arr2[i].length) {
                    for (int j = 0; j < arr2[i].length; j++) {
                        toplam += arr1[i][j] + arr2[i][j];
                    }
                } else {
                    for (int j = 0; j < arr1[i].length; j++) {
                        toplam += arr1[i][j] + arr2[i][j];
                    }
                }
            }
            System.out.println("ayni indexdeki sayilarin toplami = " + toplam);
        }
    }