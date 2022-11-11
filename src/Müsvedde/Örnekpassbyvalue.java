package Müsvedde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Örnekpassbyvalue {
    //pass byvalueor pass by referans
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList(Arrays.asList(17, 23, 24));
        System.out.println("değiştir listin ilk hali:" + numList);//değiştir methoddan önce
        değiştir1(numList);
        değiştir2(numList);

        System.out.println("değiştir listin son hali:" + numList);//değiştir methoddan önce

    }
    public static void değiştir1(List<Integer> List) {
        for (Integer each : List) {
            each-=5;
            System.out.println(each+" ");
        }
        System.out.println("1.method calıştı");
    }


        public static void değiştir2(List<Integer>list) {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i) -5);
                System.out.println(list.get(i) + " ");
            }
            System.out.println("2.method calıştı");
        }

    }

