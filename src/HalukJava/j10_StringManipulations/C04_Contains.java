package HalukJava.j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        Sring içerisinde istenen stringin varlığını kontrol eden bir booleean return eder
         */

        String s1="Enise hanım basarılı bir Qa Tester team lead";
        System.out.println(s1.contains("hanım"));//true
        System.out.println(s1.contains("E"));
        System.out.println(s1.contains(" "));


        String S2="Qa";
        System.out.println(s1.contains(s1));//true
        System.out.println(S2.contains(s1));

        //Girilen bir cümlede aranan bir kelime olup olmadığını code create eden bir code yazın




    }
}
