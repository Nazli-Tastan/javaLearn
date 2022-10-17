package day06;

public class C02_ForLoop {
    public static void main(String[] args) {

        /*
        INTERVİEW QUESTIONS
        0-255  e kadar olan harlerin , sayı ve harf değerini ekrana yazdırınız.
         */
       /*ilk çözüm
       for (char i = 0; i <= 255; i++) {
       System.out.println(i);
       int i olarak for dögüsü açarsak char cast yapmak gerekirASAĞIDAKİ GİBİ

        */
        System.out.println("***for ile**");
            for (int i = 0; i <= 255; i++) {
                char karakter = (char) i;
                System.out.println(i+"->"+karakter);

            }

        System.out.println("*** while ile **");
        int a=0;
        while(a<=255){
            char krktr= (char) a;
            System.out.println(a+"->"+krktr);
            a++;
        }


        System.out.println("***** do while ile***");
        int b=0;
        do{
           char k = (char) b;
            System.out.println(b+"->"+k);
            b++;
        }while (b<=255);


        }
    }

