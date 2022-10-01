package day04;

import java.util.Scanner;

public class C04_StringManipulatıon {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str =scan.next();
        String s=str.substring(str.length()-2);

        if(str.length()>=3){
            System.out.println(s+s+s);

        }else System.out.println(str);
    }
}
