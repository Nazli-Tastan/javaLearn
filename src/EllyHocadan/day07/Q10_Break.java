package EllyHocadan.day07;

import java.util.Scanner;

public class Q10_Break {
      /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */
      public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.print("Bir sayi giriniz :");
          int sayi =scan.nextInt();

          boolean asalMi = true;
          if(sayi>=2){
              for (int i=2;i<sayi; i++){
                  if(sayi%i==0){
                      asalMi = false;
                      break;
                  }
              }if(asalMi) {
                  System.out.println(sayi + " sayisi asaldir");
              }else System.out.println(sayi + " sayisi asal degildir");

          }else System.out.println(sayi + " sayisi asal degildir..");

      }




}
