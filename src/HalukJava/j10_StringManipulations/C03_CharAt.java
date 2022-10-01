package HalukJava.j10_StringManipulations;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
        Chart At Methodu parametre int olarak grilen index deki char degerini return eder.İndex degeri 0 dan baslar

         */

        //charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
       // index değeri 0'dan başlar

        String sehir = "Istanbul";
        System.out.println("sehir.charAt(5) = " + sehir.charAt(5));//sehir.charAt(5) = b
        char besinciİndexKrkt = sehir.charAt(5);
        System.out.println(besinciİndexKrkt);//b
        //son index karakteri --> length()-1​
        System.out.println(sehir.charAt(sehir.length() - 1));//l
        //ilk index karakter --> charAt(0)

        System.out.println(sehir.charAt(0));//I

        // System.out.println(sehir.charAt(18));// rte
        //TRICK-> charAt() index boyutunu geçerse rte verir



















    }
}
