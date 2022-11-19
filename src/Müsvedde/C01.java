package Müsvedde;

import java.io.IOException;
import java.util.Scanner;

public class C01 {


        public static final String R = "\u001B[31m";
        public static final String G = "\u001B[32m";
        public static final String Y = "\u001B[33m";
        static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(Y + "Dikkat sıcaklık kontrolü için lütfen bir derece Celcius(C) değeri giriniz : ");

        try {
            sıcaklıkKontrol();
            System.out.println(G + "hava hojdur ama benena, sen çık dışarı gez...!!");

        } catch (IOException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        } catch (Exception e) {
            System.out.println("hatalı giriş lütfen tekrar giriniz : " + e.getMessage());
        }
    }

    private static void sıcaklıkKontrol() throws IOException {
        double C = scanner.nextDouble();
        if (C < 10) {
            throw new IOException(R + "lütfen dikkat ediniz dışarıda ayaz var !!! ");
        }

    }

}
/*
    String[][]chs=new String[2][];
    chs[0]=new String[2];
    chs[1]=new String[5];
    int i=97;
    for(int a=0; a<chs.length; a++){
           for (int b=0;b<chs.length; b++) {
               i++;
           }
       }
    for(String[]ca:chs){
        for(String c:ca){
            System.out.println(c+" ");
        }
        System.out.println();
    }
    }


            }



 */

