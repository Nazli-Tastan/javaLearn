package J11_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("1.notu giriniz");
        double not1= scan.nextInt();

        System.out.println("2.notu giriniz");
        double not2= scan.nextInt();

        System.out.println("3.notu giriniz");
        double not3= scan.nextInt();

double ortalamanız =ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamanız agam="+ortalamanız);


    }//main sonu
    private static double ortalamaHesapla(double a,double b,double c){
        return(a+b+c)/3;
    }





}
