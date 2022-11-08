package j13_Break_Contınue;

import java.util.Scanner;

public class Q05_CertaınCharacterCount {
    public static void main(String[] args) {

        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         * ORNEK:
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner sc= new Scanner(System.in);
        System.out.println("bir cümle giriniz:");
        String cümle=sc.nextLine();

        System.out.println("harf giriniz");
        char harf=sc.nextLine().charAt(0);

        int count=0;
        for(int i=0;i<cümle.length();i++) {
            if(cümle.charAt(i)==harf){
                count++;

            }
        }
        System.out.println("girdiğiniz cümlede "+harf+"harfi"+count+" kadar kullanılmıs.");


    }


}
