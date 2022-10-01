package HalukJava.j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C08_TernaryOperator {
    public static void main(String[] args) {

        /* Kullanıcıdan ürün miktarı ve ürün birim fiyatını alınız
        ürün miktarı 100 den fazlaysa %3 indirim yapıp ödemesi gereken
         */


 /*
		 Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın. Eğer urun miktarı 100 den fazla ise
         %33  indirim yapıp  ödemesi gereken toplam miktarı print eden code create ediniz.
		 */


        Scanner sc = new Scanner(System.in);

        System.out.println("agam urun miktarı gir bakam : ");
        int urunMiktarı = sc.nextInt();

        System.out.println("agam urun fiyatı gir bakam : ");
        int urunFiyati = sc.nextInt();

        double fatura=  urunMiktarı>100 ? (urunMiktarı*urunFiyati*0.67):urunMiktarı*urunFiyati;
        System.out.println("fatura = " + fatura);


    }
}
