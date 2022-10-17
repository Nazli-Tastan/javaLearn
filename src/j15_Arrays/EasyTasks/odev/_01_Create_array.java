package j15_Arrays.EasyTasks.odev;

import java.util.Arrays;

public class _01_Create_array {

    public static void main(String[] args) {
        /*
        Task ->
        elemanları : Apple, Orange , Banana, Kiwi
        olan String Array (Dizi) create edip print eden code create ediniz.

         */

        //Kodu aşağıya yazınız.
        //
        String arr[]=new String[4];

       arr[0]="Apple";
       arr[1]="Orange";
       arr[2]="Banana";
        arr[3]="Kiwi";

        System.out.println("Arrays.toString(arr)=" + Arrays.toString(arr));

    }
}
