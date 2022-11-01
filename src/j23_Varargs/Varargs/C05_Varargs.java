package j23_Varargs.Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class C05_Varargs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> sayi = new ArrayList<Integer>();
        int aa =1;
        while (aa!=0) {
            System.out.println("sayi gir : ");
            aa = sc.nextInt();
            sayi.add(aa);
        }
        Integer[] arr = sayi.toArray(new Integer[0]);  // listi arraye ceviriyor ??
        System.out.println("hesapla(sayi) = " + hesapla(arr));
    }  //main sonu
    public static int hesapla(Integer... sayilar) {
        int x = 0;
        for (int i = 0; i < sayilar.length; i++) {
            x += sayilar[i];
        }
        return x;
    }
}
