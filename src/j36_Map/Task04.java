package j36_Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Task04 {

    ///			KELİME ANALİZİ

    /*
     * Girilen bir metinde kelimelerin kaç kere geçtiğini bulan program yazınız.
     *
     * 1. Adım : ( Kelime = Kaç Kere Geçiyor ) Şeklinde veri tutmak için HashMap oluşturun.
     * 2. Adım : Girilen metni split methodu ile parçalayalım.
     * 			 ilk önce "." ya göre parçalayıp cümleleri elde edelim
     * 			 daha sonra " " boşluğa göre parçalayıp kelimeleri elde edelim
     * 3. Adım : Tüm kelimeleri kontrol etmek için for döngüsü kullanalım ve tüm kelimeleri oluşturduğumuz hashMap'e aktaralım.
     * 			 Eğer hashmap'te yoksa ekleyelim ve sayısına 1 yazalım.
     * 		 	 Eğer hashmap'te zaten varsa, sayısını bir artıralım.
     * 3. Adım : Tüm kelimeler kontrol edildikten çıktı verelim. Ve tüm kelimeleri tekrar sayısıyla birlikte gösterelim.
     *
     * İpucu : "." özel karakter olduğu için "\\." şeklinde split ediniz.
     * */


    public static void main(String[] args) {
        String str = "Bir Berber bir berberer gel beraber bir berber dükkanı açalım demiş";
        HashMap<String, Integer> hm = new HashMap<>();
        String[] arr = str.split(".");
        String[] arrYeni = str.split(" ");
        System.out.println(Arrays.toString(arrYeni));
        HashMap<String, Integer> sayacmaps = new HashMap<>();
        for (String w : arr) {
            if (!sayacmaps.containsKey(w)) {
                sayacmaps.put(w, 1);

            } else {
                sayacmaps.put(w, sayacmaps.get(w) + 1);
            }
            System.out.println("sayacmaps" + sayacmaps);
        }

    }
}
