package j15_Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class calismaKlasörü2 {

    public static void main(String[] args) {
        // ArrayList <DataType> list1 = new ArrayList < DataType >();
        // ArrayList < DataType > list2 = new ArrayList<>();
        // List < DataType > list3 = new ArrayList<>(); -> Best Practice
        // ArrayList < DataType > list4 = new List<>();
        //System.out.println(lArrayListName);
        // DataType kesinlikle primitive data olamaz
        //arrayListName.add(value); -> ArrayList’ eleman ekler
        //List<integer> list = new ArrayList<>(Arrays.asList(7,11,15,10));//Arrays.asList()değer tanımlama ve atamada kullan

   //Integer sayi[]={10,20,30};
   //List<Integer> list = Arrays.asList(sayi);
   //    System.out.println(list);
   //    list.add(40);

     List<Integer> name = new ArrayList<Integer>(Arrays.asList(10,20,30));
        System.out.println(name);
        name.add(40);
        name.add(1,40);

        //(listName.indexOf(eleman))   ELEMANIN INDEX NOSUNU BULUR EĞER OLMAYAN ELEMANSA -1 DÖNER
    }
}
