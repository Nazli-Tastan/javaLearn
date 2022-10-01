package HalukJava.j10_StringManipulations;

public class Task08 {
    public static void main(String[] args) {


        String hrf = "ABCDEFGHIİJKLMNOÖPRSŞTUÜVYZ";


       /*
        System.out.println(hrf.indexOf("N"));
        System.out.println(hrf.indexOf("A"));
        System.out.println(hrf.indexOf("Z"));
        System.out.println(hrf.indexOf("L"));
        System.out.println(hrf.indexOf("I"));

        */


        char n=hrf.charAt(hrf.indexOf("N"));
        char a=hrf.charAt(hrf.indexOf("A"));
        char z=hrf.charAt(hrf.indexOf("Z"));
        char l=hrf.charAt(hrf.indexOf("L"));
        char ı=hrf.charAt(hrf.indexOf("I"));

        System.out.println(""+n+a+z+l+ı);



        //Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
               // String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

/*
        String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char h=harfDepo.charAt(harfDepo.indexOf("H"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char l=harfDepo.charAt(harfDepo.indexOf("L"));
        char u=harfDepo.charAt(harfDepo.indexOf("U"));
        char k=harfDepo.charAt(harfDepo.indexOf("K"));

        System.out.println(h+a+l+u+k);//asciii->toplama-> 373
        System.out.println(""+h+a+l+u+k);//string->concat-> HALUK
*/









    }


    }
