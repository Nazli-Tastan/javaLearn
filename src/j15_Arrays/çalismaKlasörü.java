package j15_Arrays;

import java.util.Arrays;
import java.util.List;

public class çalismaKlasörü {
    public static void main(String[] args) {
        //ARRAY DECLARETION AND VALUE ASSİGNE
        // String ageArray[ ] = {"java", "C++", "Phton"};

        // Arrays.sort(ageArray);
        // System.out.println(Arrays.binarySearch(ageArray,"java"));
        // //ARRAY YAZDIRMA
        // for ( int i= 0 ;i<ageArray.length;i++){
        //     System.out.println(ageArray[i]);
        // }
        // System.out.println(Arrays.toString(ageArray));

        //TASk-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz.
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};
        int yeniArr[]=new int[sayi.length];


        for (int i = 0; i < sayi.length; i++) {
            int toplam = 0;
            for (int j = 0; j < sayi[i].length; j++) {
                toplam = sayi[i][j];
            }
            yeniArr[i] = toplam;


        }

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
    }

}