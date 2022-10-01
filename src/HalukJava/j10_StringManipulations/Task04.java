package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str1 = scan.nextLine();
        System.out.println("İkinci kelimeyi girini");
        String str2 = scan.nextLine();


        System.out.println(str1.substring(0, str1.length()/2-1) + str2 + str1.substring(str1.length()/2, str1.length()));











    }
}
