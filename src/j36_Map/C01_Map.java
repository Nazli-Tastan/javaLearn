package j36_Map;

import java.util.Arrays;
import java.util.HashMap;

public class C01_Map {
    public static void main(String[] args) {
 /*  Map bir interface'dir. Map interface'inin 3 tane child class'i vardir

1) HashMap: HashMap key-value yapisini kullanir. Key ve value   programci tarafindan yazilir. Key değeri benzersiz(unique) olmalı
             dublicate kabul etnez
             Key ve value'da null degeri kullanilabilir. Key'de  1'den fazla null degeri kullanilirsa Java son kullanilan
            null'i kabul eder. Value'da 1'den fazla null degeri kullanilabilir.
            HashMap console'a yazdirildiginda hem key degerleri hem de value degerleri aralarina = sembolu konularak yazdirilir
            HashMap'ler tanımlanırken rastgele siralama yapar  HasMap map'ler arasinda en hizlisidir.
            HashMap'ler "thread safe" degildir.
 */

    String str="Helloo";
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));

        for(String w:arr) {
            if(!map.containsKey(w)) {
               map.put(w,1);
            }else {
                map.put(w,map.get(w)+1);
        }
}
        System.out.println(map);
    }
}

/*// Verilen map te istenen programlama dilini bilen kişileri list olarak
        // donduren bir nethod yazın..
        // {101=Ali,Can,java, 102=Veli,Yan,java, 103=Ali,Yan,C/}
        String istenenDil = "JAVA";
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Ali,Can,Java");
        map1.put(102, "Veli,Yan,Java");
        map1.put(103, "Ali,Yan,C#");
        System.out.println(javaBilen(map1, istenenDil));
    }
    public static List<String> javaBilen(Map<Integer, String> map1, String istenenDil) {
        List<String> isimList = new ArrayList<>();
        System.out.println(isimList);
        for (String each : map1.values()) {
            String arr[] = each.split(",");
            System.out.println(Arrays.toString(arr));
            // System.out.println(isimList);
            if (arr[2].equalsIgnoreCase(istenenDil)) {
                isimList.add(arr[0]);
            }
        }
        System.out.println(isimList);
        return isimList;
    }


 */



