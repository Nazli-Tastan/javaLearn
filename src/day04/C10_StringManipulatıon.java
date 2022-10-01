package day04;

public class C10_StringManipulatıon {


    // soru: "   Java ogrenmek123 Cok guzel@      " Stringini "Java ogrenmek cok guzel" seklinde yazdirin.

    public static void main(String[] args) {
        String s="Java öğrenmek123 Cok güzel@";
        s=s.replaceAll("\\d","")
                .replace("@","")
                        .replace("C","c")
        .trim();
        System.out.println(s);












    }


}
