package HalukJava.j12_Loops.L01_ForLoop.L03_WhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        //task-> girilen    sayı 17dem küçük kazandınız yoksa kaybettiniz code create ediniz
        //do while loop ile prınt eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");

        int sayi= sc.nextInt();
        do {

          System.out.println("AGAM nassıng :) bir tamsayı giriyorsun : ");

          System.out.println("kazandınız.....:)");
         sayi++;

      }while(sayi<17);
        System.out.println("Kaybettiniz.....:(");












    }
}
