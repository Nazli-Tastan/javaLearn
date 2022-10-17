package j15_Arrays.EasyTasks.odev;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str="Hello World";
        String tersten[]= str.split("");

        for (int i = tersten.length-1;i>=0;i--){
            System.out.print(tersten[i]);
        }


    }
}