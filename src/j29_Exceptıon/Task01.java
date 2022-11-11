package j29_Exceptıon;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen pasword 6 karakterden az ve 10 karakterden fazla olmasını kontrol eden code create ediniz

         */
        Scanner sc= new Scanner(System.in);
        System.out.println("agam pasword giresen");
        String pasword = sc.nextLine();

        try {
            if (pasword.length()<6){
                throw new IllegalArgumentException("6 KARAKTERDEN AZ GİRDİN");
            }else if(pasword.length()>10){
                throw new IllegalArgumentException("10 karakterden fazla pasword");
            }else System.out.println("pasword gecerli"+pasword);

        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("Allah bildiği gibi yapsın");
        }
        System.out.println("Sorun handle edildi");//bu satır calıştıysa pr sorunsuz kırılmadan run edildi.

/*HALLUK HOCA ÇÖZÜM
 Scanner sc = new Scanner(System.in);
        System.out.print("agam password giresen : ");
​
        String password = sc.next();
​
        try {
            if (password.length()<6 ||password.length()>10){
                throw new StringIndexOutOfBoundsException("agam 6 karakterden az ya da 10 karakterden fazla girdin ne ayak :( ");
            }
            else System.out.println("agam password geçerli :) "+password);
​
        } catch (StringIndexOutOfBoundsException ebikGabık) {
            System.out.println(ebikGabık);
            System.out.println("agam allah bildği gibi selametle :( ");
        }
        System.out.println("agam sorun handle edildi DEWAMKEEE :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur
    }
}



 */


    }
}
