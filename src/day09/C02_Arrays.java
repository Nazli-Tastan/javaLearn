package day09;

public class C02_Arrays {
    public static void main(String[] args) {

        String str=("Verilen bir cümledeki boşluklar hariç karakter sayısını yazan bir kod creat ediniz");
       //SALİHA HANIMDAN ÇÖZÜM
       // System.out.println(str.replace(" ", "").length());

        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */

            //1.yol

            //String str = "Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
            //System.out.println( str.replace(" ", "").length()); //71

        //2.yol
            String [] arr = str.replace(" ", "").split("");
            System.out.println(arr.length); //71
            //3.yol






        }
}
