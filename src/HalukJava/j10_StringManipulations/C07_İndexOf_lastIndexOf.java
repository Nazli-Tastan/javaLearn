package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class C07_İndexOf_lastIndexOf {
    public static void main(String[] args) {


/*
task
 Girilen cümlenin aşaıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var
 */


        Scanner sc= new Scanner(System.in);;
        System.out.println("Kafi miktar bir cümle giriniz");

        String cümle=sc.nextLine().toLowerCase();
        if (cümle.indexOf("java")==-1){
            System.out.println("girilen cümle java içer miyor");
        }else if (cümle.indexOf("java")==cümle.lastIndexOf("java")){
            System.out.println("gİRİLEN CÜMLE 1 JAVA İÇERİR");
        }else System.out.println("girlilen cümle birden fazla java içerir");










        

    }
}
