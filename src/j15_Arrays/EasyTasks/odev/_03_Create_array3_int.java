package j15_Arrays.EasyTasks.odev;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*  elemanları   : 25,30,30,35,100 olan   İnt Array oluştur ve
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        int Array[] = new int[5];

       Array[0]=25;
       Array[1]=30;
       Array[2]=30;
       Array[3]=35;
       Array[4]=100;

       int toplam=0;
       for (int i = 0; i <Array.length; i++){
          toplam+=Array[i];
       }
        System.out.println(Arrays.toString(Array));
        System.out.println(toplam);


































/*
    int arr[]=new int[5];
    arr[0]=25;
    arr[1]=30;
    arr[2]=30;
    arr[3]=35;
    arr[4]=100;

    System.out.println(Arrays.toString(arr));
    int toplam=0;
    for (int i=0; i<arr.length;i++){
        toplam+=arr[i];
    }
        System.out.println("toplam="+toplam);



 */
    }
}