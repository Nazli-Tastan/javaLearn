package HalukJava.src.j18_Constructor;

import j18_Constructor.C07_Ogrtm;

public class C07_OgrtmRunner {
    public static void main(String[] args) {
        j18_Constructor.C07_Ogrtm hcm=new C07_Ogrtm("SevdeNur Öğretmenim :)",11);
        System.out.println("hcm.isim = " + hcm.isim);//
        System.out.println("hcm.kıdem = " + hcm.kıdem);//
        hcm.kıdemHesapla(13);//
    }
}
