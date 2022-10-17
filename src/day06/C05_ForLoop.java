package day06;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Get the number of rows columns from user.
        Create a rectangle.
        rows=3 and column =5==>* * * * *
                               * * * * *
                               * * * * *

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("satır giriniz");
        int satır = scan.nextInt();
        System.out.println("sütün giriniz");
        int sütün = scan.nextInt();
        for (int i = 1; i <= satır; i++) {
            for (int j = 1; i <=sütün; j++) {
                System.out.println(" *");
            }


        }
        System.out.println();
    }
}