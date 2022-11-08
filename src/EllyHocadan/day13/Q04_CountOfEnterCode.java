package EllyHocadan.day13;

import java.util.Scanner;

public class Q04_CountOfEnterCode {
    //STRİNG OLAN PIN kodumuzu kontrol eden bir code creat ediniz
    public static void main(String[] args) {
        String pın="nazlı12345";
        int girişHakki=4;
        Scanner sc=new Scanner(System.in);
        System.out.println("***hoş eldiniz****");

        while (true) {
            System.out.println("pin giriniz");
            String girilenpin=sc.next();

            if(pın.equals(girilenpin)){
                System.out.println("basarılı giriş yaptınız");
                break;

            }else{
                System.out.println("yanlış giriş yaptınız");
                girişHakki--;

            }if(girişHakki==0){
                System.out.println("giriş hakkı kalmadı");
                break;

            }//istenırse puk kodu oluşturulabilr.
        }




    }



}
