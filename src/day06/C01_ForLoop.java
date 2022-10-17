package day06;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*
        100'den 0'A KADAR 13'E BÖLÜNEN SAYILARI PRİNT EDEN CODE CREATE EDİNİZ
        Ekrana çıktısı aşağıdaki gibi olsun
        istenen sonuç
        91
        78
        65
        52
        39
        26
        13
         */

        System.out.println(  "istenen sonuç");
        int toplam=0;
        for (int i=100; i>=0;i--){
            if(i%13==0){
                System.out.println(i);
                toplam+=i;
            }
        }
        System.out.println("toplam="+toplam);

    }
}
