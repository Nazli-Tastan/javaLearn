package j18_Constructor;

public class C07_OgrtmRunner {
    public static <C07_Ogrtm> void main(String[] args) {


            C07_Ogrtm hcm= (C07_Ogrtm) new j18_Constructor.C07_Ogrtm("SevdeNur Öğretmenim :)",11);
            System.out.println("hcm.isim = " + ((j18_Constructor.C07_Ogrtm) hcm).isim);//
            System.out.println("hcm.kıdem = " + ((j18_Constructor.C07_Ogrtm) hcm).kıdem);//
            ((j18_Constructor.C07_Ogrtm) hcm).kıdemHesapla(13);//
        }


    }

