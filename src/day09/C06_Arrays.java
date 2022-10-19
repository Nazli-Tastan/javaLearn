package day09;

import java.util.ArrayList;
import java.util.List;

public class C06_Arrays {
    public static void main(String[] args) {
        /*
         * verilen arrayin n sayisi kadar maksimun  degerlerini bulan java programi yaziniz
         * not kisa metodlar kullamayiniz
         * Input : {1,2,3,4,5,6,7,8} input n:2 Output : 7 and 8
         */

        int[] arr = {2, 5, 8, 78, 12, -4, 11, 0};
        int n = 3;
        //bir liste olusturalim
        List<Integer> list = new ArrayList<>();
        for (Integer each : arr) {
            list.add(each);


        }
    }
}