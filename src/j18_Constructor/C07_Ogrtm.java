package j18_Constructor;

public class C07_Ogrtm {
    //Fields
    public String  isim;
    int tecrube;
    public int kıdem=5;


    public C07_Ogrtm(String isim, int tecrube) {//2p'li cons
        this.isim = isim;
        this.tecrube = tecrube;
    }
    public void  kıdemHesapla(int kıdem){//int p'li void method
        System.out.println("agam kıdemin :"+(kıdem*2));//method parametesi değeri kıdeme atanır
        System.out.println("agam kıdemin :"+(this.kıdem*2));//inst. obj degeri kıdeme atanır
    }

}
