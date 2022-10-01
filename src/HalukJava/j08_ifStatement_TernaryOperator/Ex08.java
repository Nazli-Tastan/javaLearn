package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
/*
        Kullanicidan bir sayi alin

        Eger sayi pozitif ise; 10dan buyuk olup olmadigini kontrol edin
        Eger 10 dan buyuk ise "Buyuksun!" yazdirin
        Eger 10 dan kucuk ise "Normalsin!" yazdirin

        Eger sayi pozitif degil ise; -10dan buyuk olup olmadigini kontrol edin
        Eger -10 dan buyuk ise "Negatifsin!" yazdirin
        Eger -10 dan kucuk ise "Cok Negatifsin!" yazdirin

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi girin");
        double sayi = scan.nextDouble();
        if (sayi > 0) {
            if (sayi > 10) {
                System.out.println("Buyuksun");
            } else {
                System.out.println("Normalsin");
            }
        } else {
            if (sayi > -10) {
                System.out.println("Negatifsin");
            } else {
                System.out.println("Cok negatifsin");


            }
        }



        //1. Adim -> 60 değerinde bir int oluşturun


        int myInt = 60;



        //2. Adim -> Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın

        // - + * / %
        // myInt % 9 == 0
        // myInt % 5 == 0

        if ((myInt % 9 == 0) && (myInt % 5 == 0)){
            System.out.println("Able to divide by 9 and 5");
        }



        //3. Adim -> Eğer int 4'e bölününce kalan 0 ise ve 15'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.

        // myInt % 4 == 0
        // myInt % 15 == 0

        if ((myInt % 4 == 0) && (myInt % 15 == 0)){
            System.out.println("Able to divide by 4 and 15");
        }






    }

}