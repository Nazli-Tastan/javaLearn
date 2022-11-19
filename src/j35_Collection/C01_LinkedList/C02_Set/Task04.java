package j35_Collection.C01_LinkedList.C02_Set;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task04 {
   /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */
   public static void main(String[] args) {
    LinkedHashSet<String> h=new LinkedHashSet<>(Arrays.asList("Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil"));
       String s1= "Germany";
       System.out.println(h);
       String s2 ="USA";
       System.out.println(removing(h, s1, s2));
   }

    private static LinkedHashSet removing(LinkedHashSet<String>h , String a, String b){
  if(h.contains(a)||h.contains(b)){
    h.remove(a);
    h.remove(b);

  }

  return h;

    }


}
