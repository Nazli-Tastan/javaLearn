package day06;

import java.util.Scanner;

public class CO6_MetCreationForLoop {
    public static void main(String[] args) {
        /*interview questıon
        write a java program to reverse a string.use forloop and method called reverse a string
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str= sc.nextLine();

        System.out.println(reverseString(str));


    }

    private static String reverseString(String str) {
        String tersiStr="";
        for(int i=str.length()-1; i>=0; i--) {
            tersiStr += str.charAt(i);
        }
       return tersiStr;
    }
}
