package j35_Collection.C01_LinkedList.C02_Set;

import java.util.Arrays;
import java.util.HashSet;

public class Task05 {
    /*
    Task
    totalCount() isminde bir method oluşturun.
    Parametresi  'Integer Hashset' olmalı

    HashSetteki eleman sayısını alın.
    totalCount'u döndürün.
    Örnek:
    hashset ; 4,2,3,1,7
    cevap: 5
     */

    public static void main(String[] args) {

        HashSet<Integer> ht = new HashSet<Integer>(Arrays.asList(4,2,3,1,7));
        System.out.println(totalCount(ht));



    }

    private static int totalCount(HashSet<Integer> ht) {
        return ht.size();
    }


}
