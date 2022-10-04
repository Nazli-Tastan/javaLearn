package day04;

import java.util.Scanner;

public class day05 {
    /*

public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int
		 a = scan.nextInt();
		System.out.println(isEven(a));
		}
	public static boolean isEven(int n) {
		if (n%2 == 0) {
			return true;
		}else return false;
	}


     */




    /* Write a method named isEven that accepts an integer argument.
           The method should return true if the argument is even, or false otherwise.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz :");
        int sayi = scan.nextInt();
        System.out.println(isEven(sayi));
    }
    public static boolean isEven(int sayi) {
        return  sayi%2 == 0 ? true :false;
    }


    ///*
    // cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
    //  */




    }













