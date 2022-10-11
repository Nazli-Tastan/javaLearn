package j15_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */


        int a;//declare edilen ama atanmayan data
        //int sayiArr[];//tanımlanan ancak atanmayan ınt type array

        String isimArr[]= {"muharrem","enise","cebrail","nazlı","özge"};
        //String isimArr[]= {"muharrem","enise","cebrail","nazlı","özge"}//hem tanmlanan hem atanan array
       int sayiArr[]=new int[5] ;//javada heap memory de 5 default->5 olan bir array
                //[0,0,0,0,0]

           //Array eleman ekleme
           sayiArr[2] =34;
           sayiArr[0] =35 ;
           sayiArr[1]  =34;
           sayiArr[3]  =61;
           sayiArr[0]  =34;//o index array elem
        //ARAY UNIQUE OLMAK ZORUNDA DEĞİL TEKRARLI ARARY ELEMANI OLABİLİR
         //aray eleman sayısı boyut değeri...

        System.out.println("sayıArr.lenght="+sayiArr.length);

        //aray son elemanı
        System.out.println( "aray son eleman:"+isimArr[isimArr.length-1]);//özge
        isimArr[isimArr.length-1]="QA ÖZGE HANIM";//array son elemanı update edildi

        //aray olmayan eleman
        //okkalı bir trick ->sayiArr[11]=23 cte vermez rte verir
        //Array elemanı print etme
        for (int i=0; i<isimArr.length; i++){
            System.out.println(isimArr[i]+" ");
        }
        System.out.println();
        System.out.println("isimArr="+isimArr);
        System.out.println(Arrays.toString(isimArr));

    }

}
