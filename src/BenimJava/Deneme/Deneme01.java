package BenimJava.Deneme;

import java.util.Scanner;

public class Deneme01 {
    public static void main(String[] args) {
/*
        int sayi1 =100;
       int sayi2 =90;
         //sayi1>sayi=> boolean (true ya da false)
        System.out.println( sayi1 > sayi2);
        System.out.println( sayi1 < sayi2);
        System.out.println( sayi1 == sayi2);
        System.out.println( sayi1 != sayi2);



        //ternay ve if kullanımı
        //Koşul? birinci:ikinci

/*
        String isim="" ;
        int   sayi=40;
        if(sayi >20){
            isim="Ayşe";

        }else{
            isim="Ayşegül";
        }



        System.out.println(isim);

 */

//ternary kullanalım şimdi de
        String isim="";
      int sayi =10;
        isim =sayi>20?"Ayşe":"Ayşegül";
        System.out.println(isim);
       isim=sayi>50?(sayi>80?"Ayşe":"Büşra"):("Kübra");

        System.out.println(isim);

        //Koşul ?
        // (yeniKOŞUL1 ?"" :"" );
       // false için

/*
        int sayi=95;

        if (sayi>=50){
            System.out.println("Sayı 50 den büyük");

        }

    if (sayi<=50){
        System.out.println("Sayı 50 den küçük");


    }

/*


String diller ="arapça,ingilizce,fransızca,İspanyolca";
    if (diller.contains("türkçe"));{
            System.out.println("türkçe biliyorsunuz");

        }

        if(diller.contains("ispanyolca"));{
            System.out.println( "ispanyolca biliyorsunuz");
        }

        String cinsiyet="Erkek";

        int yas=21;
        if(yas>20){
            if(yas>=20 && cinsiyet.equals("Erkek"));
            System.out.println("Askere gidebilirsiniz");
        }else{
            System.out.println("Askere gidemezsiniz");

        }



*/
        Scanner input =new Scanner(System.in);
        System.out.println("İşlem seçiniz");
        String seçim=input.next();

        System.out.println("ilk sayıyı giriniz");
        int sayi1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        int sayi2=input.nextInt();

        System.out.println(sayi+sayi2);






    }
}
