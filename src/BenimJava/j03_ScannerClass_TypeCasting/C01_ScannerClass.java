package BenimJava.j03_ScannerClass_TypeCasting;

import java.util.Scanner;

import static java.lang.System.*;
import static java.sql.DriverManager.println;

public class C01_ScannerClass {

    public static void main(String[] args) {
        // kullanıcıdan veri almak içinn şu adım takip edilir
        //1. adım-> Scanner class'dan obj create edilir.

          Scanner scan = new Scanner(in);// Scanner classından scan isminde değerini System içinden alan bir obj.

        //  // 2 adım->Kullanıcıdan istenen veri için bildirimde bulunulur->sout("...");
         out.print("adınızı giriniz :");

        //  // 3. adım-> kuulanıcının girdigi veri data type'ne göre bir variable atanır.
         String isim=scan.nextLine();// kullanıcıdan gelen String tipinde isim verisi scan obj'ni nextLine() methodu ile atandı

        out.println("isim = " + isim);

        // Task -> Kullanıcının girdiği değere göre kare alanı ve cevresini hesaplayan bir code create ediniz...

        Scanner sc = new Scanner(in);//1. adım
        out.print("karenin kenarı giriniz : ");// 2. adım
        int kenar=sc.nextInt();//3. adım
        out.println("alan : "+(kenar*kenar)+" çevre :"+(kenar*4));
         /*
         Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
         Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
         1 seker = 1.7 gr
         Ornek : Input : cay sayisi : 10 seker sayisi :2
                 Output : Yilda 12.41 kg seker kullaniyorsunuz
         */
        out.println("günlük içtiğniz çay sayısını giriniz :");//çay için 2 adım
        int caySayisi=sc.nextInt();//çay için 3 adım

        out.println("şeker sayinizi giriniz : "); // şeker için 2. adım
        int seker=sc.nextInt();// seker için 3 adım

        out.println("yıllık seker tüketiminiz : "+(caySayisi*seker*1.7*365)/1000+"kg");
        //bu sayfayı kontrol et

   //System out.println("İsminizi giriniz");
   // char ch=sc.nextLine().charAt(0);
   //     out.println("isminizin ilk karakteri:"+ch);



    }
}