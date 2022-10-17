package day06;

import java.util.Scanner;

public class C04_ForLoop {
    public static void main(String[] args) {


    /*kullanıcıdan alınan 1 den büyük tam sayı isteyin
    1 den girilen tam sayıyar kadar olan sayıların kareleri toplamını yazan code create edn
    ekran çıtısı
    Girilen sayı:4
    Karelerin toplamı:14
     */
        Scanner sc = new Scanner(System.in);
        System.out.println("1 den büyük bir sayı giriniz");
        int sayi= sc.nextInt();
        int kareToplam=0;
        for(int i=1; i<sayi; i++){
            kareToplam+=i*i;
        }
        System.out.println("Karelerin Toplamı:"+kareToplam);
    }
}