package j15_Arrays.EasyTasks.odev;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

    int sayi[]= new int[4];
    sayi[0]=14;
    sayi[1]=19;
    sayi[2]=5;
    sayi[3]=21;
        Arrays.sort(sayi);
        System.out.println(sayi[0]);
    }
}

