package day06;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

        // Kullanicidan iki sayi isteyin.
// Girilen sayilar ve aralarindaki tum
// tamsayilari toplayip, sonucu yazdiran bir program yazınız.


        Scanner sc = new Scanner(System.in);
        System.out.println("iki sayı giriniz" );
        int sayi1= sc.nextInt();
        int sayi2= sc.nextInt();

        int toplam=0;

        if(sayi1< sayi2){
            for(int i=sayi2; i<sayi1; i++){
                toplam+=i;
            }
            System.out.println(sayi1+"ile"+sayi2+"arasındaki sayıların toplamı");
        }else{
            System.out.println("sayılar eşittir");
        }






    }
}
