package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı giriniz");
        String str1 = scan.nextLine();
        System.out.println("Soyadınızı giriniz");
        String str2 = scan.nextLine();

        System.out.print(str1.substring(0, 1).toUpperCase() + str1.substring(1));
        System.out.println(""+str2.substring(0, 1).toUpperCase() + str2.substring(1));


    }
}
