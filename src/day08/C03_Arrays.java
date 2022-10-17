package day08;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        String str="HeySiri";
        str=str.replace("Hey","Bye");
        System.out.println(str);
        String arr[]= new String[1];
        arr[0]=str;
        System.out.println(Arrays.toString(arr));
        //2.yol
        String str1 = "HeySiri";
        String yeniStr [] = str1.split("y");
        System.out.println(Arrays.toString(yeniStr)); //[He, Siri]
        yeniStr[0] = "Bye" ;
        System.out.println(Arrays.toString(yeniStr)); //[Bye, Siri]
        str1 =yeniStr[0] +  yeniStr[1];
        System.out.println("str1 = " + str1);
        String arr2[] = new String[1];
        arr2[0] = str1;
        System.out.println(Arrays.toString(arr2));


    }
}
