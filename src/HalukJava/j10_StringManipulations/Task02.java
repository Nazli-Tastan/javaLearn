package HalukJava.j10_StringManipulations;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        Grilen paswordun aşağıdaki şartları sağlamasını kontrol eden bir code create edin
        a)ilk karakter büyük harf olmalı
        b)Son karakter Sayı olmalı
        c)en az 6 karakter olmalı
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Pasword");
        String password = scan.nextLine();


        if (password.charAt(0) >= 'A' && password.charAt(0) <= 'Z') {
            if ((password.charAt(password.length() - 1) >= '0' && password.charAt(password.length() - 1) <= '9')){
                if (password.length() >= 6) {
                    System.out.println("Password doğru");
                } else System.out.println("hatalı giriş");


            }
        }

    }
    }