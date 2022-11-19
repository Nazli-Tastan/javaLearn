package j35_Collection.C01_LinkedList.C02_Set;

import java.util.HashSet;
import java.util.List;

public class Task01 {
    /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>(List.of("banana", "strawberry", "kiwi", "pineapple"));
        String s1 = "banana";
        String s2 = "peach";

        System.out.println(changeSet(h, s1, s2));

    }

    private static HashSet changeSet(HashSet<String> h, String s1, String s2) {
        if (h.contains(s1)) {
            h.remove(s1);
            h.add(s2);

        }
        return h;

    }
}