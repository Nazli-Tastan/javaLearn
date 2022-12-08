package HalukJava.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class x {
    public static void main(String[] args) {
        System.out.println("-1 için çalışma");
        List<String> l3= new ArrayList<>(Arrays.asList("Murat","Adem","Sümeyra","Ümit","İsmail"));
        ListIterator<String> d =l3.listIterator();


        while(d.hasNext()){
            d.next();
            System.out.println("d.nextIndex() = " + d.nextIndex());
        }
    }
}
