package ifelse;

public class Q04 {
    public static void main(String[] args) {
        /*
        -- Kullanıcıdan pozitif bir rakam girmesini isteyin ve girilen rakama göre çarpım tablosu oluşturun .
Örnek : 123
              246
              369 bana bu sorunun mantığını saat 15:00 dan sonra uygun olduğnuz zaman anlatabilir misiniz?
         */

        for (int baba = 1; baba <=3 ; baba++) {
            for (int evlat = 1; evlat <=3 ; evlat++) {

                System.out.print(baba * evlat);
            }

            System.out.println();
        }



    }
}
