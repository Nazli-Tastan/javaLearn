package j19_StaticVariable.Task04_Bisiklet;

import java.util.Scanner;

import static j19_StaticVariable.Task04_Bisiklet.Bisiklet.bisikletOlustur;

public class Bisiklet {
    /*
   Task 04->
    Bisiklet Class :Properties(fields) : hiz, vites
    method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
    vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
    vites 5 den büyük ve 1 den küçük olamaz.
    yukarıdaki methodları seçtirilen islemYap methodu ile Runner class'da obj ile methodları çalıştırınız
   Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
    */
    int hiz;
    int vites;
    Scanner sc = new Scanner(System.in);

    public void vitesArttir() {
        vites++;
        if (vites > 5) {
            System.out.println("Vites 5 ten büyük olamaz.");
            vites = 5;
        }
    }

    public void vitesAzalt() {
        vites--;
        if (vites < 1) {
            System.out.println("Vites 1 den küçük olamaz");
            vites = 1;
        }
    }

    public void hizAyarla() {
        System.out.println("Yeni hız giriniz");
        hiz = sc.nextInt();
    }

    public void durumGoster() {
        System.out.println("Vites:" + vites);
        System.out.println("Hiz:" + hiz);
    }

    public static Bisiklet bisikletOlustur() {
        Bisiklet bisiklet = new Bisiklet();
        bisiklet.hiz = 0;
        bisiklet.vites = 1;
        return bisiklet;
    }

    public void menu() {
    }

    public void secim(int secim) {

        switch (secim) {
            case 1:
                vitesArttir();
                break;
        }
        switch (secim) {
            case 2:
                vitesAzalt();
                break;
        }
        switch (secim) {
            case 3:
                durumGoster();
                break;
        }
        switch (secim) {
            case 4:
                hizAyarla();
                break;
            default:
                System.out.println("çıkıs yapıldı");
        }



        }


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Bisiklet bisiklet = bisikletOlustur();
        int secim;
        System.out.println("Bisiklete hoşgeldin");
        do {
            bisiklet.menu();
            secim = sc.nextInt();
            bisiklet.secim(secim);
        } while (secim >= 1 && secim <= 5);
    }
}