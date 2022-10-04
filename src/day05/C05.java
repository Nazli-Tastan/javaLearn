package day05;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayi giriniz: ");
        double sayi1 = scan.nextInt();

    }

    public static double mtr(double x) {
        return x / 100;

    }
    public static double kilometer (double y) {
        return y / 100000;
    }
    public static void convertFromSM(double sayi){
        System.out.println("girilen santimeter degeri : " + sayi/100 + " metre\n" + sayi/100000 + " kilometredir");
    }


}