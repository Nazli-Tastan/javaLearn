package j15_Arrays.EasyTasks.odev;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */
        int sayi[]={12,2,5,15,8};//24



        int maxEleman=sayi[0];//3
        for (int i = 0; i < sayi.length;i++) {


                if (sayi[i]>maxEleman){

                    maxEleman=sayi[i];
                }
            }
        System.out.println(maxEleman);

        Arrays.sort(sayi);
        System.out.println(sayi[sayi.length-1]);
        }


    }


