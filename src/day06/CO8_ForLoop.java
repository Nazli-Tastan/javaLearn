package day06;

import java.util.Scanner;

public class CO8_ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("iki sayı giriniz");
        int a=scan.nextInt();
        int b=scan.nextInt();

        int toplam=0;

        if(a<b){
            for(int i=a; i<=b; i++){
                toplam+=i;
            }
            System.out.println(a +"ve " +b +"sayıları toplamı:"+toplam);
        }else if(a>b){
            for (int i=b;i>=a;i++){
                toplam+=i;
            }
            System.out.println(a +"ve " +b +"sayıları toplamı:"+toplam);
        }else{
            System.out.println("eşit sayı girdiniz");
        }


    }
}
